package com.sc.dao.impl;

import com.sc.dao.TopicDao;
import com.sc.pojo.Topic;
import com.sc.util.JdbcUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TopicDaoImpl implements TopicDao {
    public boolean insert(String tname) {
        String sql = "insert into Topic values(id_sql.nextval,?)";
        int i = JdbcUtil.update(sql, tname);
        if (i > 0) {
            return true;
        }
        return false;
    }

    public List<Topic> queryAll() throws SQLException {
        String sql = "select * from topic";
        ResultSet rs = JdbcUtil.select(sql);
        List<Topic> t = new ArrayList<>();
        while (rs.next()) {
            t.add(new Topic(rs.getInt("topicid"), rs.getString("topicname")));
        }
        return t;
    }

    public boolean delete(String tName) {
        String sql = "delete topic where topicname = ?";
        int i = JdbcUtil.update(sql, tName);
        if (i == 0) {
            JdbcUtil.close();
            return false;
        }
        return true;
    }

    public boolean updateTopicName(String oldName, String newName) {
        String sql = "update topic set topicname = ? where topicname = ?";
        int i = JdbcUtil.update(sql, newName, oldName);
        if (i > 0)
            return true;
        return false;
    }
}
