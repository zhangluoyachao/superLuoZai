package com.sc.dao.impl;

import com.sc.dao.NewsDao;
import com.sc.pojo.News;
import com.sc.util.JdbcUtil;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NewsDaoImpl implements NewsDao {
    @Override
    public boolean insert(News n) {
        String sql = "insert into news values(id_seq.nextval,?,?,?,?,?,?,?)";
        int i = JdbcUtil.update(sql, n.getTitle(), n.getAuthor(), n.getSummary(), n.getContent(), n.getT_id(), n.getTime(), n.getFile());
        JdbcUtil.close();
        if (i > 0)
            return true;
        return false;
    }

    @Override
    public List<News> queryAll() throws SQLException {
        String sql = "select * from news";
        ResultSet rs = JdbcUtil.select(sql);
        List<News> list = new ArrayList<>();
        while (rs.next()) {
            int id = rs.getInt("id");
            String title = rs.getString("title");
            String author = rs.getString("author");
            String summary = rs.getString("summary");
            String content = rs.getString("content");
            Date time = rs.getDate("time");
            int t_id = rs.getInt("t_id");
            String file = rs.getString("file");

            News n = new News(id, title, author, summary, content, t_id, time, file);
            list.add(n);
        }
        JdbcUtil.close();

        return list;
    }

    @Override
    public List<News> getPageNews(Integer pageIndex, Integer pageSize) throws SQLException {
        List<News> page = new ArrayList<>();
        String sql = "select * from (select n.*,rownum r from news n) where r between ? and ?";
        ResultSet rs = JdbcUtil.select(sql, (pageIndex - 1) * pageSize + 1, pageIndex * pageSize);
        while (rs.next()) {
            int id = rs.getInt("id");
            String title = rs.getString("title");
            String author = rs.getString("author");
            String summary = rs.getString("summary");
            String content = rs.getString("content");
            int t_id = rs.getInt("t_id");
            Date time = rs.getDate("time");
            String file = rs.getString("file");
            News news = new News(id, title, author, summary, content, t_id, time, file);
            page.add(news);
        }
        return page;
    }

    @Override
    public List<News> getPageNews(Integer tid, Integer pageIndex, Integer pageSize) throws SQLException {
        List<News> page = new ArrayList<>();
        String sql = "select * from (select n.*,rownum r from news n where t_id=?) where r between ? and ?";
        ResultSet rs = JdbcUtil.select(sql, tid, (pageIndex - 1) * pageSize + 1, pageIndex * pageSize);
        while (rs.next()) {
            int id = rs.getInt("id");
            String title = rs.getString("title");
            String author = rs.getString("author");
            String summary = rs.getString("summary");
            String content = rs.getString("content");
            int t_id = rs.getInt("t_id");
            Date time = rs.getDate("time");
            String file = rs.getString("file");
            News news = new News(id, title, author, summary, content, t_id, time, file);
            page.add(news);
        }
        return page;
    }

    @Override
    public int getDateCount() throws SQLException {
        String sql = "select count(1) from news";
        ResultSet rs = JdbcUtil.select(sql);
        if (rs.next())
            return rs.getInt(1);
        return 0;
    }

}
