package dao;

import pojo.BBSTopic;
import pojo.BBSUser;
import util.JdbcUtil;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BBSTopicDao {
    public static int insert(BBSTopic topic) {
        String sql = "insert into BBSTopic values(BBSTopic_SEQ.nextval,?,null,null,?,sysdate,sysdate,null,?)";
        int i = JdbcUtil.update(sql, topic.getTitle(), topic.getCreateUser(),
                topic.gettContent());
        JdbcUtil.close();
        return i;
    }

    public static List<BBSTopic> query(BBSUser user){
        String sql = "select * from BBSTOPIC where createuser = ?";
        ResultSet rs = JdbcUtil.select(sql,user.getUseID());
        List<BBSTopic> list = new ArrayList<>();
        try {
            while (rs.next()){
               int tid= rs.getInt("TID");
                String ttitle = rs.getString("TTITLE");
                int viewcount = rs.getInt("VIEWCOUNT");
                int replycount = rs.getInt("REPLYCOUNT");
                int createuser = rs.getInt("CREATEUSER");
                Date createtime = rs.getDate("createtime");
                Date lastreplytime = rs.getDate("LASTREPLYTIME");
                int lastreplyuser = rs.getInt("LASTREPLYUSER");
                String tcontent = rs.getString("TCONTENT");
                BBSTopic t = new BBSTopic(tid,ttitle,viewcount,replycount,createuser,createtime,lastreplytime,lastreplyuser,tcontent);
                list.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        JdbcUtil.close();
        return list;
    }
}
