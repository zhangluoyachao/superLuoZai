package com.sc.service.impl;

import com.sc.dao.TopicDao;
import com.sc.dao.impl.TopicDaoImpl;
import com.sc.pojo.Topic;
import com.sc.service.TopicService;
import com.sc.util.JdbcUtil;

import java.sql.SQLException;
import java.util.List;

public class TopicServiceImpl implements TopicService {
    private TopicDao td = new TopicDaoImpl();

    public List<Topic> queryAll() {
        List<Topic> lt = null;
        try {
            lt = td.queryAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        JdbcUtil.close();
        return lt;
    }

    @Override
    public boolean insert(String topicName) {
        boolean b = td.insert(topicName);
        JdbcUtil.close();
        if (b) return true;
        return false;
    }

    @Override
    public boolean updateTopicName(String oldName, String newName) {
        boolean b = td.updateTopicName(oldName, newName);
        JdbcUtil.close();
        if (b) return true;
        return false;
    }
}
