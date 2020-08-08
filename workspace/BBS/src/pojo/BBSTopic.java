package pojo;

import java.sql.Date;

//话题
public class BBSTopic {
    private Integer tid;//话题id
    private String tTitle;//话题标题
    private Integer viewCount;//浏览数
    private Integer replyCount;//回帖数
    private Integer createUser;//话题创建人ID
    private Date createTime;//创建时间
    private Date lastReplyTime;//最后回复时间
    private Integer lastReplyUser;//最后回复人
    private String tContent;//话题内容

    public BBSTopic(Integer tid, String tTitle, Integer viewCount, Integer replyCount, Integer createUser, Date createTime, Date lastReplyTime, Integer lastReplyUser, String tContent) {
        this.tid = tid;
        this.tTitle = tTitle;
        this.viewCount = viewCount;
        this.replyCount = replyCount;
        this.createUser = createUser;
        this.createTime = createTime;
        this.lastReplyTime = lastReplyTime;
        this.lastReplyUser = lastReplyUser;
        this.tContent = tContent;
    }

    public BBSTopic(String tTitle, Integer createUser, String tContent) {
        this.tTitle = tTitle;
        this.createUser = createUser;
        this.tContent = tContent;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTitle() {
        return tTitle;
    }

    public void settTitle(String tTitle) {
        this.tTitle = tTitle;
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    public Integer getReplyCount() {
        return replyCount;
    }

    public void setReplyCount(Integer replyCount) {
        this.replyCount = replyCount;
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastReplyTime() {
        return lastReplyTime;
    }

    public void setLastReplyTime(Date lastReplyTime) {
        this.lastReplyTime = lastReplyTime;
    }

    public Integer getLastReplyUser() {
        return lastReplyUser;
    }

    public void setLastReplyUser(Integer lastReplyUser) {
        this.lastReplyUser = lastReplyUser;
    }

    public String gettContent() {
        return tContent;
    }

    public void settContent(String tContent) {
        this.tContent = tContent;
    }
}
