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
        int i = JdbcUtil.update(sql, n.getTitle(), n.getAuthor(), n.getSummary(), n.getContent(), n.getTime(), n.getT_id(), n.getFile());
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

            News n = new News(id, title, author, summary, content, time, t_id, file);
            list.add(n);
        }
        JdbcUtil.close();

        return list;
    }
}
