package dao;

//Dao层公共方法
public class Dao {
    public static int numRecursion(int num) {
        if (num > 1) {
            num = num * numRecursion(num - 1);
        }
        return num;
    }

}
