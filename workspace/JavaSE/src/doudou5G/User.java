package doudou5G;

import java.io.Serializable;

public class User implements Serializable {
    public static final long serialVersionUID = 112334554321321L;
    private String useName;
    private String passWord;
    private int age;
    private int id;
    private boolean b = true;

    public User() {
    }

    public User(String useName, String passWord) {
        this.useName = useName;
        this.passWord = passWord;
    }

    public User(int id) {
        this.id = id;
    }

    public User(String useName, String passWord, int id) {
        this.useName = useName;
        this.passWord = passWord;
        this.id = id;
    }

    public User(String useName, String passWord, int age, int id) {
        this.useName = useName;
        this.passWord = passWord;
        this.age = age;
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                '}';
    }


    public boolean isB() {
        return b;
    }

    public void setB(boolean b) {
        this.b = b;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUseName() {
        return useName;
    }

    public void setUseName(String useName) {
        this.useName = useName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
