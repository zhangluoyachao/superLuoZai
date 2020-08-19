package com.sc.service.impl;

import com.sc.dao.VideoDao;
import com.sc.dao.impl.VideoDaoImpl;
import com.sc.pojo.Video;
import com.sc.service.VideoService;

import java.sql.SQLException;

public class VideoServiceImpl implements VideoService {
    VideoDao vd = new VideoDaoImpl();

    @Override
    public Video getVideo(String name) {
        Video result = null;
        try {
            result = vd.getVideo(name);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}
