package entities;

import java.util.Scanner;
import java.util.Random;
public class Battle {
	public static void combat(Scanner input, Monster monster, Player player) {
		Random random = new Random();
		
		System.out.println("You find a "+ monster.getName() + "!\n\n\n\n THE BATTLE BEGINS!!!");
		int damage;
		while(player.getLife() > 0 && monster.getLife() > 0) {
			if(player.getAgility() >= monster.getAgility() ) {
				System.out.println("what do you want to do?\n ATTACK[1] DEFENSE[2] POTION[3]");
				int choice = input.nextInt();
				switch(choice) {
				case 1:
					if(player.getWeaponCategory() == "light") {
						damage = (int) (player.getDamage() + (random.nextInt(6)+1) + (random.nextInt(6)+1) + (random.nextInt(4)+1) + player.getDexterity());
					}
					else {
						damage = (int) (player.getDamage() + (random.nextInt(12)+1) + 1.5*player.getStrength());
					}
					
					System.out.println("you dealt" + damage + " damage!!!");
					monster.setLifeMonster(damage);
				}
			}
		}
	}


	public static void attack(Monster monster, Player player) {
	
	}
}
