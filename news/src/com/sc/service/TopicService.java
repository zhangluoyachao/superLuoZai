package com.sc.service;

import com.sc.pojo.Topic;

import java.util.List;

public interface TopicService {
    List<Topic> queryAll();

    boolean insert(String topicName);

    boolean updateTopicName(int oldId, String newName);

    boolean delete(int tid);
}
