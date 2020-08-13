package com.sc.service;

import com.sc.pojo.News;
import com.sc.util.Page;

import java.util.List;

public interface NewsService {
    boolean insert(News n);

    List<News> queryAll();

    Page<News> getPageNews(Integer pageIndex, Integer pageSize);

    Page<News> getPageNews(Integer tid, Integer pageIndex, Integer pageSize);
}
