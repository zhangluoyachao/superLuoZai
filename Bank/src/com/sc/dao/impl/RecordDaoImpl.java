package com.sc.dao.impl;

import com.sc.dao.RecordDao;
import com.sc.pojo.Record;
import com.sc.util.JdbcUtil;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RecordDaoImpl implements RecordDao {
    @Override
    public int insert(Record record) {
        String sql = "insert into record values(id_seq.nextval,?,sysdate,?,?,?,?,?)";
        return JdbcUtil.update(sql, record.getCardNo(), record.getExpense(), record.getIncome(),
                record.getBalance(), record.getTran_type(), record.getRemark());
    }

    @Override
    public List<Record> getRecord(String cardNo) throws SQLException {
        String sql = "select * from record where cardNo=?";
        List<Record> result = new ArrayList<>();
        ResultSet rs = JdbcUtil.select(sql, cardNo);
        while (rs.next()) {
            int id = rs.getInt("id");
            String cardNo1 = rs.getString("cardNo");
            Date tran_date = rs.getDate("tran_date");
            double expense = rs.getDouble("expense");
            double income = rs.getDouble("income");
            double balance = rs.getDouble("balance");
            String tran_type = rs.getString("tran_type");
            String remark = rs.getString("remark");

            Record record = new Record(id, cardNo1, tran_date, expense, income, balance, tran_type, remark);
            result.add(record);
        }
        return result;
    }

    @Override
    public List<Record> getPage(String cardNo, Integer pageIndex, Integer pageSize) throws SQLException {
        String sql = "select * from (select re.*,rownum r from record re where cardNo=?) where r between ? and ?";
        List<Record> result = new ArrayList<>();
        ResultSet rs = JdbcUtil.select(sql, cardNo, (pageIndex - 1) * pageSize + 1, pageIndex * pageSize);
        while (rs.next()) {
            int id = rs.getInt("id");
            String cardNo1 = rs.getString("cardNo");
            Date tran_date = rs.getDate("tran_date");
            double expense = rs.getDouble("expense");
            double income = rs.getDouble("income");
            double balance = rs.getDouble("balance");
            String tran_type = rs.getString("tran_type");
            String remark = rs.getString("remark");

            Record record = new Record(id, cardNo1, tran_date, expense, income, balance, tran_type, remark);
            result.add(record);
        }
        return result;
    }

    @Override
    public int getCount(String cardNo) throws SQLException {
        String sql = "select count(1) from record where cardNo=?";
        ResultSet rs = JdbcUtil.select(sql, cardNo);
        int result = 0;
        if (rs.next())
            result = rs.getInt(1);
        return result;
    }
}
