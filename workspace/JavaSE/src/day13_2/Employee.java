package day13_2;

public class Employee implements Cloneable {
    private Integer id;
    private String name;
    private Double salary;
    private Dept dept = new Dept();//部门对象

    public Employee() {
        System.out.println("无参构造被调用了");
    }

    public Employee(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
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

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", dept=" + dept +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
//        Employee e = (Employee) super.clone();
//        Dept d = (Dept) d.clone();
//        e.setDept(d);
//        return e;
        Employee e = (Employee) super.clone();
        //实现了深克隆   对象 的引用类型 要重新赋值
        e.setDept((Dept) dept.clone());
        return e;
    }
}

class Dept implements Cloneable {
    private String deptName;
    private Integer no;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Dept() {
    }

    public Dept(String deptName, Integer no) {
        this.deptName = deptName;
        this.no = no;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptName='" + deptName + '\'' +
                ", no=" + no +
                '}';
    }
}
