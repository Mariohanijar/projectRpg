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
        System.out.println("\n" + player.getName() + "'s life: " + player.getLife() + " mana: " + player.getMp() +" || " + monster.getName()
        + "'s life: " + monster.getPV() + "\n\n");
        System.out.println("what do you want to do?\n ATTACK[1] MAGIC[2] DEFENSE[3] POTION[4]");

        int choice = input.nextInt();
        int magicChosen;
        

        switch (choice) {
        case 1:
            damage = monster.receiveDamage(player.getDamage(), player.getWeaponType());
            System.out.println("\n\nyou dealt " + damage + " damage!!!\n\n");
            Formatting.lineBreaker();
            return false;
        case 2:
        	System.out.println("what magic do you want to use?: ");
        	for(int i = 0; i < player.getMagicLenght(); i++) {
        		System.out.println(player.getMagic(i) + "["+(1+i)+"] ");
        	}
        	magicChosen = (input.nextInt()-1);
        	if(player.getMp() == 0) {
        		System.out.println("you don't have mana!!!!");
        		return true;
        	}
        	damage = monster.receiveDamage(player.getMagicDamage(magicChosen), player.getMagicType(magicChosen));
        	Formatting.lineBreaker();
        	System.out.println("\n\nyou cast "+ player.getMagic(magicChosen) +" and dealt " + damage + " damage!!!\n\n"); 
        	player.setMp(player.getMp()-1);
        	Formatting.lineBreaker();
        	return false;
        case 3:
            player.setDefense(player.getDefense() * 2);
            System.out.println("you defended yourself!!!");
            Formatting.lineBreaker();
            return false;

        case 4:
            heal = player.drinkPotions();
            if (player.getAmountPotions() == 0) {
                System.out.println("you don't have enough potions!!");
                Formatting.lineBreaker();
                return true;
            } else if (player.getLife() == player.getPVMax()) {
                System.out.println("Your life is full");
                Formatting.lineBreaker();
                return true;
            } else if (player.getLife() + heal > player.getPVMax()) {
                player.setLife(player.getPVMax());
                player.setAmountPotions(1);
                System.out.println("now your life is full");
                Formatting.lineBreaker();
                return false;
            } else {
                
                player.healLife(heal);
                player.setAmountPotions(1);
                System.out.println("You healead " + heal + " points of life");
                Formatting.lineBreaker();
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
            monsterDamage = player.receiveDamage(monster.getDamage());
            System.out.println("the " + monster.getName() + " dealt " + monsterDamage + " damage!\n\n");
            Formatting.lineBreaker();
            return false;

        case 2:
            monster.setDefense(player.getDefense() * 2);
            System.out.println("the monster defended himself!!!");
            Formatting.lineBreaker();
            return false;

        case 3:
            heal = monster.drinkPotion();
            if (monster.getAmountOfPotions() <= 0) {
                System.out.println("the monster tried to heal... but failed");
                Formatting.lineBreaker();
                return true;
            } else if (monster.getPV() == monster.getPVMax()) {
                System.out.println("the monster tried to heal... but his life is full");
                Formatting.lineBreaker();
                return true;
            } else if (monster.getPV() + heal > monster.getPVMax()) {
                System.out.println("the monster healed "+ (monster.getPVMax() - monster.getPV()) + " points of life");
                monster.setPVtoMax(monster.getPVMax());
                monster.setAmountOfPotions();
                Formatting.lineBreaker();
                return false;
            } else {
                
                monster.healLife(monster.drinkPotion());
                System.out.println("You healead " + heal + " points of life");
                monster.setAmountOfPotions();
                Formatting.lineBreaker();
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
        	
            
            Formatting.lineBreaker();
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
            	for(int i = 0; i < 1; i++)System.out.println("\n" + player.getName() + "'s life: " + player.getLife() + " mana: " + player.getMp() +" || " + monster.getName()
                + "'s life: " + monster.getPV() + "\n\n");
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
            player.resetPlayer();
        }
        else{
            System.out.println("You have been defeated");
        }
        
    }
}