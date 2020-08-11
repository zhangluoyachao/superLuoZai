package com.sc.service;

import com.sc.pojo.News;

import java.util.List;

public interface NewsService {
    boolean insert(News n);

    List<News> queryAll();
}
