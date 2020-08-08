package day15.homework;

public class Goods2 {
    private String name;
    private Integer num;
    private Integer maxNum;
    private static Goods2 g;

    private Goods2() {
    }

    private Goods2(String name, Integer num, Integer maxNum) {
        this.name = name;
        this.num = num;
        this.maxNum = maxNum;
    }

    public static Goods2 getGoods2(String name, Integer num, Integer maxNum) {
        if (g == null) {
            g = new Goods2(name, num, maxNum);
        }
        return g;
    }

    public static Goods2 getGoods2() {
        if (g == null) {
            g = new Goods2();
        }
        return g;
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