package application;
// System.out.println("nome do player eh" + player.getName());
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

import entities.Armor;
import entities.Battle;
import entities.Formatting;
import entities.Monster;
import entities.Player;
import entities.Story;
import entities.Weapon;
import entities.playerActions;


public class Program {
	

	public static void menu() {
		Formatting.slowPrint10("what do you want to do?");
		Formatting.slowPrint10("1. background, 2. game, 3.exit");
	}
	
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		Monster mimic = new Monster("Mimic", 5, 2, 1, 2);
		Monster slime = new Monster("Slime", 10, 3, 1, 2);
		Monster globin = new Monster("Globin", 15, 4, 2, 8);
		Monster kobold = new Monster("Kobold", 20, 5, 3, 4);
		Monster vampire = new Monster("Vampire", 2, 4, 2, 8);
		Monster beholder = new Monster("Beholder", 2, 4, 2, 8);
		Monster morgarothRoyalGuard = new Monster("Morgaroth the royal guard", 2, 10, 8, 6);
		Monster ThalricBountyHunter = new Monster("Thalric the Bounty hunter", 2, 8, 6, 10);
		
		Weapon shortSickle = new Weapon(3, "light", "Short Sicle");
		Weapon heavyAxe = new Weapon(7, "heavy", "Heavy Axe");
		
		Armor leatherArmor = new Armor(3, "Leather Armour");
		Armor chainArmor = new Armor(5, "Chain Armour");
		Armor ringMailArmor = new Armor(7, "Ring Mail Armour");
		Armor splintArmor = new Armor(12, "Splint Armour");
		Armor plateArmor = new Armor(17, "Plate Armour");
		Armor berserkArmor = new Armor(9000, "Berserk Armour");
		
		
		//Story.background();
		Formatting.slowPrint50("\n \nGoldriver, the legacy of Goldendelve \n \n");
		
		
		
		Player player = playerActions.characterCreation(input, random);
		//Story.firstPartStory(input, player);
		//Story.secondPartStory(input,player);
		player.setWeapon(playerActions.weaponSelector(input, shortSickle, heavyAxe));
		//Story.thirdPartStory(input,player);
		//player.setMagic(playerActions.magicSelector(input));
		//Story.fourthPartStory(input,player);
		
		Battle.battleWithTwoMonsters(vampire, mimic, player, input, random);
		//Story.fifthPartStory(input,player,morgarothRoyalGuard);
		player.setArmor(playerActions.armorSelector(input, leatherArmor, chainArmor));
		//Story.sixthPartStory(input,player);
		Story.seventPartStory(input,player);
		Story.finalOne(input,player);
		Story.finalTwo(input,player);
		
		//Battle.battleWithThreeMonsters(slime, globin, kobold, player, input, random);
		
		//Battle.battleWithOneMonster(beholder, player, input);
		
		
		
	}

}
