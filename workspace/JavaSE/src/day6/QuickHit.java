package day6;

import java.util.Scanner;

public class QuickHit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Game game = new Game();
        Player player = new Player(0, 0);
        game.setPlayer(player);
        System.out.println("是否开始游戏？！Y/N");
        String yn = sc.next();
        if (yn.equalsIgnoreCase("y")) {
            System.out.println("--------游戏开始！当前等级" + player.levelNo + "--------");
            do {//外层循环 控制等级
                player.startTime = System.currentTimeMillis();
                for (int i = 0; i < 3; i++) {//内层循环 循环输入字符
                    String strOut = game.printStr();
                    System.out.println(strOut);
                    System.out.println("请输入字符串:");
                    String strIn = sc.next();
                    player.elapsedTime = System.currentTimeMillis();
                    game.printResult(strOut, strIn);
                }
                player.levelNo++;
                System.out.println("恭喜您升级了！当前等级" + player.levelNo);
                game.lv = LevelParam.levels[player.levelNo];
            } while (player.levelNo <= 6);
            System.out.println("恭喜你通关了所有关卡！");

        } else {
            System.out.println("-----退出程序-----");
            System.exit(0);
        }
    }
}










