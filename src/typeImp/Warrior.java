package typeImp;

import types.ACharacterType;

public class Warrior extends ACharacterType {
    public Warrior(int HP, int attack, int defense, int gold) {
        super(HP, attack, defense, gold);
    }
    @Override
    public String toString() {
        return "Your HP: " + getHP() + "\nYour attack: " + getAttack() + "\nYour defense: " +
                getDefense() + "\nYour gold: " + getGold();
    }
}
