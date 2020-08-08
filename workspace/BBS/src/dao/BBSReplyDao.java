package dao;

import pojo.BBSTopic;
import util.JdbcUtil;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BBSReplyDao {
    public static List<BBSTopic> queryAll() {
        String sql = "select * from BBSREPLY";
        ResultSet rs = JdbcUtil.select(sql);
        List<BBSTopic> list = new ArrayList<>();
        try {
            while (rs.next()) {
                Integer tid = rs.getInt("TID");
                String ttitle = rs.getString("TTITLE");
                Integer viewcount = rs.getInt("VIEWCOUNT");
                Integer replycount = rs.getInt("REPLYCOUNT");
                Integer createuser = rs.getInt("CREATEUSER");
                Date creatrtime = rs.getDate("createtime");
                Date lastreplytime = rs.getDate("LASTREPLYTIME");
                Integer lastreplyuser = rs.getInt("LASTREPLYUSER");
                String tcontent = rs.getString("TCONTENT");

                BBSTopic r = new BBSTopic(tid, ttitle, viewcount, replycount, createuser, creatrtime, lastreplytime, lastreplyuser, tcontent);
                list.add(r);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        JdbcUtil.close();
        return list;
    }
}
