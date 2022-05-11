package typeImp;

import types.AType;

public class Warrior extends AType {
    public Warrior(int HP, int attack, int defense, int gold) {
        super(HP, attack, defense, gold);
    }
    @Override
    public String toString() {
        return " " + getHP() + " " + getAttack() + " " +
                getDefense() + " " + getGold();
    }
}
