package day4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TestPet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pet pet = new Pet();

        System.out.println("请输入要领养的宠物的名字：");
        String  name = sc.next();
        pet.setName(name);

        System.out.println("请输入要领养的宠物的品种：（1、狗狗 2、企鹅）");
        String  type = sc.next();
        switch (type){
            case "1":{
                type = "狗狗";
                pet.setType(type);
                System.out.println("请输入要领养的"+pet.getType()+"的品种：（1、聪明的拉布拉多2、酷酷的雪纳瑞）");
                String breed = sc.next();
                switch (breed){
                    case "1":breed = "聪明的拉布拉多";break;
                    case "2":breed = "酷酷的雪纳瑞";break;
                }
                pet.setBreed(breed);
            }
            break;
            case "2":{
                type = "企鹅";
                pet.setType(type);
                System.out.println("请输入要领养的"+pet.getType()+"的品种：（1、帝王企鹅2、白企鹅）");
                String breed = sc.next();
                switch (breed){
                    case "1":breed = "帝企鹅";break;
                    case "2":breed = "白企鹅";break;
                }
                pet.setBreed(breed);
            }
            break;
        }

        System.out.println("请输入要领养的"+pet.getType()+"的健康值（0-100之间）：");
        int  health = sc.nextInt();
        pet.setHealth(health);

        pet.print();

    }
}
