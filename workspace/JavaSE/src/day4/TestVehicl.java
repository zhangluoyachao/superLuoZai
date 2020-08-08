package day4;

public class TestVehicl {
    public static void main(String[] args) {
        Vehicle ve = new Vehicle();
        ve.setSize(100);
        ve.setSpeed(30);
        ve.speedUp(20);
        System.out.println(ve.getSpeed());
        ve.speedDown(40);

        System.out.println("速度："+ve.getSpeed()+"m/s 体积："+ve.getSize());
    }
}
