package day2;

import java.util.Date;

public class aUser {
    private Integer id;
    private String name;
    private Integer cards;
    private Date time;
    private char sex;

    public aUser(Integer id, String name, Integer cards, Date time, char sex) {
        this.id = id;
        this.name = name;
        this.cards = cards;
        this.time = time;
        this.sex = sex;
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

    public Integer getCards() {
        return cards;
    }

    public void setCards(Integer cards) {
        this.cards = cards;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "aUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cards=" + cards +
                ", time=" + time +
                ", sex=" + sex +
                '}';
    }
}
