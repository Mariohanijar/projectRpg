package application;

// System.out.println("nome do player eh" + player.getName());
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

import entities.Armor;
import entities.Battle;
import entities.Formatting;
import entities.Magic;
import entities.Market;
import entities.Monster;
import entities.Player;
import entities.Story;
import entities.Weapon;
import entities.playerActions;

public class Program {
	public static boolean mimicGame(Scanner input, Random random) {
		System.out.println("which chest do you want to open? \nchest[1] \nchest[2]");
		int choice = input.nextInt();
		int x = (random.nextInt(2) + 1);

		if (choice == x) {
			return true;
		} else {
			return false;
		}

	}

	public static void menu() {
		Formatting.slowPrint10("\nwhat do you want to do?\n");
		Formatting.slowPrint10("[1] Start Game [2] Background [3] Exit\n");

	}

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		boolean game;

		Monster mimic = new Monster("Mimic", 15, 4, 1, 2, "wind", "fire");
		Monster slime = new Monster("Slime", 30, 4, 2, 1, "poison", "fire");
		Monster globin = new Monster("Globin", 35, 6, 4, 3, "ice", "poison");
		Monster kobold = new Monster("Kobold", 40, 8, 6, 2, "fire", "ice");
		Monster morgarothRoyalGuard = new Monster("Morgaroth the royal guard", 60, 16, 15, 1, "fire", "wind");
		Monster ThalricBountyHunter = new Monster("Thalric the Bounty hunter", 60, 15, 15, 1, "ice", "poison");
		Monster theGambleMan = new Monster("The Gamble Man", 40, 8, 15, 1, "ice", "poison");
		Monster RoyalGuard = new Monster("Royal Guard", 10, 5, 3, 2, "ice", "poison");
		Monster RoyalGuard2 = new Monster("Royal Guard", 10, 5, 3, 2, "ice", "electricity");
		Monster king = new Monster("King", 1000, 40, 3, 2, "fire", "electricity");

		Weapon shortSickle = new Weapon(3, "light", "Short Sickle", "Slash");
		Weapon heavyAxe = new Weapon(5, "heavy", "Heavy Axe", "Slash");
		Weapon Morningstar = new Weapon(8, "heavy", "Morningstar", "Slash");
		Weapon bow = new Weapon(10, "heavy", "Heavy Bow", "Slash");
		Weapon dagger = new Weapon(5, "light", "dagger", "Slash");
		Weapon dragonSlayer = new Weapon(20, "heavy", "Dragon Slayer", "Slash");

		Armor leatherArmor = new Armor(3, "Leather Armour");
		Armor chainArmor = new Armor(5, "Chain Armour");
		Armor ringMailArmor = new Armor(7, "Ring Mail Armour");
		Armor splintArmor = new Armor(12, "Splint Armour");
		Armor plateArmor = new Armor(17, "Plate Armour");
		Armor berserkArmor = new Armor(25, "Berserk Armour");

		Magic fireBall = new Magic("Fire ball", "fire", 20);
		Magic iceShards = new Magic("Ice Shards", "ice", 15);
		Magic infestation = new Magic("Infestation", "poison", 15);
		Magic windBlow = new Magic("Wind Blow", "wind", 15);
		Magic lightAttack = new Magic("Light Attack", "electricity", 15);
	    Magic magicMissile = new Magic("Magic Missile", "magic", 10);

