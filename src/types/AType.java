package types;


public abstract class AType implements Type {
    int HP;
    int attack;
    int defense;
    int gold;

    public AType(int HP, int attack, int defense, int gold) {
        this.HP = HP;
        this.attack = attack;
        this.defense = defense;
        this.gold = gold;
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

    public void setGold(int gold) {
        this.gold = gold;
    }

    @Override
    public int getHP() {
        return HP;
    }

    @Override
    public int getAttack() {
        return attack;
    }

    @Override
    public int getDefense() {
        return defense;
    }

    @Override
    public int getGold() {
        return gold;
    }
}
