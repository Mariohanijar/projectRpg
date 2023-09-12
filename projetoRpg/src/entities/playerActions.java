package entities;

import java.util.Random;
import java.util.Scanner;
import java.io.IOException;

public class playerActions {
	public static Player characterCreation(Scanner input, Random random) {
		System.out.println("What is your character's name");
		String name = input.next();
		
		int strength = 0, constitution = 0, agility = 0, dexterity = 0, pv;
		 
		while(strength + constitution + agility + dexterity != 15) {
			System.out.println("how many points do you want to put in strength?:");
			strength = input.nextInt();
			System.out.println("how many points do you want to put in constitution?:");
			constitution = input.nextInt();
			System.out.println("how many points do you want to put in agility?:");
			agility = input.nextInt();
			System.out.println("how many points do you want to put in dexterity?:");
			dexterity = input.nextInt();
			if(strength + constitution + agility + dexterity != 15) {
				System.out.println("please allocate the points correctly");
			}
		}
		
		pv = (random.nextInt(6)+1) + (random.nextInt(6)+1) + (random.nextInt(6)+1) + constitution;
		
		Player player = new Player(name, pv, strength, constitution, agility, dexterity);
		return player;
		
		
	}
	
	public static Weapon weaponSelector(Scanner input) {
		Weapon shortSickle = new Weapon(3, "light", "Short Sicle");
		Weapon lightMace = new Weapon(4, "light", "lightMace");
		Weapon heavyAxe = new Weapon(7, "heavy", "Heavy Axe");
		
		while(1 != 0) {
			System.out.println("which weapon do you want? Short Sickle[1], Light Mace[2], Heavy Axe[3]");
			int choice = input.nextInt();
			int x;
			switch (choice) {
				case 1:
					System.out.println(shortSickle);
					System.out.println("Are you sure? yes[1] no[2]");
					x = input.nextInt();
					if(x == 1) {
						return shortSickle;
					}
					else {
						continue;
					}

				case 2:
					System.out.println(lightMace);
					System.out.println("Are you sure? yes[1] no[2]");
					x = input.nextInt();
					if(x == 1) {
						return lightMace;
					}
					else {
						continue;
					}
					
				case 3:
					System.out.println(heavyAxe);
					System.out.println("Are you sure? yes[1] no[2]");
					x = input.nextInt();
					if(x == 1) {
						return heavyAxe;
					}
					else {
						continue;
					}
					
			}
		}
	}
	public static Armor armorSelector(Scanner input) {
		Armor leatherArmor = new Armor(3, "Leather Armor");
		Armor chainArmor = new Armor(5, "Chain Armor");
		Armor splintArmor = new Armor(7, "Splint Armor");
		
		
		
		while(1 != 0) {
			System.out.println("which weapon do you want? Leather Armor[1], Chain Armor[2], Splint Armor[3]");
			int choice = input.nextInt();
			int x;
			switch (choice) {
				case 1:
					System.out.println(leatherArmor);
					System.out.println("Are you sure? yes[1] no[2]");
					x = input.nextInt();
					if(x == 1) {
						return leatherArmor;
					}
					else {
						continue;
					}

				case 2:
					System.out.println(chainArmor);
					System.out.println("Are you sure? yes[1] no[2]");
					x = input.nextInt();
					if(x == 1) {
						return chainArmor;
					}
					else {
						continue;
					}
					
				case 3:
					System.out.println(splintArmor);
					System.out.println("Are you sure? yes[1] no[2]");
					x = input.nextInt();
					if(x == 1) {
						return splintArmor;
					}
					else {
						continue;
					}
					
			}
		}
		
	}
	
		
		
		
		
		
		
		
		
	}

