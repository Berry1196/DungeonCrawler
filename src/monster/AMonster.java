package monster;

import monster.Monster;

public abstract class AMonster implements Monster {
    String monsterName;
    int HP;
    int attack;
    int defense;

    public AMonster( String monsterName, int HP, int attack, int defense) {
        this.monsterName = monsterName;
        this.HP = HP;
        this.attack = attack;
        this.defense = defense;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    @Override
    public String monsterName() {
        return "";
    }

    @Override
    public int getMonsterHP() {
        return 0;
    }

    @Override
    public int getMonsterAttack() {
        return 0;
    }

    @Override
    public int getMonsterDefense() {
        return 0;
    }
    
}
