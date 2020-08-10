package com.sc.pojo;

import java.sql.Date;

/**
 * @program: javaee
 * 描述：
 * @author: NB
 * @create: 2020-08-07 20:03
 **/
public class News {
    private int id;
    private String title;
    private String author;
    private String summary;
    private String content;
    private Date time;
    private Integer t_id;

    private Topic topic;//外键连接的Topic

    public News() {
    }


    public News(int id, String title, String author, String summary, String content, Date time, Integer t_id, Topic topic) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.summary = summary;
        this.content = content;
        this.time = time;
        this.t_id = t_id;
        this.topic = topic;
    }

    public News(String title, String author, String summary, String content, Date time, Integer t_id) {
        this.title = title;
        this.author = author;
        this.summary = summary;
        this.content = content;
        this.time = time;
        this.t_id = t_id;
    }


    public News(int id, String title, String author, String summary, String content, Date time) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.summary = summary;
        this.content = content;
        this.time = time;
    }

    public Integer getT_id() {
        return t_id;
    }

    public void setT_id(Integer t_id) {
        this.t_id = t_id;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        News news = (News) o;

        if (id != news.id) return false;
        if (title != null ? !title.equals(news.title) : news.title != null) return false;
        if (author != null ? !author.equals(news.author) : news.author != null) return false;
        if (summary != null ? !summary.equals(news.summary) : news.summary != null) return false;
        if (content != null ? !content.equals(news.content) : news.content != null) return false;
        if (time != null ? !time.equals(news.time) : news.time != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (summary != null ? summary.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
        return result;
    }
}
