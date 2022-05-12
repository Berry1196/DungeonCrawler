package monsterImpl;

import monster.AMonster;

public class Humanoid extends AMonster {

    public Humanoid(String monsterName, int HP, int attack, int defense) {
        super(monsterName, HP, attack, defense);
    }
    @Override
    public String toString() {
        return "Enemy: "+ monsterName() + "\nMonster HP: " + getMonsterHP() + "\nMonster attack: " + getMonsterAttack() + "\nMonster defense: " +
                getMonsterDefense();
    }
}
