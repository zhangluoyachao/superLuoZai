package com.sc.dao;

import com.sc.pojo.Topic;

import java.sql.SQLException;
import java.util.List;

public interface TopicDao {
    boolean insert(String tname);

    List<Topic> queryAll() throws SQLException;

    boolean delete(int tName);

    boolean updateTopicName(int oldId, String newName);

    //查询总条数
    Integer queryCount() throws SQLException;

    //分页查询
    List<Topic> rownumQueryAll(Integer pageIndex, Integer pageSize) throws SQLException;

    List<Topic> queryByIndex(Integer start, Integer end) throws SQLException;
}
