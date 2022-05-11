package typeImp;

import types.AType;

public class Barbarian  extends AType {

    public Barbarian(int hp, int attack, int defense, int gold) {
        super(hp, attack, defense, gold);
    }

    @Override
    public String toString() {
        return " " + getHP() + " " + getAttack() + " " +
                getDefense() + " " + getGold();
    }

/* public int setBarbHP(int barbHP) {
        int hp = 10;
        return hp;
    }
*/
}
