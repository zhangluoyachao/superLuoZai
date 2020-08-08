package day8Door;

public class TheftproofDoor extends Door implements DoorBell {
    @Override
    public void photograph() {
        System.out.println("叮叮叮！咔嚓，照片拍摄完毕，已经储存");
    }

    public static void main(String[] args) {
        TheftproofDoor d = new TheftproofDoor();
        d.openLock();
        d.open();
        d.photograph();
        d.close();
        d.lock();
    }
}
