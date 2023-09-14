package entities;

import java.util.Random;
import java.util.Scanner;

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
		Potion potion = new Potion();
		Player player = new Player(name, pv, strength, constitution, agility, dexterity, potion);
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
					System.out.println("\n"+shortSickle);
					System.out.println("\nAre you sure? yes[1] no[2]");
					x = input.nextInt();
					if(x == 1) {
						return shortSickle;
					}
					else {
						continue;
					}

				case 2:
					System.out.println("\n"+lightMace);
					System.out.println("\nAre you sure? yes[1] no[2]");
					x = input.nextInt();
					if(x == 1) {
						return lightMace;
					}
					else {
						continue;
					}
					
				case 3:
					System.out.println("\n"+heavyAxe);
					System.out.println("\nAre you sure? yes[1] no[2]");
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
	public static Magic magicSelector(Scanner input) {
		Magic fireball = new Magic(2, "Fire ball");
		Magic iceShards = new Magic(1, "Ice Shards");
		Magic infestation = new Magic(1, "Infestation");
		
		while(1 != 0) {
			System.out.println("which magic spell do you want? Fire Ball[1], Ice Shards[2], Infestation[3]");
			int choice = input.nextInt();
			int x;
			switch (choice) {
				case 1:
					System.out.println("\n"+fireball);
					System.out.println("\nAre you sure? yes[1] no[2]");
					x = input.nextInt();
					if(x == 1) {
						return fireball;
					}
					else {
						continue;
					}

				case 2:
					System.out.println("\n"+iceShards);
					System.out.println("\nAre you sure? yes[1] no[2]");
					x = input.nextInt();
					if(x == 1) {
						return iceShards;
					}
					else {
						continue;
					}
					
				case 3:
					System.out.println("\n"+infestation);
					System.out.println("\nAre you sure? yes[1] no[2]");
					x = input.nextInt();
					if(x == 1) {
						return infestation;
					}
					
					else {
						continue;
					}
					
			}
		}
	}
	
	public static Armor armorSelector(Scanner input) {
		Armor leatherArmor = new Armor(3, "Leather Armour");
		Armor chainArmor = new Armor(5, "Chain Armour");
		Armor ringMailArmor = new Armor(7, "Ring Mail Armour");
		Armor splintArmor = new Armor(12, "Splint Armour");
		Armor plateArmor = new Armor(17, "Plate Armour");
		Armor berserkArmor = new Armor(9000, "Berserk Armour");
		
		while(1 != 0) {
			System.out.println("which armour do you want? Leather Armor[1], Chain Armor[2], Ring Mail Armor[3]");
			int choice = input.nextInt();
			int x;
			switch (choice) {
				case 1:
					System.out.println("\n"+leatherArmor);
					System.out.println("\nAre you sure? yes[1] no[2]");
					x = input.nextInt();
					if(x == 1) {
						return leatherArmor;
					}
					else {
						continue;
					}

				case 2:
					System.out.println("\n"+chainArmor);
					System.out.println("\nAre you sure? yes[1] no[2]");
					x = input.nextInt();
					if(x == 1) {
						return chainArmor;
					}
					else {
						continue;
					}
					
				case 3:
					System.out.println("\n"+ringMailArmor);
					System.out.println("\nAre you sure? yes[1] no[2]");
					x = input.nextInt();
					if(x == 1) {
						return ringMailArmor;
					}
					
					else {
						continue;
					}
					
			}
		}
		
	}
	
		
		
		
		
		
		
		
		
	}

