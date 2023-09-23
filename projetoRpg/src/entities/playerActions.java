package entities;

import java.util.Random;
import java.util.Scanner;

public class playerActions {
	public static Player characterCreation(Scanner input, Random random) {
		System.out.println("What is your character's name");
		String name = input.next();
		
		int strength = 0, constitution = 0, agility = 0, dexterity = 0, pv, coin = 0;
		 
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
		System.out.println("how much coins do you want?:");
		coin = input.nextInt();
		Player player = new Player(name, pv, strength, constitution, agility, dexterity, potion, coin);
		return player;
		
		
	}
	
	public static Weapon weaponSelector(Scanner input, Weapon weapon1, Weapon weapon2) {
		
		
		while(1 != 0) {
			System.out.println("which weapon do you want?"+ weapon1.getWeaponName() + "[1], "+ weapon2.getWeaponName() + "[2]");
			int choice = input.nextInt();
			int x;
			switch (choice) {
				case 1:
					System.out.println("\n"+ weapon1);
					System.out.println("\nAre you sure? yes[1] no[2]");
					x = input.nextInt();
					if(x == 1) {
						return weapon1;
					}
					else {
						continue;
					}
					
				case 2:
					System.out.println("\n"+ weapon2);
					System.out.println("\nAre you sure? yes[1] no[2]");
					x = input.nextInt();
					if(x == 1) {
						return weapon2;
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
	
	public static Market marketsOnGame(Scanner input) {
		Market magnus = new Market("Magnus", "Down Hill", "1. sword, 2. shield, 3. magic", "market of downhill", 2);
		Market freya= new Market("freya", "Dirty Helment", "1.helment, 2. potion, 3. magic", "market of Dirty Helment", 3);
		
		
		while(1 != 0) {
			System.out.println("which magic spell do you want? Fire Ball[1], Ice Shards[2], Infestation[3]");
			int choice = input.nextInt();
			int x;
			switch (choice) {
				case 1:
					System.out.println("\n"+magnus);
					System.out.println("\nAre you sure? yes[1] no[2]");
					x = input.nextInt();
					if(x == 1) {
						return magnus;
					}
					else {
						continue;
					}

				case 2:
					System.out.println("\n"+freya);
					System.out.println("\nAre you sure? yes[1] no[2]");
					x = input.nextInt();
					if(x == 1) {
						return freya;
					}
					else {
						continue;
					}
					
					
			}
		}
	}
	public static Armor armorSelector(Scanner input, Armor armor1, Armor armor2) {
		
		while(1 != 0) {
			System.out.println("which armour do you want? "+ armor1.getArmorName() +"[1], "+ armor2.getArmorName() +"[2]");
			int choice = input.nextInt();
			int x;
			switch (choice) {
				case 1:
					System.out.println("\n"+armor1);
					System.out.println("\nAre you sure? yes[1] no[2]");
					x = input.nextInt();
					if(x == 1) {
						return armor1;
					}
					else {
						continue;
					}

				case 2:
					System.out.println("\n"+armor2);
					System.out.println("\nAre you sure? yes[1] no[2]");
					x = input.nextInt();
					if(x == 1) {
						return armor2;
					}
					else {
						continue;
					}
					
			}
		}
		
	}
	public static void levelUp(Scanner input, int level, Player player) {
        System.out.println("Congratulations you leveled up!!!!!/n You have gained "+ level + " attribute points, allocate them correctly:\n\n");

        int strength = 0, constitution = 0, agility = 0, dexterity = 0;

        while (strength + constitution + agility + dexterity != level) {
            System.out.println("how many points do you want to put in strength?:");
            strength = input.nextInt();
            System.out.println("how many points do you want to put in constitution?:");
            constitution = input.nextInt();
            System.out.println("how many points do you want to put in agility?:");
            agility = input.nextInt();
            System.out.println("how many points do you want to put in dexterity?:");
            dexterity = input.nextInt();
            if (strength + constitution + agility + dexterity != level) {
                System.out.println("please allocate the "+ level +"points correctly");
            }
        }
        player.getAllAtributes(strength, constitution, agility, dexterity);
        player.setPVMax((double)player.getPVMax() + player.getConstitution());

    }
		
		
		
		
		
		
	}

