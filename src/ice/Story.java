package ice;

import typeImp.Barbarian;
import typeImp.Tank;
import typeImp.Warrior;
import types.AType;

import java.util.Scanner;

public class Story {
    int barbHP = 20; // barbHP
    int monsterAttack; // test variabler
    int currentBarbHP; // Test variabler
    Barbarian barb = new Barbarian(20,3,3,0);
    Warrior warrior = new Warrior(25,2,4,0);
    Tank tank = new Tank(30,1,5,0);
    public void mapOne() {
        monsterAttack = 5; // test
        Scanner scan = new Scanner(System.in);
        String userInput = scan.nextLine();
        while (true) {
            if (userInput.equals("L")) {
                currentBarbHP = barbHP - monsterAttack;
                barb.setHP(currentBarbHP);
                System.out.println(barb);
            }
            break;
        }
    }
}
