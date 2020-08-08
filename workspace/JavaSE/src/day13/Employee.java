package day13;

public class Employee {
    private Integer id;
    private String name;
    private String job;
    private Double money;

    public Employee() {
    }

    public Employee(Integer id, Double money) {
        this.id = id;
        this.money = money;
    }

    public Employee(Integer id, String name, String job, Double money) {
        this.id = id;
        this.name = name;
        this.job = job;
        this.money = money;
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

    public double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", money=" + money +
                '}';
    }


}
