package day13;

import java.util.Comparator;

public class User implements Comparable<User> {
    private Integer id;
    private String name;
    private String username;
    private int password;

    public User() {
    }

    public User(Integer id, String name, String username, int password) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
    }

    @Override
    public int compareTo(User o) {
        //this==>o1 o==>o2
        return this.getId() - o.getId();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "用户{" +
                "id=" + id +
                ", 姓名='" + name + '\'' +
                ", 用户名='" + username + '\'' +
                ", 密码='" + password + '\'' +
                '}';
    }

}

class Com implements Comparator<User> {
    //外部比较 单独创建一个类 去实现User对象的比较规则
    //1、实现Comparator接口
    //2、实现compare方法

    @Override
    public int compare(User o1, User o2) {
        //返回值决定了排序顺序    正序  倒序  相同
        //o1.getId()-o2.getId() 正序
        //o2.getId()-o1.getId() 倒序
        return o1.getId() - o2.getId();
    }
}