package day6;

class Game {
    Player player = new Player();
    int levelNo;

    public void setPlayer(Player player) {
        this.player = player;
        this.levelNo = player.levelNo;
    }

    Level lv = LevelParam.levels[levelNo];

    public String printStr() {//输出字符串，用于和玩家输入比较
        StringBuffer sBuffer = new StringBuffer();
        for (int i = 0; i < lv.strLength; i++) {
            int a = (int) (Math.random() * 11);
            switch (a) {
                case 0:
                    sBuffer.append("a");
                    break;
                case 1:
                    sBuffer.append("x");
                    break;
                case 2:
                    sBuffer.append("d");
                    break;
                case 3:
                    sBuffer.append("r");
                    break;
                case 4:
                    sBuffer.append("g");
                    break;
                case 5:
                    sBuffer.append("v");
                    break;
                case 6:
                    sBuffer.append("h");
                    break;
                case 7:
                    sBuffer.append("u");
                    break;
                case 8:
                    sBuffer.append("k");
                    break;
                case 9:
                    sBuffer.append("<");
                    break;
                case 10:
                    sBuffer.append(">");
                    break;
            }
        }
        String str = sBuffer.toString();
        return str;
    }

    public void printResult(String out, String in) {//比较游戏输入out和玩家输入in，根据比较结果输出相应信息

        long t = (player.elapsedTime - player.startTime) / 1000;
        if (t < lv.timeLimit - lv.strTimes) {
            if (in.equals(out)) {
                lv.perScore++;
                System.out.println("输入正确,目前积分为：" + lv.perScore + "当前等级：" + player.levelNo + "用时：" + t + "秒");
                System.out.println();
            } else {
                System.out.println("您输入错误，退出程序");
                System.exit(0);
            }
        } else {
            System.out.println("您输入超时，退出程序");
            System.exit(0);
        }


    }
}