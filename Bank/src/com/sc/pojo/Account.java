package com.sc.pojo;

public class Account {

    private String cardNo;
    private String password;
    private Double balance;//余额
    private Integer status;//状态 1为正常 0为冻结
    private String avatar;


    public Account(String cardNo, String password, Double balance, Integer status, String avatar) {
        this.cardNo = cardNo;
        this.password = password;
        this.balance = balance;
        this.status = status;
        this.avatar = avatar;
    }

    public Account(String cardNo, String password, String avatar) {
        this.cardNo = cardNo;
        this.password = password;
        this.avatar = avatar;
    }

    public Account() {
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
