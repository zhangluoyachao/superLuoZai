package day4;

public class Pet {
    private String name;//宠物名称
    private String type;//宠物类型
    private String breed;//宠物品种

    private int health;//健康度 在0-100之间 默认60
    public Pet() {

    }

    //name属性的s/g方法
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    //type属性的s/g方法
    public String getType(){
        return this.type;
    }
    public void setType(String type){
        this.type=type;
    }
    //breed属性的s/g方法

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    //health属性s/g方法


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if(health>0&health<100){
        this.health = health;
        }else {
            this.health = 60;
            System.out.println("输入错误，默认值为60");
        }
    }

    public void print(){
        System.out.println("我的名字叫："+name+"，健康值是"+health+"，和主人的亲密度是0，我是一只"+breed);
    }

}

