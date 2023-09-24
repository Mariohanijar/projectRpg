package application;
// System.out.println("nome do player eh" + player.getName());
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
	

	public static void menu() {
		slowPrint10("what do you want to do?");
		slowPrint10("1. background, 2. game, 3.exit");
	}
	
	public static void background() {
		slowPrint10("In the king of Gondendelve, was born a Patriarch dwarf of the Decker family (one of the richest in the region), he was always \ninterested in fighting, especially because of his father (a brilliant warrior who was the king's personal bodyguard) \nwho taught him all about combat, ");
		slowPrint10("the brilliant Adrik Decker. One day his father left for a mission. \nIn this realm there was a group of very feared elves, who lived looting what they found, when the group found that the legendary Decker \nhad left, they went straight to his house to loot, \nGoldriver at 12 was");
		slowPrint10(" training in his yard when he heard his mother screamed, when he got there the elves had killed his mother and were looting \nas many things as they could,  The boy then showed all his training and killed all the elves, being respected by all the kingdom for defeating such a scary group. ");
		slowPrint10( "\nThe father, after discovering what had happened, could not stand the news and ended up killing himself, but not without first \nleaving all of his equipment for his son.. The king, seeing the boy's skill and with the friendship with his \nfather, granted him a space in the kingdom to be trained ");
		slowPrint10( "to be\nthe king's new guard. In the meantime, Goldriver remained extremely shaken by the situation, \neven though he was considerate in training, he couldn't talk to anyone, Decker tried to seek peace but failed miserably. \nAfter a few years beeing the personal king's guard, Decker finally found a friend,");
		slowPrint10( " he was realy carasmatic and was\na noble just like him. After months of conversation, the friend told to \nAdrik that the king wasnt so good as he seemed to be, the dwarf couldn't belive but after seeing some dirty attitudes of the king,\nlike corruption and unnecessary murders, Goldriver tries to confront ");
		slowPrint10( "him about all the corruption in the kingdom, \nthe king seeing all the pressure that was attracted to him, he orders to execute Goldriver, \nbut the friend of decker by some noble friends discovered \nthe order. After tell everything, ");
		slowPrint10("the paladin decide to hide in the deepest suburbs of Goldendelve, \nthe friend decides to go with him\r\n");
		//slowPrint10("");
		slowPrint10("so Goldrive quickly take somepart of his equipment and the rest of his inheritance. ");
		slowPrint50("\nNow, Goldriver and his friend starts an entire adventure to scape the kingdom. \r\n");
		
	}
	
	public static void firstPartStory( Scanner input, Player player) {
		slowPrint50("\n\nTwo months after\n\n");
		slowPrint10("Goldriver and "+ player.getName() + " are hiding in a forest trying to find someplace to sleep");
		slowPrint10("\nGoldriver:So how's it going "+ player.getName());
		slowPrint10("\n" + player.getName()+":definetly not so good, I'm really don't know how the king did all that horrible things.");
		slowPrint10("\nGoldriver: me neither, but unfortnately there is nothing we can do, so are you hungry?");
		slowPrint10("\n"+player.getName()+":starving");
		slowPrint10("\nok listen, it is starting to be dangerous here, let's split ourselves, I'm going to find some food and you try to find someplace to we rest\r\n"
				+ "See that cave overthere must be safe to we sleep.");
		slowPrint10("\nafter split yourselves " +player.getName() +" entry in the cave, going over there, he heard a noise bellow the cave, \nafter some steps you try to find which noise was that.");
		slowPrint10("You start to go down and down in the cave, after some steps \nyou see a strange door, after entry inside, a mysterious person lock the door, you try to oppend but you failed, \nso now you see two grottous, one is bright and seems to have something valuable, the other one looks like the right way to find Goldriver. \nwhich way do you prefer to go?");
	}
	public static void treasureWay( Scanner input, Player player) {
		slowPrint10("\nafter walk to the grotto, you heard a mysterous noise and looking behind a huge rock fall");
		slowPrint10("blocking your way back, you see a letter under you saying that you must pay attention\r\n");
		slowPrint10("it really has a tresure but one of the treasures is really a treasure and the other one is a monster that will try to kill you. \r\n");
	}
	
	public static void theWayOutOfCave( Scanner input, Player player) {
		slowPrint10("going to the way out, you see a light that can be a way out of the cave, \nbut you heard something and after look behind a mysterious creature approachs trying to kill you.");
	}
	
	public static void secondPartStory( Scanner input, Player player) {
		slowPrint10("\nafter winning the monster you hear a scream");
		slowPrint10("\nGoldriver: "+player.getName().toUpperCase()+" ARE YOU FINE?");
		slowPrint10("\n"+player.getName()+":I'm really scared, what had I done?");
		slowPrint10("\nGoldriver: you were really lucky, you could died here, I can't always protect you " + player.getName());
		slowPrint10("I will train you, just like my dad did to me.");
		slowPrint10("\n"+player.getName()+" but Goldriver...");
		slowPrint10("\nGoldriver: ENOUGH, it's getting really dark here, let's get other spot");
		
		slowPrint50("\nAfter one month");
		slowPrint10("\nafter one month, Goldriver train you everyday to learn how to fight with enemyes");
		slowPrint10("\nGoldriver: Okay, " + player.getName() + " I see that you already are ready to use a weapon, \nI pick those ones in my travels. Choose the one that you enjoy more.\n");
	}
	public static void thirdPartStory( Scanner input, Player player) {
		slowPrint10("\nGoldriver: nice choice, I think we should go to a tavern, \nI'm really tired of walking for so many districts.");
		slowPrint10("\n"+player.getName()+":Me too, I really need to take a shower.");
		slowPrint10("\nAfter walking for many hours, you find a nice district Down Hill, A really calm place");
		slowPrint10("\nGoldriver: " +player.getName()+ " you saw that? haha a tavern. I really want a huge bed to sleep");
		slowPrint10("\n"+player.getName()+":And which bed isn't huge for you Goldriver?");
		slowPrint10("\nGoldriver: if you start with these jokes, I'm gonna show you who is small");
		
		slowPrint10("\nAfter some jokes, you entry in the tavern. Over there, you see some interesting places to go.");
	}
	public static void MercantMagnusDialog( Scanner input, Player player) {
		
	}
	public static void GambleDialogue( Scanner input, Player player) {
		
		
	}
	public static void fourthPartStory( Scanner input, Player player) {
		slowPrint10("\nAfter drink a little, you finally rent a room to sleep. But, A strange \nperson don't stop to look at you. After seeing this, but you don't mind and go to your room anyway.");
		slowPrint10("\nIn the middle of the night, you wake up and percive that the door handle \nis doing a strange noise, you quickly take your sword and the stranger open the door");
		slowPrint10("\nStranger: Hello " + player.getName() + " ,It's been a quiet while, doesn't it?");
		slowPrint10("\n"+player.getName()+":who the hell are you?");
		slowPrint10("\nStranger: you and the old Decker are all stupid shit, \nyou really think that you are better than the king?");
		slowPrint10("\n"+player.getName()+":the old Danyel is lost in all his power");
		slowPrint50("\nStranger: I already heard a lot of this crap, TAKE THIS");
		
	}
	
	public static void fifthPartStory( Scanner input, Player player, Monster monster) {
		slowPrint10("\nafter a lot of noise, Goldriver run to you and find the " + monster.getName());
		slowPrint10("\nGoldriver: what the hell happend?");
		slowPrint100("\n"+monster.getName()+":..., h... hiha... haha");
		slowPrint50("\n"+monster.getName()+":you really think it's over?, King Danyel already \nknows about your spot, I would start running if I were you.");
		slowPrint10("\n"+player.getName()+":why aren't you just leave us alone? We don't give a damn about the king");
		slowPrint10("\n"+monster.getName()+":You don't see what have you done, ");
		slowPrint50("you are ALL DEAD, GOLDRIVER," + player.getName() + " \nIS CONDEMNED TO DEATH, BECAUSE EVERYONE THAT YOU CARE DIE, DIE, DIE");
		slowPrint50("\nGoldriver, after heard all this, he take his axe and cut the head of" + monster.getName());
		slowPrint10("\nGoldriver: I heard enough let's get out of here before the situation get worse");
		slowPrint50("\n"+player.getName()+":o... ok");
		slowPrint10("\nbut, after some time a local starts talking with you");
		slowPrint10("\nMagnus: you really deafeted the " + monster.getName());
		slowPrint10("\n"+player.getName()+"yeah");
		slowPrint10("\nMagnus: that's wonderful, he was really damaging everyone's lives");
		slowPrint10("\nGoldriver: Sorry, we really need to go");
		slowPrint10("\nMagnus: Wait before you go, please young boy \nI would be preatty happy if you choose one of these armors as a gift. \n");
	}
	public static void sixthPartStory( Scanner input, Player player) {
		slowPrint100("Two weeks after");
		slowPrint50("\nleaving Down Hill " + player.getName()+ " and Goldriver run to other district Dirty Helment, after hide in a abandoned house, trying to start a fire to get warmer");
		slowPrint10("\n"+player.getName()+":It's really cold here");
		slowPrint10("\nGoldriver: we need to kill the king, and all of this is over");
		slowPrint10("\n"+player.getName()+":Don't say this Goldriver, revange it's a foolish game, I don't wanna live running all the time"); 
		slowPrint10("\nWe can travel to Kriften, I heard that is a nice place, with incredible people, I think we can start again over there");
		slowPrint10("\nGoldriver: you really think it's a good Idea?");
		slowPrint10("\n"+player.getName()+":with all the certainty in the world");
		
		slowPrint10("\nAfter some hours, you finally get out of the house, going towards kriften. \nYou see a mercant, do you want to trade with him?");
	}
	public static void MercantFreyaDialog( Scanner input, Player player) {
		
	}
	public static void seventPartStory( Scanner input, Player player) {
		slowPrint50("\nafter some walk, you are almost leaving Dirty Helment when an arrow falls in front of Goldriver,");
		slowPrint50("\nthe king with all his guard was aiming at you");
		slowPrint50("\nDanyel: GOLDRIVER, YOU REALLY THOUGHT YOU COULD ESCAPE?");
		slowPrint50("\nGoldriver:We don't wanna fight Danyel, we just want to leave the kingdom, I don't care about your dirty work");
		slowPrint50("\nDanyel: You never was like your father, Adrik was much better than you.");
		slowPrint50("\nGoldriver: my parents are dead because of your pathetic guardianship");
		slowPrint50("\nDanyel: YOU ARE DEAD DECKER");
		slowPrint50("\n"+player.getName()+" seeing that Decker would die, pushes Goldriver in the direction of a lake, now "+player.getName() + " was the only one against all the guards of the king");
		
		slowPrint50("\nDanyel: I'm not gonna lie, you are tought kid, but not for me.");
		slowPrint50("\ndrop this peace of shit in a bonfire, \n" + player.getName()+ " dies honorably saving his friend");
		
		slowPrint50("\nafter hours of the dead of " + player.getName() +", Goldriver finnaly finds a way to get out of the lake.");
		slowPrint50("\nhe see somepeople walking a little further, so he hides in a hole, \nGoldriver sees some nobles celebrating that one of the outlaws were finally dead");
		slowPrint50("\nGoldriver couldn't heard all that, so he need to think about one of the most important choices of his life");
		
	}
	public static void finalTwo(Scanner input, Player player) {
		slowPrint100("non-canonical ending");
		slowPrint50("\nGoldriver with a insane rage, get out of the hole and starts screaming and start a combat\r\n");
		slowPrint100("\nPLEASE STOP \nKIDS RUN AWAY");
		slowPrint50("\nGoldriver starts killing all the village. Until the king appears");
		slowPrint50("\nafter the king came, Goldriver starts screaming");
		slowPrint100("\nGoldriver:DANYEL YOU ARE DEADDDDDDDDDDDDDD");
		slowPrint50("\nnow Goldriver recieve his revange and starts an empire with all his angry, \nkilling everyone that cross your path \n\n\n");
		
		slowPrint100("thank you for playing");
	}
	public static void finalOne(Scanner input, Player player) {
		slowPrint100("\ncanonical ending");
		slowPrint50("\nGoldriver remember his friend telling that revenge wasn't worth it, \nso he prefers to ignore ");
		slowPrint50("\nall that riot, and leave Dirty Helment");
		slowPrint50("\nNow with 22 years old, Decker is alone, \nsought by the kingdom and looking for some meaning to his life.");
		slowPrint50("\nHe follows his adventure searching for some peace in Kriften");
		slowPrint100("\njust like "+ player.getName() + " asked for...");
		
		slowPrint100("\nthank you for playing");
	}
	
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
	public static void slowPrint100(String output) {

	    for (int i = 0; i<output.length(); i++) {
	      char c = output.charAt(i);
	      System.out.print(c);
	      try {
	        TimeUnit.MILLISECONDS.sleep(100);
	      }
	      catch (Exception e) {
	      }
	    }
	}
	//public static void 
	
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
		
		
		//background();
		slowPrint50("\n \nGoldriver, the legacy of Goldendelve \n \n");
		
		
		
		Player player = playerActions.characterCreation(input, random);
		//firstPartStory(input, player);
		//secondPartStory(input,player);
		player.setWeapon(playerActions.weaponSelector(input, shortSickle, heavyAxe));
		//thirdPartStory(input,player);
		//player.setMagic(playerActions.magicSelector(input));
		//fourthPartStory(input,player);
		
		Battle.battleWithTwoMonsters(vampire, mimic, player, input, random);
		//fifthPartStory(input,player,morgarothRoyalGuard);
		player.setArmor(playerActions.armorSelector(input, leatherArmor, chainArmor));
		//sixthPartStory(input,player);
		seventPartStory(input,player);
		finalOne(input,player);
		finalTwo(input,player);
		
		//Battle.battleWithThreeMonsters(slime, globin, kobold, player, input, random);
		
		//Battle.battleWithOneMonster(beholder, player, input);
		
		
		
	}

}
