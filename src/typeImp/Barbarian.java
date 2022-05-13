package typeImp;

import types.ACharacterType;

public class Barbarian  extends ACharacterType {

    public Barbarian(int hp, int attack, int defense, int gold) {
        super(hp, attack, defense, gold);
    }

    @Override
    public String toString() {
        return "Your HP: " + getHP() + "\nYour attack: " + getAttack() + "\nYour defense: " +
                getDefense() + "\nYour gold: " + getGold();
    }

/* public int setBarbHP(int barbHP) {
        int hp = 10;
        return hp;
    }
*/
}
