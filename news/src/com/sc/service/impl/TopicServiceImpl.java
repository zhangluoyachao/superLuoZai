package com.sc.service.impl;

import com.sc.dao.TopicDao;
import com.sc.dao.impl.TopicDaoImpl;
import com.sc.pojo.Topic;
import com.sc.service.TopicService;
import com.sc.util.JdbcUtil;
import com.sc.util.Page;

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
    public boolean updateTopicName(int oldId, String newName) {
        boolean b = td.updateTopicName(oldId, newName);
        JdbcUtil.close();
        if (b) return true;
        return false;
    }

    @Override
    public boolean delete(int tid) {
        boolean b = td.delete(tid);
        JdbcUtil.close();
        if (b) return true;
        return false;
    }

    @Override
    public Page<Topic> getTopicPage(Integer pageIndex, Integer pageSize) {
        Page<Topic> page = new Page<>();
        Integer totalCount = null;
        List<Topic> list = null;
        try {
            totalCount = td.queryCount();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        JdbcUtil.close();
        page.setPageSize(pageSize);
        page.setTotalCount(totalCount);
        page.setPageIndex(pageIndex);

        try {
            list = td.rownumQueryAll(pageIndex, pageSize);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        JdbcUtil.close();
        page.setList(list);
        return page;
    }
}
