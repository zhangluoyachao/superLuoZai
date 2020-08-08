package day2.hw;

public class Output {
    private Integer num;
    private Integer year;
    private Integer q1;
    private Integer q2;
    private Integer q3;
    private Integer q4;
    private Integer total;

    public Output(Integer year, Integer q1, Integer q2, Integer q3, Integer q4) {
        this.year = year;
        this.q1 = q1;
        this.q2 = q2;
        this.q3 = q3;
        this.q4 = q4;
        this.total = q1 + q2 + q3 + q4;
    }


    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getQ1() {
        return q1;
    }

    public void setQ1(Integer q1) {
        this.q1 = q1;
    }

    public Integer getQ2() {
        return q2;
    }

    public void setQ2(Integer q2) {
        this.q2 = q2;
    }

    public Integer getQ3() {
        return q3;
    }

    public void setQ3(Integer q3) {
        this.q3 = q3;
    }

    public Integer getQ4() {
        return q4;
    }

    public void setQ4(Integer q4) {
        this.q4 = q4;
    }

    public Integer getTotal() {
        return total;
    }
}
