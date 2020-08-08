package day9;

//目标对象
public class DemoObject {
    public void message() throws Exception {
        System.out.println("这是一个测试类，我是目标对象");
        Thread.sleep(2000);
        System.out.println("方法调用结束");
    }
}

//代理对象
class Agent {
    public static void getDemoObjectMessage() {
        DemoObject dob = new DemoObject();
        long begin = System.currentTimeMillis();
        try {//用于处理异常
            dob.message();
        } catch (Exception e) {
        }
        long end = System.currentTimeMillis();
        System.out.println("时间" + (end - begin) / 1000.0);
    }

}

//用户测试对象
class TestDemo {
    public static void main(String[] args) {
        Agent.getDemoObjectMessage();
        String str = "a";
        for (int i = 0; i < 10; i++) {
            str += "z";
        }
    }
}