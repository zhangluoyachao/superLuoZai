package day19;

import doudou5G.User;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class TestReflect {
    @Test
    public void test1() {
        //1、Class对象     Class.forName   类.class
//Class.forName("全类名");

        Class userClass = null;
        try {
            userClass = Class.forName("doudou5G.User");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
//获取类名
        userClass.getName();//获取全类名

        userClass.getSimpleName();//获取类名
//获取方法
        //动态获取类的所有方法（1、自己的  2、所有的：自己的+继承来的）
        Method[] ucMethods = userClass.getDeclaredMethods();//自己的所有方法

        Method[] ucMethods2 = userClass.getMethods();//自己的所有方法+继承来的

        for (Method m : ucMethods2) {
            System.out.println("方法名：" + m.getName() + "，返回值:" + m.getReturnType()
                    + "，参数列表：" + Arrays.toString(m.getParameterTypes()));
        }

        //获取一个方法 所有的
        try {
            userClass.getMethod("setUseName", String.class);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        //和上面相同 获取一个方法 自己的
        // userClass.getDeclaredMethod();

//获取父类
        Class superClass = userClass.getSuperclass();

//构造方法
        //获取自己的所有构造方法（不包括父类）
        Constructor[] cons = userClass.getDeclaredConstructors();
        //返回值为 Constructor集合

        //获取构造方法    public公开的
        Constructor[] cons2 = userClass.getConstructors();
        for (Constructor c : cons2) {
            System.out.println(c.getName() + Arrays.toString(c.getParameterTypes()));
        }

        //获取一个构造方法
        try {
            Constructor con = userClass.getDeclaredConstructor();//获取一个构造方法，参数可以为任意 即可以为类的各种有参构造
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        //同上 必须为public的构造方法
        try {
            Constructor con2 = userClass.getConstructor();//获取一个构造方法，参数可以为任意 即可以为类的各种有参构造
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

//获取属性
        //获取所有属性    返回值为Field[]数组  不加Declared则只能访问public公开的
        Field[] fields = userClass.getDeclaredFields();
        for (Field f : fields) {
            try {
                System.out.println(f.getName() + " " + f.getType() + " " + f.get(f.getName()));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }


    }

    @Test
    public void test2() {
        //类.class获取class对象
        Class userClass = User.class;
    }

    @Test
    public void test3() {
        //通过反射创建对象
        Class<User> userClass = User.class;
        //创建
        try {
            //底层实现会调用构造方法 可以为有参可以无参
            //如果没有无参构造，会提示InstantiationException
            User u = userClass.newInstance();

            //通过无参构造创建
            Constructor con = userClass.getDeclaredConstructor();
            User u2 = (User) con.newInstance();

            //通过有参构造
            Constructor con2 = userClass.getDeclaredConstructor(Integer.class);
            //因为调用了有参构造，所以说需要传入参数，不传会报错
            //IllegalArgumentException: wrong number of arguments
            User u3 = (User) con2.newInstance("1", "2");

        } catch (InstantiationException e) {//实例化异常
            e.printStackTrace();
        } catch (IllegalAccessException e) {//访问权限
            e.printStackTrace();
        } catch (NoSuchMethodException e) {//没找到方法时报的异常
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test4() {


        try {
            //反射中修改的属性，如果是私有的，需要设置权限
            Class<User> uc = User.class;
            Field f = uc.getDeclaredField("useName");
            f.setAccessible(true);//设置可以访问私有属性
            //修改对象属性值 set() 获取get()
            //set(对象，值)     get(对象)
            User u = uc.newInstance();
            f.set(u, "李四");
            System.out.println(f.get(u));

            //通过反射调用方法
            Method m = uc.getMethod("setUseName", String.class);
            //调用对象的方法   m.invoke(对象，参数)；
            m.invoke(u, "张三");
            System.out.println(u.getUseName());
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

    }
}
