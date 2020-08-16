package com.sc.service.impl;

import com.sc.dao.AccountDao;
import com.sc.dao.RecordDao;
import com.sc.dao.impl.AccountDaoImpl;
import com.sc.dao.impl.RecordDaoImpl;
import com.sc.pojo.Record;
import com.sc.service.RecordService;

import java.sql.SQLException;
import java.util.List;

public class RecordServiceImpl implements RecordService {
    RecordDao rd = new RecordDaoImpl();
    AccountDao ad = new AccountDaoImpl();

    @Override
    public List<Record> getRecord(String cardNo) {
        List<Record> result = null;
        try {
            result = rd.getRecord(cardNo);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public List<Record> getPage(String cardNo, Integer pageIndex, Integer pageSize) {
        List<Record> result = null;
        try {
            result = rd.getPage(cardNo, pageIndex, pageSize);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int getCount(String cardNo) {
        int result = 0;
        try {
            result = rd.getCount(cardNo);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}
