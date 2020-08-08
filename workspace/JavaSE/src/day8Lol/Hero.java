package day8Lol;

public class Hero {
    String name;
    double hp;
    double xp;
    int level;

    public void attack2() {

    }

    public void defense() {
        System.out.println("防御");
    }
}

class AttackHero extends Hero implements Attack {
    @Override
    public String attack() {
        return "顺劈斩";
    }

    public void attack2() {
        System.out.println("释放" + attack());
    }
}

class MagicHero extends Hero implements Magic {
    @Override
    public String magicAttack() {
        return "寒冰箭";
    }

    @Override
    public void attack2() {
        System.out.println("释放" + magicAttack());
    }
}

class BothHero extends Hero implements Attack, Magic {
    @Override
    public String attack() {
        return "顺劈斩";
    }

    @Override
    public String magicAttack() {
        return "寒冰箭";
    }

    public void attack2() {
        System.out.println("释放" + attack() + "和" + magicAttack());
    }
}
