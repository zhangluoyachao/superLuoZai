package day12;

public class Student {
    private Integer id;
    private String name;
    private String mess;

    public Student(Integer id, String name, String mess) {
        this.id = id;
        this.name = name;
        this.mess = mess;
    }

//    @Override
//    public String toString() {
//        return "Student{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", mess='" + mess + '\'' +
//                '}';
//    }

    public Student() {
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

    public String getMess() {
        return mess;
    }

    public void setMess(String mess) {
        this.mess = mess;
    }
}
