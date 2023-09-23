package entities;

import java.util.Random;
import java.util.Scanner;

public class Battle {
	public static void battleWithThreeMonsters(Monster monster, Monster monster2, Monster monster3, Player player, Scanner input, Random random) {
		int randomMonster = random.nextInt(3)+1;
		
		
		 if (randomMonster == 1) {
			 Battle.combat(input,  monster,  player);
	     }
		 else if (randomMonster == 2) {
			 Battle.combat(input,  monster2,  player);
		 }
		 else if (randomMonster == 3) {
			 Battle.combat(input,  monster3,  player);
		 }
	}
	
	public static void battleWithTwoMonsters(Monster monster, Monster monster2, Player player, Scanner input, Random random) {
		int randomMonster = random.nextInt(2)+1;
		
		
		 if (randomMonster == 1) {
			 Battle.combat(input,  monster,  player);
	     }
		 else if (randomMonster == 2) {
			 Battle.combat(input,  monster2,  player);
		 }
		 
	}
	
	public static void battleWithOneMonster(Monster monster, Player player, Scanner input) {
			 Battle.combat(input,  monster,  player);
	}
	
    public static boolean playerTurn(Scanner input, Monster monster, Player player) {
        double damage, heal;

        player.setDefense(player.getOriginalDefense());
        System.out.println("\n" + player.getName() + "'s life: " + player.getLife() + " || " + monster.getName()
                + "'s life: " + monster.getPV() + "\n\n");
        System.out.println("what do you want to do?\n ATTACK[1] DEFENSE[2] POTION[3]");

        int choice = input.nextInt();

        switch (choice) {
        case 1:
            damage = player.getDamage();
            System.out.println("\n\nyou dealt " + damage + " damage!!!\n\n");
            monster.receiveDamage(damage);
            return false;
        case 2:
            player.setDefense(player.getDefense() * 2);
            System.out.println("you defended yourself!!!");
            return false;

        case 3:
            heal = player.drinkPotions();
            if (player.getAmountPotions() == 0) {
                System.out.println("you don't have enough potions!!");
                return true;
            } else if (player.getLife() == player.getPVMax()) {
                System.out.println("Your life is full");
                return true;
            } else if (player.getLife() + heal > player.getPVMax()) {
                player.setLife(player.getPVMax());
                player.setAmountPotions(1);
                System.out.println("now your life is full");
                return false;
            } else {
                System.out.println("You healead " + heal + " points of life");
                player.healLife(heal);
                player.setAmountPotions(1);
                return false;
            }
        default:
            return true;
        }
        

    }

    public static boolean monsterTurn(Scanner input, Monster monster, Player player, Random random) {
        int monsterChoice;
        double monsterDamage, heal;
        if(monster.getPV() <= 0){
            return false;
        }
        monster.setDefense(monster.getOriginalDefense());
        monsterChoice = (random.nextInt(3) + 1);
        switch (monsterChoice) {
        case 1:
            monsterDamage = monster.getDamage();
            player.receiveDamage(monsterDamage);
            System.out.println("the " + monster.getName() + " dealt " + monsterDamage + " damage!\n\n");
            return false;

        case 2:
            monster.setDefense(player.getDefense() * 2);
            System.out.println("the monster defended himself!!!");
            return false;

        case 3:
            heal = monster.drinkPotion();
            if (monster.getAmountOfPotions() <= 0) {
                System.out.println("the monster tried to heal... but failed");
                return true;
            } else if (monster.getPV() == monster.getPVMax()) {
                System.out.println("the monster tried to heal... but his life is full");
                return true;
            } else if (monster.getPV() + heal > monster.getPVMax()) {
                monster.setPVtoMax(monster.getPVMax());
                return false;
            } else {
                System.out.println("You healead " + heal + " points of life");
                monster.healLife(monster.drinkPotion());
                return false;
            }
        default:
            return true;
        }
        
    }

    public static void combat(Scanner input, Monster monster, Player player) {
        Random random = new Random();
        boolean pass = true;
        System.out.println("You find a " + monster.getName() + "!\n\n\n\n THE BATTLE BEGINS!!!");

        while (player.getLife() > 0 && monster.getPV() > 0) {

            if (player.getAgility() >= monster.getAgility()) {
                do{
                    pass = playerTurn(input, monster, player);
                }while(pass);

                if (monster.getPV() <= 0) {
                    break;
                }

                do{
                    pass = monsterTurn(input, monster, player, random);
                }while(pass);
                
            }
            if (player.getAgility() < monster.getAgility()) {
                do{
                    pass = monsterTurn(input, monster, player, random);
                }while(pass);

                if (player.getLife() <= 0) {
                    break;
                }

                do{
                    pass = playerTurn(input, monster, player);
                }while(pass);
            }
        }
        if(monster.getPV() <= 0){
            System.out.println("You defeated the " + monster.getName());
        }
        else{
            System.out.println("You have been defeated");
        }
        
    }
}