package com.sc.dao;

import com.sc.pojo.Record;

import java.sql.SQLException;
import java.util.List;

public interface RecordDao {
    int insert(Record record);

    List<Record> getRecord(String cardNo) throws SQLException;

    List<Record> getPage(String cardNo, Integer pageIndex, Integer pageSize) throws SQLException;

    int getCount(String cardNo) throws SQLException;
}
