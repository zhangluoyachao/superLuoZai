package day15;

public class Goods {
    private String name;
    private Integer num;
    private Integer maxNum;

    public Goods() {
    }

    public Goods(String name, Integer num, Integer maxNum) {
        this.name = name;
        this.num = num;
        this.maxNum = maxNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getMaxNum() {
        return maxNum;
    }

    public void setMaxNum(Integer maxNum) {
        this.maxNum = maxNum;
    }

}
