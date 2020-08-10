package com.sc.dao;

import com.sc.pojo.Topic;

import java.sql.SQLException;
import java.util.List;

public interface TopicDao {
    boolean insert(String tname);

    List<Topic> queryAll() throws SQLException;

    boolean delete(String tName);

    boolean updateTopicName(String oldName, String newName);
}
