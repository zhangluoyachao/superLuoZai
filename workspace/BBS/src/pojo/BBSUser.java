package pojo;

import java.sql.Date;

public class BBSUser {
    private Integer useID;
    private String nickName;
    private String loginName;
    private String loginPWD;
    private String headImg;
    private Date createTime;

    public BBSUser(String nickName, String loginName, String loginPWD, String headImg) {
        this.nickName = nickName;
        this.loginName = loginName;
        this.loginPWD = loginPWD;
        this.headImg = headImg;
    }

    public BBSUser() {
    }

    public BBSUser(Integer useID, String nickName, String loginName, String loginPWD, String headImg, Date createTime) {
        this.useID = useID;
        this.nickName = nickName;
        this.loginName = loginName;
        this.loginPWD = loginPWD;
        this.headImg = headImg;
        this.createTime = createTime;
    }

    public Integer getUseID() {
        return useID;
    }

    public void setUseID(Integer useID) {
        this.useID = useID;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPWD() {
        return loginPWD;
    }

    public void setLoginPWD(String loginPWD) {
        this.loginPWD = loginPWD;
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
