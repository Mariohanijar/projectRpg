package application;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import entities.Armor;
import entities.Battle;
import entities.Monster;
import entities.Player;
import entities.Weapon;
import entities.playerActions;


public class Program {
	
	//slow print
	public static void slowPrint10(String output) {
	    for (int i = 0; i<output.length(); i++) {
	      char c = output.charAt(i);
	      System.out.print(c);
	      try {
	        TimeUnit.MILLISECONDS.sleep(10);
	      }
	      catch (Exception e) {
	      }
	    }
	}
	
	public static void slowPrint50(String output) {
	    for (int i = 0; i<output.length(); i++) {
	      char c = output.charAt(i);
	      System.out.print(c);
	      try {
	        TimeUnit.MILLISECONDS.sleep(50);
	      }
	      catch (Exception e) {
	      }
	    }
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
		
		
		
		Weapon shortSickle = new Weapon(3, "light", "Short Sicle");
		Weapon heavyAxe = new Weapon(7, "heavy", "Heavy Axe");
		
		Armor leatherArmor = new Armor(3, "Leather Armour");
		Armor chainArmor = new Armor(5, "Chain Armour");
		Armor ringMailArmor = new Armor(7, "Ring Mail Armour");
		Armor splintArmor = new Armor(12, "Splint Armour");
		Armor plateArmor = new Armor(17, "Plate Armour");
		Armor berserkArmor = new Armor(9000, "Berserk Armour");
		
		//slowPrint10("In the king of Gondendelve, was born a Patriarch dwarf of the Decker family (one of the richest in the region), he was always \ninterested in fighting, especially because of his father (a brilliant warrior who was the king's personal bodyguard) \nwho taught him all about combat, the brilliant Adrik Decker. One day his father left for a mission. \nIn this realm there was a group of very feared elves, who lived looting what they found, when the group found that the legendary Decker \nhad left, they went straight to his house to loot, \nGoldriver at 12 was training in his yard when he heard his mother screamed, when he got there the elves had killed his mother and were looting \nas many things as they could,  The boy then showed all his training and killed all the elves, being respected by all the kingdom for defeating such a scary group. \nThe father, after discovering what had happened, could not stand the news and ended up killing himself, but not without first \nleaving all of his equipment for his son.. The king, seeing the boy's skill and wit hthe friendship with his \nfather, granted him a space in the kingdom to be trained to be\n the king's new guard. In the meantime, Goldriver remained extremely shaken by the situation, even though he was considerate in training, he couldn't talk to anyone, Decker tried to seek peace but failed miserably. After a few years beeing the personal king's guard, Decker finally found a friend, he was realy carasmatic and was\n a noble just like him. \nAfter months of conversation, the friend told to Adrik that the king wasnt so good as he seemed to be, the dwarf couldn't belive but after seeing some dirty attitudes of the king,\nlike corruption and unnecessary murders, Goldriver tries to confront him about all the corruption in the kingdom, \nthe king seeing all the pressure that was attracted to him, he orders to execute Goldriver, \nbut the friend of decker by some noble friends discovered \nthe order. After tell everything, the paladin decide to hide in the deepest suburbs of Goldendelve, \nthe friend decides to go with him\r\n"
		//		+ "so Goldrive quickly take somepart of his equipment and the rest of his inheritance. ");
		//slowPrint50("\nNow, Goldriver and his friend starts an entire adventure to scape the kingdom. \r\n");
		//
		slowPrint50("\n \nGoldriver, the legacy of Goldendelve \n \n");
		Player player = playerActions.characterCreation(input, random);
		System.out.println("nome do player eh" + player.getName());
		player.setWeapon(playerActions.weaponSelector(input, shortSickle, heavyAxe));
		player.setMagic(playerActions.magicSelector(input));
		player.setArmor(playerActions.armorSelector(input, leatherArmor, chainArmor));
		System.out.println(player);
		
		Battle.battleWithThreeMonsters(slime, globin, kobold, player, input, random);
		Battle.battleWithTwoMonsters(vampire, mimic, player, input, random);
		Battle.battleWithOneMonster(beholder, player, input);
		
		
		
	}

}
