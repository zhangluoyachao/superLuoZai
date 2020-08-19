package com.sc.dao.impl;

import com.sc.dao.VideoDao;
import com.sc.pojo.Video;
import com.sc.util.JdbcUtil;

import java.sql.ResultSet;
import java.sql.SQLException;

public class VideoDaoImpl implements VideoDao {
    @Override
    public Video getVideo(String name) throws SQLException {
        String sql = "select * from video where videoName=?";
        ResultSet rs = JdbcUtil.select(sql, name);
        Video result = null;
        while (rs.next()) {
            int videoId = rs.getInt("videoId");
            int upvoteCount = rs.getInt("upvoteCount");
            String path = rs.getString("path");
            result = new Video(videoId, upvoteCount, name, path);
        }
        return result;
    }
}
