package day11;

public class Student implements Comparable<Student> {
    Integer id;
    String name;
    String sex;

    @Override
    public int compareTo(Student o) {
        return 0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + "'" +
                ", sex='" + sex + "'" +
                '}';
    }

    public Student() {
    }

    public Student(Integer id, String name, String sex) {
        this.id = id;
        this.name = name;
        this.sex = sex;
    }

    public static void main(String[] args) {
        Student[] stus = new Student[5];
        stus[0] = new Student(1, "张", "男");
        stus[1] = new Student(2, "张", "男");
        stus[2] = new Student(4, "张", "男");
        stus[3] = new Student(5, "张", "男");
        stus[4] = new Student(3, "张", "男");
        System.out.println(stus[1].toString());
    }
}