		Market magnus = new Market("Magnus", "Down Hill", "1.fireball, 2.Potion, 3.", "market of sown hill", 20, 10, 50,
				60);
		Market freya = new Market("freya", "Dirty Helment", "1.helment, 2. potion, 3. magic", "market of Dirty Helment",
				30, 15, 80, 120);
		Formatting.slowPrint50("\n \nGoldriver, the legacy of Goldendelve \n \n");
		while (1 != 0) {

			menu();
			int choice = input.nextInt();
			if (choice == 1) {
				Player player = playerActions.characterCreation(input, random);
				player.setWeapon(playerActions.weaponSelector(input, shortSickle, heavyAxe));
				player.setArmor(playerActions.armorSelector(input, leatherArmor, chainArmor));
				player.addMagic(magicMissile);
				 Story.firstPartStory(input, player);

				choice = input.nextInt();
				if (choice == 1) {
					Story.treasureWay(input, player);
					if (mimicGame(input, random)) {
						Battle.battleWithOneMonster(mimic, player, input);
						System.out.println("\nCongratulations you defeated the mimic!");
						System.out.println("\nSearching inside the mimic you find 30 coins!");
						player.setCoin(player.getCoin() + 30);
					} else {
						System.out.println("\nCongratulations you find the treasure!, you get 30 coins!");
						player.setCoin(player.getCoin() + 30);
					}
				}
				Story.theWayOutOfCave(input, player);
				game = Battle.battleWithThreeMonsters(slime, globin, kobold, player, input, random);
				if (!game)
					continue;
				int bounty = random.nextInt(10) + 1 + random.nextInt(10) + 1 + random.nextInt(10) + 1
						+ random.nextInt(10) + 1;
				player.setCoin(player.getCoin() + bounty);
				System.out.println("You find " + bounty + " coins!!!");
				player.resetPlayer();
				Story.secondPartStory(input, player);

				player.setWeapon(playerActions.weaponSelector(input, dagger, Morningstar));
				Story.magicDialogue(input, player);
				player.addMagic(playerActions.magicSelector(input, fireBall, infestation, iceShards));
				playerActions.levelUp(input, 5, player);
				player.resetPlayer();
				
				Story.thirdPartStory(input, player);

				while (choice != 3) {
					Formatting.slowPrint10(
							"\n\n[1] buy something in the market [2] play gambling  games [3] rent a room [4] see the inventory\n");
					choice = input.nextInt();

					if (choice == 1) {
						System.out.println(magnus);
						playerActions.marketsOnGame(input, player, magnus, windBlow, null, bow, ringMailArmor);
					} else if (choice == 2) {
						if (player.getCoin() >= 40) {
							Story.GambleDialogue(input, player);
							choice = input.nextInt();
							if (choice == 1) {
								boolean win = mimicGame(input, random);
								if (win && choice == 1) {
									System.out.println("\nCongratulations you find the treasure!, you get 100 coins");
									player.setCoin(player.getCoin() + 100);
								} else {
									Formatting.slowPrint10("\nSorry you didn't find the treasure");
									Formatting.slowPrint50(
											"\n\nDo you want to accept that or fight with the gamble to take your money again? \n[1] accept the lose [2] take the money back");
									choice = input.nextInt();
									if (choice == 1) {
										player.setCoin(player.getCoin() - 40);
									} else {
										Battle.battleWithOneMonster(theGambleMan, player, input);
										System.out.println("\nYou take your money again ");
									}
								}

							}
							else {
								continue;
							}
						} else {
							Formatting.slowPrint10("\nSorry you don't have enough coins");
						}
					}
					if (choice == 4) {
						System.out.println(player);
					}
				}

				Story.fourthPartStory(input, player);
				game = Battle.battleWithTwoMonsters(morgarothRoyalGuard, ThalricBountyHunter, player, input, random);
				if (!game)
					continue;
				player.setCoin(player.getCoin() + bounty);
				System.out.println("You find " + bounty + " coins!!!");
				
				Story.fifthPartStory(input, player, theGambleMan);

				player.setArmor(playerActions.armorSelector(input, splintArmor, plateArmor));

				playerActions.levelUp(input, 10, player);
				player.resetPlayer();

				Story.sixthPartStory(input, player);
				choice = input.nextInt();
				if (choice == 1) {
					System.out.println(freya);
					playerActions.marketsOnGame(input, player, freya, lightAttack, null, dragonSlayer, berserkArmor);
					System.out.println("\nthank you young traveler");
				}

				Story.seventPartStory(input, player);
				Battle.battleWithOneMonster(RoyalGuard, player, input);
				Battle.battleWithOneMonster(RoyalGuard2, player, input);
				Battle.battleWithOneMonster(king, player, input);

				Story.eighthPartStory(input, player);
				choice = input.nextInt();
				if (choice == 1) {
					Story.finalTwo(input, player);
					continue;
				} else {
					Story.finalOne(input, player);
					continue;
				}

			}
			if (choice == 2) {
				Story.background();
			}
			if (choice == 3) {
				System.out.println("thank you for playing!!!!");
				break;
			}
		}

	}

}
