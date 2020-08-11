package com.sc.dao;

import com.sc.pojo.News;

import java.sql.SQLException;
import java.util.List;

public interface NewsDao {
    boolean insert(News n);

    List<News> queryAll() throws SQLException;
}
