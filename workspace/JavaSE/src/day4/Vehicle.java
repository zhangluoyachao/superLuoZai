package day4;

public class Vehicle {
    private int speed;
    private int size;

    public int getSpeed(){
        return this.speed;
    }
    public void setSpeed(int speed){
        if(speed>=0){
            this.speed = speed;
        }else {
            System.out.println("输入数字有误！");
        }

    }

    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }

    public void move(){
        speed++;
    }
    public void speedUp(int speed){
        this.speed += speed;
    }
    public void speedDown(int speed){
        if(this.speed>speed){
        this.speed -= speed;
        }else{
            System.out.println("输入数字错误，速度不变");
        }
    }

}
