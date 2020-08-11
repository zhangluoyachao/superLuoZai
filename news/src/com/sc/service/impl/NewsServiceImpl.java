package com.sc.service.impl;

import com.sc.dao.NewsDao;
import com.sc.dao.impl.NewsDaoImpl;
import com.sc.pojo.News;
import com.sc.service.NewsService;
import com.sc.util.JdbcUtil;

import java.sql.SQLException;
import java.util.List;

public class NewsServiceImpl implements NewsService {
    NewsDao nd = new NewsDaoImpl();

    @Override
    public boolean insert(News n) {
        boolean b = nd.insert(n);
        JdbcUtil.close();
        if (b)
            return true;
        return false;
    }

    @Override
    public List<News> queryAll() {
        List<News> list = null;
        try {
            list = nd.queryAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        JdbcUtil.close();
        return list;
    }
}
