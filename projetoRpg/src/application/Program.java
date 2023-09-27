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
		int x = (random.nextInt(2)+1);
		
		if(choice == x) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	

	public static void menu() {
		Formatting.slowPrint10("\nwhat do you want to do?\n");
		Formatting.slowPrint10("[1] game [2] background [3]exit\n");
		
	}
	
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		boolean game;
		
		Monster mimic = new Monster("Mimic", 5, 2, 1, 2, "wind", "fire");
		Monster slime = new Monster("Slime", 30, 8, 2, 1, "poison", "fire");
		Monster globin = new Monster("Globin", 35, 7, 4, 3, "ice", "poison");
		Monster kobold = new Monster("Kobold", 40, 12, 6, 2, "fire", "ice");
		Monster vampire = new Monster("Vampire", 2, 20, 10, 2, "wind", "fire");
		Monster beholder = new Monster("Beholder", 2, 30, 10, 3, "wind", "ice");
		Monster morgarothRoyalGuard = new Monster("Morgaroth the royal guard", 50, 25, 15, 1, "fire","electricity");
		Monster ThalricBountyHunter = new Monster("Thalric the Bounty hunter", 70, 24, 15, 1, "ice","poison");
		
		
		Weapon shortSickle = new Weapon(3, "light", "Short Sicle", "Slash");
		Weapon heavyAxe = new Weapon(7, "heavy", "Heavy Axe", "Slash");
		Weapon bow = new Weapon(10, "heavy", "Heavy Bow", "Slash");
		
		Armor leatherArmor = new Armor(3, "Leather Armour");
		Armor chainArmor = new Armor(5, "Chain Armour");
		Armor ringMailArmor = new Armor(7, "Ring Mail Armour");
		Armor splintArmor = new Armor(12, "Splint Armour");
		Armor plateArmor = new Armor(17, "Plate Armour");
		Armor berserkArmor = new Armor(9000, "Berserk Armour");
		
		Magic fireball = new Magic("Fire ball", "fire", 10);
		Magic iceShards = new Magic("Ice Shards", "ice", 10);
		Magic infestation = new Magic("Infestation", "poison", 10);
		Magic windBlow = new Magic("Wind Blow", "wind", 15);
		Magic lightAttack = new Magic("Light Attack", "electricity", 15);
		
		Market magnus = new Market("Magnus", "Down Hill", "1.a", "market of sown hill", 20, 10, 50, 60);
		//Market freya= new Market("freya", "Dirty Helment", "1.helment, 2. potion, 3. magic", "market of Dirty Helment", 3,7,4,9);
		Formatting.slowPrint50("\n \nGoldriver, the legacy of Goldendelve \n \n");
		while(1 != 0) {
		
		menu();
		int choice = input.nextInt();
		if(choice == 1) {
			Player player = playerActions.characterCreation(input, random);
		
		//Story.firstPartStory(input, player);
		//Story.secondPartStory(input,player);
		//System.out.println(magnus);
		//playerActions.marketsOnGame(input, player, magnus, infestation, null, bow, berserkArmor);
		player.setWeapon(playerActions.weaponSelector(input, shortSickle, heavyAxe));
		player.addMagic(playerActions.magicSelector(input, fireball, iceShards, infestation));
		player.setArmor(playerActions.armorSelector(input, leatherArmor, chainArmor));
		System.out.println(player);
		if(mimicGame(input, random)) {
			Battle.battleWithOneMonster(mimic, player, input);
		}
		//Story.thirdPartStory(input,player);
		//player.setMagic(playerActions.magicSelector(input));
		//Story.fourthPartStory(input,player);
		game = Battle.battleWithThreeMonsters(slime, globin, kobold, player, input, random);
		if(!game) continue;
		playerActions.levelUp(input, 5, player);
		player.resetPlayer();
		System.out.println(player);
		Battle.battleWithOneMonster(slime, player, input);
		Battle.battleWithOneMonster(morgarothRoyalGuard, player, input);
		Battle.battleWithOneMonster(ThalricBountyHunter, player, input);
		
		//Battle.battleWithTwoMonsters(vampire, mimic, player, input, random);
		//Story.fifthPartStory(input,player,morgarothRoyalGuard);
		
		//Story.sixthPartStory(input,player);
		//Story.seventPartStory(input,player);
		//Story.finalOne(input,player);
		//Story.finalTwo(input,player);
		//Battle.battleWithOneMonster(beholder, player, input);
		}
		if(choice == 2) {
			Story.background();
		}
		if(choice == 3) {
			System.out.println("thank you for playing!!!!");
			break;
		}
		}
		
		
		
		
		
		
		
	}

}
