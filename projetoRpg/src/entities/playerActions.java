package entities;

import java.util.Random;
import java.util.Scanner;

public class playerActions {
	public static Player characterCreation(Scanner input, Random random) {
		System.out.println("What is your character's name");
		String name = input.next();
		
		int strength = 0, constitution = 0, agility = 0, dexterity = 0, pv, coin;
		 
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
	
	public static Magic magicSelector(Scanner input, Magic magic1, Magic magic2, Magic magic3) {
		
		
		while(1 != 0) {
			System.out.println("which magic spell do you want? "+ magic1.getMagicName() +"[1], "+ magic2.getMagicName() +"[2], "+magic3.getMagicName()+"[3]");
			int choice = input.nextInt();
			int x;
			switch (choice) {
				case 1:
					System.out.println("\n"+magic1.magicStatus());
					System.out.println("\nAre you sure? yes[1] no[2]");
					x = input.nextInt();
					if(x == 1) {
						return magic1;
					}
					else {
						continue;
					}

				case 2:
					System.out.println("\n"+magic2.magicStatus());
					System.out.println("\nAre you sure? yes[1] no[2]");
					x = input.nextInt();
					if(x == 1) {
						return magic2;
					}
					else {
						continue;
					}
					
				case 3:
					System.out.println("\n"+magic3.magicStatus());
					System.out.println("\nAre you sure? yes[1] no[2]");
					x = input.nextInt();
					if(x == 1) {
						return magic3;
					}
					
					else {
						continue;
					}
					
			}
		}
	}
	
	public static Market marketsOnGame(Scanner input, Player player, Market market, Magic magic1, Potion potion1, Weapon weapon, Armor armor) {
		
		
		
		while(1 != 0) {
			System.out.println("\nHello traveler what do you want to buy? \n1. " + magic1.getMagicName() +  " = " + market.getMagicCost() + "\n2. potion = " + market.getPotionCost() + "\n3. " + armor.getArmorName() + " = " + market.getArmorCost() + "\n4. " + weapon.getWeaponName()	+ " = " + market.getWeaponCost() +"\n5.sair ");
			int choice = input.nextInt();
			int x;
			int y;
			switch (choice) {
				case 1:
					if(player.getCoin() >= market.getMagicCost()) {
						
						System.out.println("\nAre you sure? yes[1] no[2]");
						//return weapon1;
						x = input.nextInt();
						if(x == 1) {
							magic1.getMagicName();
							player.setCoin(player.getCoin()-market.getMagicCost());
							player.addMagic(magic1);
							System.out.println("\nDo you want something more? yes[1] no[2]");
							y = input.nextInt();
							if(y == 1) {
							return market;
							}
							else {
								continue;
							}
						}
						else {
							continue;
						}
						
					}
					else {
						System.out.println("\nyou don't have enough money");
						continue;
					}
				case 2:
					if(player.getCoin() >= market.getPotionCost()) {
						
						System.out.println("\nAre you sure? yes[1] no[2]");
						//return weapon1;
						x = input.nextInt();
						if(x == 1) {
							player.setAmountPotions(-1);
							player.setCoin(player.getCoin()-market.getPotionCost());
							System.out.println("\nIs that all you want? yes[1] no[2]");
							y = input.nextInt();
							if(y == 1) {
							return market;
							}
							else {
								continue;
							}
						
						}
						else {
							continue;
						}
					}
					else {
						System.out.println("\nyou don't have enough money");
						continue;
					}
				case 3:
					if(player.getCoin() >= market.getWeaponCost()) {
						
						System.out.println("\nAre you sure? yes[1] no[2]");
						x = input.nextInt();
						if(x == 1) {
							player.setCoin(player.getCoin()-market.getWeaponCost());
							player.setWeapon(weapon);
							System.out.println("\nDo you want something more? yes[1] no[2]");
							y = input.nextInt();
							if(y == 1) {
							return market;
							}
							else {
								continue;
							}
						}
						else {
							continue;
						}
						
					}
				case 4:
					if(player.getCoin() >= market.getArmorCost()) {
						
						System.out.println("\nAre you sure? yes[1] no[2]");
						x = input.nextInt();
						if(x == 1) {
							player.setCoin(player.getCoin()-market.getArmorCost());
							player.setArmor(armor);
							System.out.println("\nDo you want something more? yes[1] no[2]");
							y = input.nextInt();
							if(y == 1) {
							return market;
							}
							else {
								continue;
							}
						}
						else {
							continue;
						}
						
					}
				case 5:
					return market;
	
					

				
					
					
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
		System.out.println("you are feeling your body getting stronger.....\n\n");
		Formatting.lineBreaker();
        System.out.println("Congratulations you leveled up!!!!! \nYou have gained "+ level + " attribute points, allocate them correctly:\n\n");

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

