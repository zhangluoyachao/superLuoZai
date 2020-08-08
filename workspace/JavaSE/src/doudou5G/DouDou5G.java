package doudou5G;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DouDou5G {
    static Scanner sc = new Scanner(System.in);
    static List<User> listUser = input();
    /*
        一级界面子界面
    */


    /*
        一级界面
    */
    public static void main(String[] args) {//一级界面
        System.out.println("————————————欢迎进入XX系统————————————");
        while (true) {
            System.out.print("1、注册\n2、登录\n请选择您选择的功能:");
            String n = sc.next();
            int choose = numCheck(n);
            if (choose == 1) {
                register();
                break;
            } else if (choose == 2) {
                login();
                break;
            } else System.out.println("\n输入错误请重新输入！");
        }
    }


    /*
        二级界面
    */

    //注册界面
    public static void register() {//注册
        //对账号进行判断，如果存在，则提示存在重新输入
        System.out.println("\n———————————————用户注册———————————————");
        String useName = "";
        String passWord = "";
        boolean b = true;
        do {
            System.out.print("请输入账户名:");
            useName = sc.next();
            System.out.print("请输入密码:");
            passWord = sc.next();
            if (listUser.size() == 0) {
                break;
            } else {
                for (User u : listUser) {
                    if (u.getUseName().equals(useName)) {
                        System.out.println("\n———————— 用户名存在！请重新输入！ ————————");
                        b = true;
                        break;
                    }
                    b = false;
                }
            }
        } while (b);
        //输入年龄
        System.out.print("请输入您的年龄：");
        int age = sc.nextInt();
        //ID
        //ID方法有很多
        //1、时间戳
        //2、算法
        //3、UUID
        StringBuilder a = new StringBuilder();
        int id = listUser.get(listUser.size() - 1).getId() + 1;
        //生成用户
        User u = new User(useName, passWord, age, id);
        listUser.add(u);
        //刷新listUser
        reListUser();
        System.out.println("\n生成用户中，请稍后。。。 。。。");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("\n恭喜你注册成功！\n是否前往登录页面(输入y前往，输入其他字符退出系统):");
        String yn1 = sc.next();
        if (yn1.equalsIgnoreCase("y")) {
            login();
        } else {
            exits();
        }
    }

    //登录界面
    public static void login() {
        //登录主界面
        System.out.println("\n———————————————用户登录———————————————");
        String useName;
        String passWord;
        User u = null;
        a:
        while (true) {
            System.out.print("请输入账户:");
            useName = sc.next();
            System.out.print("请输入密码:");
            passWord = sc.next();
            boolean b = true;
            for (User a : listUser) {
                if (a.getUseName().equals(useName) && a.getPassWord().equals(passWord)) {
                    u = a;
                    b = false;
                    System.out.println("\n登录成功！");
                    break a;
                }
            }
            if (b) {
                System.out.print("\n登录失败!账号不存在或者密码错误！是否重新输入？（输入y重新输入，输入其他字符退出系统）：");
                String yn = sc.next();
                char ch = chooseCheck(yn);
                switch (ch) {
                    case 'y':
                        break;
                    default:
                        exits();
                }
            }
        }
        //判断登录用户身份
        if (u.getId() == 1) {//管理员
            admin(u);
        } else {//普通用户
            if (u.isB())
                user(u);
            else {
                System.out.println("\n您的账号已被禁用！请联系管理员！");
                exits();
            }
        }

    }


    /*
        二级界面子界面
    */
    //通用功能

    //用户界面
    public static void user(User u) {
        System.out.println("\n————————————用户界面————————————");
        a:
        while (true) {
            System.out.print("1、用户信息\n2、修改密码\n3、用户退出\n请选择功能：");
            String n = sc.next();
            int num = numCheck(n);
            switch (num) {
                case 1:
                    information(u);
                    break a;
                case 2:
                    changePassword(u);
                    break a;
                case 3:
                    exits();
                    break a;
                default:
                    System.out.println("\n您输入错误请重新输入");
            }
        }

    }

    //管理员界面
    public static void admin(User u) {
        System.out.println("\n————————————管理员界面————————————");
        a:
        while (true) {
            System.out.print("1、用户信息\n2、修改密码\n3.禁用/启用 用户\n4.开除用户\n5、用户退出\n请选择功能：");
            String n = sc.next();
            int num = numCheck(n);
            switch (num) {
                case 1:
                    information(u);
                    break a;
                case 2:
                    changePassword(u);
                    break a;
                case 3:
                    ON_OFF(u);
                    break a;
                case 4:
                    expel(u);
                    break a;
                case 5:
                    exits();
                    break a;
                default:
                    System.out.println("\n您输入错误请重新输入");
            }
        }

    }

    //信息展示
    public static void information(User u) {
        String str = "";

        if (u.getId() == 1)
            System.out.println("\n————————————" + u.getUseName() + "的信息————————————");
        else
            System.out.println("\n————————————管理员信息————————————");
        if (u.isB())
            str = "启用";
        else
            str = "禁用";

        System.out.println("编号：" + u.getId() + "\n账户名：" + u.getUseName()
                + "\n年龄：" + u.getAge() + "\n状态：" + str);
        returnSecondMenu(u);//返回二级菜单
    }

    //修改密码
    public static void changePassword(User u) {
        System.out.println("\n————————————修改密码————————————");
        String oldPw;
        String newPw;
        while (true) {
            System.out.print("请输入原密码:");
            oldPw = sc.next();
            if (oldPw.equals(u.getPassWord())) {

                break;
            }
            System.out.println("\n密码输入错误！请重新输入！");
        }
        System.out.print("请输入新密码：");
        newPw = sc.next();
        u.setPassWord(newPw);
        //刷新listUser
        reListUser();
        System.out.println("\n密码修改成功！");
        //返回二级菜单
        returnSecondMenu(u);
    }

    //管理员功能
    //禁用/启用
    public static void ON_OFF(User admin) {
        System.out.println("\n————————————禁用/启用————————————");
        User u = null;
        a:
        while (true) {
            System.out.print("请输入禁用/启用用户的用户名:");
            String str = sc.next();
            boolean b = false;

            for (User a : listUser) {
                if (a.getUseName().equals(str)) {
                    u = a;
                    b = true;
                    break a;
                }
            }
            if (!b) {
                System.out.println("\n该用户名不存在，请重新输入");
            }
        }
        if (u.isB()) {
            System.out.print("\n该用户为启用状态，是否禁用?(输入y禁用，输入其他字符返回上一级菜单):");
            String yn = sc.next();
            char ch = chooseCheck(yn);
            if (ch == 'y') {
                u.setB(false);
                output(listUser);
            } else {
                returnSecondMenu2(admin);
            }
        } else {
            System.out.print("\n该用户为禁用状态，是否启用?(输入y启用，输入其他字符返回上一级菜单):");
            String yn = sc.next();
            char ch = chooseCheck(yn);
            if (ch == 'y') {
                u.setB(true);
                //刷新listUser
                reListUser();
            } else {
                returnSecondMenu2(admin);
            }
        }
        returnSecondMenu(admin);

    }

    //开除功能
    public static void expel(User admin) {
        System.out.println("\n————————————开除用户————————————");
        User u = null;
        a:
        while (true) {
            System.out.print("请输入删除用户的用户名:");
            String str = sc.next();
            boolean b = false;

            for (User a : listUser) {
                if (a.getUseName().equals(str)) {
                    u = a;
                    b = true;
                    break a;
                }
            }
            if (!b) {
                System.out.println("\n该用户名不存在，请重新输入!");
            }
        }
        System.out.println("————————————删除用户信息————————————");
        String str;
        if (u.isB())
            str = "启用";
        else
            str = "禁用";
        System.out.println("编号：" + u.getId() + "\n账户名：" + u.getUseName()
                + "\n年龄：" + u.getAge() + "\n状态：" + str);

        System.out.print("\n确认删除该用户吗？(输入y删除，输入其他字符返回上一级菜单):");
        String yn = sc.next();

        if (chooseCheck(yn) == 'y') {
            listUser.remove(u);
            //刷新listUser
            reListUser();
        } else {
            returnSecondMenu2(admin);
        }
        returnSecondMenu(admin);
    }

    //退出程序
    public static void exits() {
        //刷新User.txt
        output(listUser);
        System.out.println("\n———————————————退出程序！———————————————");
        System.exit(0);
    }

    //------------------工具方法-------------------------
    //返回二级菜单（选择）
    public static void returnSecondMenu(User u) {
        boolean b;
        if (u.getId() == 1) {
            b = true;
        } else {
            b = false;
        }
        System.out.print("\n是否返回上一级菜单?（输入y返回上一级菜单，输入其他字符退出系统）:");
        String yn = sc.next();
        char ch = chooseCheck(yn);
        if (ch == 'y') {
            if (b)
                admin(u);
            else
                user(u);
        } else exits();
    }

    //返回二级菜单（无选择）
    public static void returnSecondMenu2(User u) {
        boolean b;
        if (u.getId() == 1) {
            b = true;
        } else {
            b = false;
        }
        if (b)
            admin(u);
        else
            user(u);
    }

    //刷新listUser
    public static void reListUser() {
        output(listUser);

    }

    //将对象序列化
    public static void output(List list) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        File file = null;
        try {
            file = new File("D:\\IO");
            fos = new FileOutputStream("D:\\IO\\user.txt");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
        } catch (FileNotFoundException e) {
            file.mkdirs();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            outputClose(oos, fos);
        }

    }

    //反序列化
    public static List<User> input() {
        File file = null;
        File file2 = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        List<User> list = null;

        try {
            //判断文件和其目录的存在情况，不存在则创建
            file = new File("D:\\IO\\user.txt");
            file2 = new File("D:\\IO");
            if (!file2.exists()) {
                file2.mkdirs();
            }
            if (!file.exists()) {
                file.createNewFile();
            }
            //新创建的文件直接写入新数组 新数组中含有一个默认管理员
            //用户名admin,密码admin,ID1
            if (file.length() == 0) {
                list = new ArrayList<>();
                list.add(new User("admin", "admin", 0, 1));
                output(list);
            } else {
                //如果文件不为新创建则正常读取
                fis = new FileInputStream(file);
                ois = new ObjectInputStream(fis);
                list = (List<User>) ois.readObject();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            inputClose(ois, fis);//按照顺序来填写
        }
        return list;
    }

    //输出流的关闭
    public static void inputClose(InputStream... is) {//is是一个InputStream数组
        for (InputStream a : is) {
            try {
                if (a != null) a.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //输入流的关闭
    public static void outputClose(OutputStream... is) {
        //is是一个InputStream数组
        for (OutputStream a : is) {
            try {
                if (a != null) a.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //判断输入格式是否为一个字符
    public static boolean Check(String str) {
        if (str.length() == 1) {
            return true;
        }
        return false;
    }

    //判断输入数字格式是否正确(1-5) 并返回相应数字
    public static int numCheck(String str) {
        if (Check(str)) {
            if (str.equals("1"))
                return 1;
            else if (str.equals("2"))
                return 2;
            else if (str.equals("3"))
                return 3;
            else if (str.equals("4"))
                return 4;
            else if (str.equals("5"))
                return 5;
            else
                return -1;

        } else return -1;
    }

    //判断输入的是否为y
    public static char chooseCheck(String str) {
        if (Check(str)) {
            if (str.equalsIgnoreCase("y"))
                return 'y';
        }
        return 'f';
    }
}
