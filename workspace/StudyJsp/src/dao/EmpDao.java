package dao;


import pojo.Emp;
import util.JdbcUtil;


import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpDao {
    public static int insert(Emp e) {
        String sql = "insert into emp values(Test_seq.nextval,?,?,1,sysdate,?,?,?)";
        int result = JdbcUtil.update(sql, e.getName(), e.getJob(), e.getSal(), e.getComm(), e.getDeptNo());
        JdbcUtil.close(JdbcUtil.ps, JdbcUtil.con);
        return result;
    }

    public static List<Emp> queryAll() {
        List<Emp> list = new ArrayList<>();
        String sql = "select * from emp";
        ResultSet rs = JdbcUtil.select(sql);
        try {
            while (rs.next()) {
                Integer id = rs.getInt("empno");
                String name = rs.getString("ename");
                String job = rs.getString("job");
                Integer mgr = rs.getInt("mgr");
                Date date = rs.getDate("hiredate");
                Double sal = rs.getDouble("sal");
                Double comm = rs.getDouble("comm");
                Integer deptNo = rs.getInt("deptno");
                Emp e = new Emp(id, name, job, mgr, date, sal, comm, deptNo);
                list.add(e);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        JdbcUtil.close(rs, JdbcUtil.ps, JdbcUtil.con);
        return list;
    }
}
