package day13.homework;

public class Student {
    private String name;
    private int no;
    private int results;

    public Student() {
    }

    public Student(String name, int no, int results) {
        this.name = name;
        this.no = no;
        this.results = results;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getResults() {
        return results;
    }

    public void setResults(int results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", no=" + no +
                ", results=" + results +
                '}';
    }
}

