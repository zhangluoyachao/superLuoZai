package day6;

public class Level {
    public int levelNo;//等级
    public int strLength;//字符串长度
    public int strTimes;//开始时间
    public int timeLimit;//结束时间
    public int perScore;//积分

    Level() {
    }

    Level(int levelNo, int strLength, int strTimes, int timeLimit, int perScore) {
        this.levelNo = levelNo;
        this.strLength = strLength;
        this.strTimes = strTimes;
        this.timeLimit = timeLimit;
        this.perScore = perScore;
    }
}