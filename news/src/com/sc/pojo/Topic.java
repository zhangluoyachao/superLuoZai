package com.sc.pojo;

/**
 * @program: javaee
 * 描述：
 * @author: NB
 * @create: 2020-08-07 20:03
 **/
public class Topic {
    private int id;
    private String topicName;

    public Topic() {
    }

    public Topic(String topicName) {

        this.topicName = topicName;
    }

    public Topic(int id, String topicName) {
        this.id = id;
        this.topicName = topicName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }
}
