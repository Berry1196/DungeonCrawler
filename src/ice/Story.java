package ice;

import monsterImpl.Demon;
import monsterImpl.Humanoid;
import monsterImpl.Undead;
import typeImp.Barbarian;
import typeImp.Tank;
import typeImp.Warrior;


import java.util.Scanner;

public class Story {
    Interactions actions = new Interactions();
    Scanner scan = new Scanner(System.in);

     // int numberInput = scan.nextInt();
    int barbHP = 20; // barbHP
    int monsterAttack; // test variabler
    int currentBarbHP; // Test variabler
    int healthPotionAmount= 3;
    int healthPotionHealing = 10;
    Undead undead1 = new Undead("Skeleton",4,1,1);
    Undead undead2 = new Undead("Ghoul",4,1,1);
    Undead undead3 = new Undead("Zombie",4,1,1);
    Demon demon1 = new Demon("Imp",4,1,1);
    Demon demon2 = new Demon("Lesser Demon",4,1,1);
    Demon demon3 = new Demon("Greater Demon",4,1,1);
    Humanoid human1 = new Humanoid("Elf",4,1,1);
    Humanoid human2 = new Humanoid("Dwarf",4,1,1);
    Humanoid human3 = new Humanoid("Succubus",4,1,1);

    Barbarian barb = new Barbarian(20,3,3,0);
     // Warrior warrior = new Warrior(25,2,4,0);
    // Tank tank = new Tank(30,1,5,0);


    /* public void fightingOptions(){
    System.out.println("Press 1 to attack");
    System.out.println("Press 2 to Drink a health potion");
    if(numberInput==1){ undead1.getMonsterHP();
       // newmonter hp = oldmonsterhp-dmgtaken
       //dmg taken = monsterdefence-barbattack
    }if(numberInput==2){
        if(healthPotionAmount > 0){
        barbHP += healthPotionHealing;
        }
    }
    }
*/
    public void mapOne() {

        monsterAttack = 5; // test
        System.out.println("Welcome to the world of Calderan");
        System.out.println("################################");
        System.out.println("Chose a character");
        System.out.println("Type B for Barbarian");
        System.out.println("Type T for Tank");
        System.out.println("Type W for Warrior");
        System.out.println("################################");
        //Bruger input
        // String userInput = scan.nextLine();
        var userInput = scan.nextLine();
        if (userInput.equalsIgnoreCase("b")) {
            System.out.println("You picked Barbarian");
            System.out.println("################################");
        }
        if (userInput.equalsIgnoreCase("t")) {
            System.out.println("You picked Tank");
            System.out.println("################################");
        }
        if (userInput.equalsIgnoreCase("w")) {
            System.out.println("You picked Warrior");
            System.out.println("################################");
        }
        //Directions are told just before story start
        System.out.println("This is how you move in the game");
        System.out.println("Type W to go Forward");
        System.out.println("Type D to go Right");
        System.out.println("Type A to go Left");
        System.out.println("################################");
        System.out.println("");
        actions.attackRiddle(barb);
        System.out.println(barb);
        //GAME IS RUNNING
        while (true) {
            userInput = scan.nextLine();
            if (userInput.equalsIgnoreCase("W")) {
                System.out.println("you move forward");
                System.out.println("oh no its a " + undead1);
                // fightingOptions();
            userInput = scan.nextLine();
            }if(userInput.equalsIgnoreCase("D")){
                System.out.println("you move to the right");
                System.out.println("oh no its a " + demon1);
            }if(userInput.equalsIgnoreCase("A")) {
                System.out.println("you move to the left");
                System.out.println("oh no its a " + human1);
            }

            break;
            }

        }
    }

