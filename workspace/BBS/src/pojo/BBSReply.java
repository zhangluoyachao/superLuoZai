package pojo;

import java.sql.Date;

//答复
public class BBSReply {
    private Integer rid;//回复 id
    private String rContent;//回复内容
    private Integer tid;//话题id
    private Date createDate;//创建时间
    private Integer replyUser;//回帖人

    public BBSReply(Integer rid, String rContent, Integer tid, Date createDate, Integer replyUser) {
        this.rid = rid;
        this.rContent = rContent;
        this.tid = tid;
        this.createDate = createDate;
        this.replyUser = replyUser;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getrContent() {
        return rContent;
    }

    public void setrContent(String rContent) {
        this.rContent = rContent;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getReplyUser() {
        return replyUser;
    }

    public void setReplyUser(Integer replyUser) {
        this.replyUser = replyUser;
    }
}
