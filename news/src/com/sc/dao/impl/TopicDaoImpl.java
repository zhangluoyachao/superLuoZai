package com.sc.dao.impl;

import com.sc.pojo.Topic;
import com.sc.util.JdbcUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TopicDaoImpl {
    public static void insert(Topic t) {
        String sql = "insert into Topic values(id_sql.nextval,?)";
        JdbcUtil.update(sql, t.getTopicName());
        JdbcUtil.close();
    }

    public static List<Topic> queryAll() {
        String sql = "select * from topic";
        ResultSet rs = JdbcUtil.select(sql);
        List<Topic> t = new ArrayList<>();
        try {
            while (rs.next()) {
                t.add(new Topic(rs.getInt("topicid"), rs.getString("topicname")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        JdbcUtil.close();
        return t;
    }

    public static boolean delete(String tName) {
        String sql = "delete topic where topicname = ?";
        int i = JdbcUtil.update(sql, tName);
        if (i == 0) {
            JdbcUtil.close();
            return false;
        }
        JdbcUtil.close();
        return true;
    }

    public static void updateTopicName(String oldName, String newName) {
        String sql = "update topic set topicname = ? where topicname = ?";
        JdbcUtil.update(sql, newName, oldName);
        JdbcUtil.close();
    }
}
