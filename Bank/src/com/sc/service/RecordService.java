package com.sc.service;

import com.sc.pojo.Record;

import java.util.List;

public interface RecordService {

    List<Record> getRecord(String cardNo);

    List<Record> getPage(String cardNo, Integer pageIndex, Integer pageSize);

    int getCount(String cardNo);
}
