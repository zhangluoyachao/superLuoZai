package day19.HomeWork;

import doudou5G.User;
import org.junit.Test;

import java.io.*;
import java.util.List;

public class Test1 {
    @Test
    public void test1() throws CloneNotSupportedException {
        //第一种   直接通过new
        Person p = new Person();
        //第二种   通过克隆
        Person p2 = (Person) p.clone();
        //第三种   通过反序列化
        try {
            FileInputStream fis = new FileInputStream("d:IO\\user.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            List<User> userList = (List<User>) ois.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //第四种   通过反射
        //创建类的Class类
//        Class<Person> personClass = Object.class();
        //通过构造方法

    }
}

class Person implements Cloneable, Serializable {
    private int id;
    private String name;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}