package entities;

import java.util.Random;
import java.util.Scanner;
public class Battle {
	public static void combat(Scanner input, Monster monster, Player player) {
		Random random = new Random();
		
		System.out.println("You find a "+ monster.getName() + "!\n\n\n\n THE BATTLE BEGINS!!!");
		double damage;
		double heal;
		while(player.getLife() > 0 && monster.getLife() > 0) {
			
			if(player.getAgility() >= monster.getAgility() ) {
				System.out.println(player.getName() + "'s life: "+ player.getLife());
				System.out.println("what do you want to do?\n ATTACK[1] DEFENSE[2] POTION[3]");
				
				int choice = input.nextInt();
				
				switch(choice) {
				case 1:
					if(player.getWeaponCategory() == "light") {
						damage = Math.round(player.getDamage() + (random.nextDouble(6)+1) + (random.nextDouble(6)+1) + (random.nextDouble(4)+1) + (player.getDexterity()/2));
					}
					else {
						damage = Math.round(player.getDamage() + (random.nextDouble(12)+1) + 1.5*player.getStrength());
					}
					System.out.println("you dealt" + damage + " damage!!!");
					monster.setLifeMonster(damage);
					break;
				case 2:
					player.getDefense();
					break;
				
				case 3:
					heal = player.drinkPotions();
					if(player.getAmountPotions() == 0) {
						System.out.println("you dont have enough potions!!");
					}
					else if(player.getLife() == player.getPVMax()) {
						System.out.println("Your life is full");
					}
					else if(player.getLife() + heal > player.getPVMax()) {
						player.setLife(player.getPVMax());
						player.setAmountPotions(1);
					}
					else {
						System.out.println("You healead "+ heal + " points of life");
						player.setLife(heal);
						player.setAmountPotions(1);

					}
			}
		}
		}
		System.out.println("You defeated the " + monster.getName());
	}
}
