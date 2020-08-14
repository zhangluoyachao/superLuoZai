package com.sc.pojo;

import java.sql.Date;

public class Record {
    private Integer id;
    private String cardID;
    private Date tran_date;
    private Double expense;//支出
    private Double income;//收入
    private Double balance;//余额
    private String tran_type;//交易类型
    private String remark;//备注

    public Record(Integer id, String cardID, Date tran_date, Double expense, Double income, Double balance, String tran_type, String remark) {
        this.id = id;
        this.cardID = cardID;
        this.tran_date = tran_date;
        this.expense = expense;
        this.income = income;
        this.balance = balance;
        this.tran_type = tran_type;
        this.remark = remark;
    }

    public Record(String cardID, Double expense, Double income, Double balance, String tran_type, String remark) {
        this.cardID = cardID;
        this.expense = expense;
        this.income = income;
        this.balance = balance;
        this.tran_type = tran_type;
        this.remark = remark;
    }

    public Record() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCardID() {
        return cardID;
    }

    public void setCardID(String cardID) {
        this.cardID = cardID;
    }

    public Date getTran_date() {
        return tran_date;
    }

    public void setTran_date(Date tran_date) {
        this.tran_date = tran_date;
    }

    public Double getExpense() {
        return expense;
    }

    public void setExpense(Double expense) {
        this.expense = expense;
    }

    public Double getIncome() {
        return income;
    }

    public void setIncome(Double income) {
        this.income = income;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getTran_type() {
        return tran_type;
    }

    public void setTran_type(String tran_type) {
        this.tran_type = tran_type;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
