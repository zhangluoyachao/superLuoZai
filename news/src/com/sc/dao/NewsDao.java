package com.sc.dao;

import com.sc.pojo.News;

import java.sql.SQLException;
import java.util.List;

public interface NewsDao {
    boolean insert(News n);

    List<News> queryAll() throws SQLException;

    List<News> getPageNews(Integer pageIndex, Integer pageSize) throws SQLException;

    List<News> getPageNews(Integer tid, Integer pageIndex, Integer pageSize) throws SQLException;

    int getDateCount() throws SQLException;

    int getDateCount(Integer tid) throws SQLException;

}
