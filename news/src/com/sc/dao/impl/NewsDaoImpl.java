package com.sc.dao.impl;

import com.sc.dao.NewsDao;
import com.sc.pojo.News;

public class NewsDaoImpl implements NewsDao {
    @Override
    public boolean insert(News news) {
        String sql = "insert into news ";
        return false;
    }
}
