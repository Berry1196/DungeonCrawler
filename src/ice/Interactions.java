package ice;

import typeImp.Barbarian;
import types.AType;

import java.util.Scanner;

public class Interactions {
    Scanner scan = new Scanner(System.in);
    String userInput = scan.nextLine();

    public void trap(){

    }

    public void treasure() {

    }

    public void trader() {

    }

    public void attackRiddle(AType actor) {
        System.out.println("What has to be broken before you can use it?");
        userInput = scan.nextLine();
        if (userInput.equalsIgnoreCase("Egg")) {
            actor.setAttack(actor.getAttack()+1);
        }
        //sout hele riddle
        //input fra bruger svar.equalsIgnoreCase
        // reward for rigtig svar
        //dmg eller intet reward for forkert svar
        //tilbage til story
    }

}
