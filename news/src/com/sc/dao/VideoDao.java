package com.sc.dao;

import com.sc.pojo.Video;

import java.sql.SQLException;

public interface VideoDao {
    Video getVideo(String name) throws SQLException;
}
