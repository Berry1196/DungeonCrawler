package typeImp;

import types.AType;

public  class Tank extends AType {
    public Tank(int HP, int attack, int defense, int gold) {
        super(HP, attack, defense, gold);
    }
    @Override
    public String toString() {
        return " " + getHP() + " " + getAttack() + " " +
                getDefense() + " " + getGold();
    }
}
