package pojo;

import java.sql.Date;

public class Emp {
    private Integer id;
    private String name;
    private String job;
    private Integer mgr;
    private Date hireDate;
    private Double sal;
    private Double comm;
    private Integer deptNo;

    public Emp(Integer id, String name, String job, Integer mgr, Date hireDate, Double sal, Double comm, Integer deptNo) {
        this.id = id;
        this.name = name;
        this.job = job;
        this.mgr = mgr;
        this.hireDate = hireDate;
        this.sal = sal;
        this.comm = comm;
        this.deptNo = deptNo;
    }

    public Emp(String name, String job, Double sal, Double comm, Integer deptNo) {
        this.name = name;
        this.job = job;
        this.sal = sal;
        this.comm = comm;
        this.deptNo = deptNo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Integer getMgr() {
        return mgr;
    }

    public void setMgr(Integer mgr) {
        this.mgr = mgr;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public Double getSal() {
        return sal;
    }

    public void setSal(Double sal) {
        this.sal = sal;
    }

    public Double getComm() {
        return comm;
    }

    public void setComm(Double comm) {
        this.comm = comm;
    }

    public Integer getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(Integer deptNo) {
        this.deptNo = deptNo;
    }
}
