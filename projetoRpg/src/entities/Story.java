package entities;

import java.util.Scanner;

public class Story {
	public static void background() {
		Formatting.slowPrint10("In the king of Gondendelve, was born a Patriarch dwarf of the Decker family (one of the richest in the region), he was always \ninterested in fighting, especially because of his father (a brilliant warrior who was the king's personal bodyguard) \nwho taught him all about combat, ");
		Formatting.slowPrint10("the brilliant Adrik Decker. One day his father left for a mission. \nIn this realm there was a group of very feared elves, who lived looting what they found, when the group found that the legendary Decker \nhad left, they went straight to his house to loot, \nGoldriver at 12 was");
		Formatting.slowPrint10(" training in his yard when he heard his mother screamed, when he got there the elves had killed his mother and were looting \nas many things as they could,  The boy then showed all his training and killed all the elves, being respected by all the kingdom for defeating such a scary group. ");
		Formatting.slowPrint10( "\nThe father, after discovering what had happened, could not stand the news and ended up killing himself, but not without first \nleaving all of his equipment for his son.. The king, seeing the boy's skill and with the friendship with his \nfather, granted him a space in the kingdom to be trained ");
		Formatting.slowPrint10( "to be\nthe king's new guard. In the meantime, Goldriver remained extremely shaken by the situation, \neven though he was considerate in training, he couldn't talk to anyone, Decker tried to seek peace but failed miserably. \nAfter a few years beeing the personal king's guard, Decker finally found a friend,");
		Formatting.slowPrint10( " he was realy carasmatic and was\na noble just like him. After months of conversation, the friend told to \nAdrik that the king wasnt so good as he seemed to be, the dwarf couldn't belive but after seeing some dirty attitudes of the king,\nlike corruption and unnecessary murders, Goldriver tries to confront ");
		Formatting.slowPrint10( "him about all the corruption in the kingdom, \nthe king seeing all the pressure that was attracted to him, he orders to execute Goldriver, \nbut the friend of decker by some noble friends discovered \nthe order. After tell everything, ");
		Formatting.slowPrint10("the paladin decide to hide in the deepest suburbs of Goldendelve, \nthe friend decides to go with him\r\n");
		//Formatting.slowPrint10("");
		Formatting.slowPrint10("so Goldrive quickly take somepart of his equipment and the rest of his inheritance. ");
		Formatting.slowPrint50("\nNow, Goldriver and his friend starts an entire adventure to scape the kingdom. \r\n");
		
	}
	
	public static void firstPartStory( Scanner input, Player player) {
		Formatting.slowPrint50("\n\nTwo months after\n\n");
		Formatting.slowPrint10("Goldriver and "+ player.getName() + " are hiding in a forest trying to find someplace to sleep");
		Formatting.slowPrint10("\nGoldriver:So how's it going "+ player.getName());
		Formatting.slowPrint10("\n" + player.getName()+":definetly not so good, I'm really don't know how the king did all that horrible things.");
		Formatting.slowPrint10("\nGoldriver: me neither, but unfortnately there is nothing we can do, so are you hungry?");
		Formatting.slowPrint10("\n"+player.getName()+":starving");
		Formatting.slowPrint10("\nok listen, it is starting to be dangerous here, let's split ourselves, I'm going to find some food and you try to find someplace to we rest\r\n"
				+ "See that cave overthere must be safe to we sleep.");
		Formatting.slowPrint10("\nafter split yourselves " +player.getName() +" entry in the cave, going over there, he heard a noise bellow the cave, \nafter some steps you try to find which noise was that.");
		Formatting.slowPrint10("You start to go down and down in the cave, after some steps \nyou see a strange door, after entry inside, a mysterious person lock the door, you try to oppend but you failed, \nso now you see two grottous, one is bright and seems to have something valuable, the other one looks like the right way to find Goldriver. \nwhich way do you prefer to go?");
	}
	public static void treasureWay( Scanner input, Player player) {
		Formatting.slowPrint10("\nafter walk to the grotto, you heard a mysterous noise and looking behind a huge rock fall");
		Formatting.slowPrint10("blocking your way back, you see a letter under you saying that you must pay attention\r\n");
		Formatting.slowPrint10("it really has a tresure but one of the treasures is really a treasure and the other one is a monster that will try to kill you. \r\n");
	}
	
	public static void theWayOutOfCave( Scanner input, Player player) {
		Formatting.slowPrint10("going to the way out, you see a light that can be a way out of the cave, \nbut you heard something and after look behind a mysterious creature approachs trying to kill you.");
	}
	
	public static void secondPartStory( Scanner input, Player player) {
		Formatting.slowPrint10("\nafter winning the monster you hear a scream");
		Formatting.slowPrint10("\nGoldriver: "+player.getName().toUpperCase()+" ARE YOU FINE?");
		Formatting.slowPrint10("\n"+player.getName()+":I'm really scared, what had I done?");
		Formatting.slowPrint10("\nGoldriver: you were really lucky, you could died here, I can't always protect you " + player.getName());
		Formatting.slowPrint10("I will train you, just like my dad did to me.");
		Formatting.slowPrint10("\n"+player.getName()+" but Goldriver...");
		Formatting.slowPrint10("\nGoldriver: ENOUGH, it's getting really dark here, let's get other spot");
		
		Formatting.slowPrint50("\nAfter one month");
		Formatting.slowPrint10("\nafter one month, Goldriver train you everyday to learn how to fight with enemyes");
		Formatting.slowPrint10("\nGoldriver: Okay, " + player.getName() + " I see that you already are ready to use a weapon, \nI pick those ones in my travels. Choose the one that you enjoy more.\n");
	}
	public static void thirdPartStory( Scanner input, Player player) {
		Formatting.slowPrint10("\nGoldriver: nice choice, I think we should go to a tavern, \nI'm really tired of walking for so many districts.");
		Formatting.slowPrint10("\n"+player.getName()+":Me too, I really need to take a shower.");
		Formatting.slowPrint10("\nAfter walking for many hours, you find a nice district Down Hill, A really calm place");
		Formatting.slowPrint10("\nGoldriver: " +player.getName()+ " you saw that? haha a tavern. I really want a huge bed to sleep");
		Formatting.slowPrint10("\n"+player.getName()+":And which bed isn't huge for you Goldriver?");
		Formatting.slowPrint10("\nGoldriver: if you start with these jokes, I'm gonna show you who is small");
		
		Formatting.slowPrint10("\nAfter some jokes, you entry in the tavern. Over there, you see some interesting places to go.");
	}
	public static void MercantMagnusDialog( Scanner input, Player player) {
		
	}
	public static void GambleDialogue( Scanner input, Player player) {
		
		
	}
	public static void fourthPartStory( Scanner input, Player player) {
		Formatting.slowPrint10("\nAfter drink a little, you finally rent a room to sleep. But, A strange \nperson don't stop to look at you. After seeing this, but you don't mind and go to your room anyway.");
		Formatting.slowPrint10("\nIn the middle of the night, you wake up and percive that the door handle \nis doing a strange noise, you quickly take your sword and the stranger open the door");
		Formatting.slowPrint10("\nStranger: Hello " + player.getName() + " ,It's been a quiet while, doesn't it?");
		Formatting.slowPrint10("\n"+player.getName()+":who the hell are you?");
		Formatting.slowPrint10("\nStranger: you and the old Decker are all stupid shit, \nyou really think that you are better than the king?");
		Formatting.slowPrint10("\n"+player.getName()+":the old Danyel is lost in all his power");
		Formatting.slowPrint50("\nStranger: I already heard a lot of this crap, TAKE THIS");
		
	}
	
	public static void fifthPartStory( Scanner input, Player player, Monster monster) {
		Formatting.slowPrint10("\nafter a lot of noise, Goldriver run to you and find the " + monster.getName());
		Formatting.slowPrint10("\nGoldriver: what the hell happend?");
		Formatting.slowPrint100("\n"+monster.getName()+":..., h... hiha... haha");
		Formatting.slowPrint50("\n"+monster.getName()+":you really think it's over?, King Danyel already \nknows about your spot, I would start running if I were you.");
		Formatting.slowPrint10("\n"+player.getName()+":why aren't you just leave us alone? We don't give a damn about the king");
		Formatting.slowPrint10("\n"+monster.getName()+":You don't see what have you done, ");
		Formatting.slowPrint50("you are ALL DEAD, GOLDRIVER," + player.getName() + " \nIS CONDEMNED TO DEATH, BECAUSE EVERYONE THAT YOU CARE DIE, DIE, DIE");
		Formatting.slowPrint50("\nGoldriver, after heard all this, he take his axe and cut the head of" + monster.getName());
		Formatting.slowPrint10("\nGoldriver: I heard enough let's get out of here before the situation get worse");
		Formatting.slowPrint50("\n"+player.getName()+":o... ok");
		Formatting.slowPrint10("\nbut, after some time a local starts talking with you");
		Formatting.slowPrint10("\nMagnus: you really deafeted the " + monster.getName());
		Formatting.slowPrint10("\n"+player.getName()+"yeah");
		Formatting.slowPrint10("\nMagnus: that's wonderful, he was really damaging everyone's lives");
		Formatting.slowPrint10("\nGoldriver: Sorry, we really need to go");
		Formatting.slowPrint10("\nMagnus: Wait before you go, please young boy \nI would be preatty happy if you choose one of these armors as a gift. \n");
	}
	public static void sixthPartStory( Scanner input, Player player) {
		Formatting.slowPrint100("Two weeks after");
		Formatting.slowPrint50("\nleaving Down Hill " + player.getName()+ " and Goldriver run to other district Dirty Helment, after hide in a abandoned house, trying to start a fire to get warmer");
		Formatting.slowPrint10("\n"+player.getName()+":It's really cold here");
		Formatting.slowPrint10("\nGoldriver: we need to kill the king, and all of this is over");
		Formatting.slowPrint10("\n"+player.getName()+":Don't say this Goldriver, revange it's a foolish game, I don't wanna live running all the time"); 
		Formatting.slowPrint10("\nWe can travel to Kriften, I heard that is a nice place, with incredible people, I think we can start again over there");
		Formatting.slowPrint10("\nGoldriver: you really think it's a good Idea?");
		Formatting.slowPrint10("\n"+player.getName()+":with all the certainty in the world");
		
		Formatting.slowPrint10("\nAfter some hours, you finally get out of the house, going towards kriften. \nYou see a mercant, do you want to trade with him?");
	}
	public static void MercantFreyaDialog( Scanner input, Player player) {
		
	}
	public static void seventPartStory( Scanner input, Player player) {
		Formatting.slowPrint50("\nafter some walk, you are almost leaving Dirty Helment when an arrow falls in front of Goldriver,");
		Formatting.slowPrint50("\nthe king with all his guard was aiming at you");
		Formatting.slowPrint50("\nDanyel: GOLDRIVER, YOU REALLY THOUGHT YOU COULD ESCAPE?");
		Formatting.slowPrint50("\nGoldriver:We don't wanna fight Danyel, we just want to leave the kingdom, I don't care about your dirty work");
		Formatting.slowPrint50("\nDanyel: You never was like your father, Adrik was much better than you.");
		Formatting.slowPrint50("\nGoldriver: my parents are dead because of your pathetic guardianship");
		Formatting.slowPrint50("\nDanyel: YOU ARE DEAD DECKER");
		Formatting.slowPrint50("\n"+player.getName()+" seeing that Decker would die, pushes Goldriver in the direction of a lake, now "+player.getName() + " was the only one against all the guards of the king");
		
		Formatting.slowPrint50("\nDanyel: I'm not gonna lie, you are tought kid, but not for me.");
		Formatting.slowPrint50("\ndrop this peace of shit in a bonfire, \n" + player.getName()+ " dies honorably saving his friend");
		
		Formatting.slowPrint50("\nafter hours of the dead of " + player.getName() +", Goldriver finnaly finds a way to get out of the lake.");
		Formatting.slowPrint50("\nhe see somepeople walking a little further, so he hides in a hole, \nGoldriver sees some nobles celebrating that one of the outlaws were finally dead");
		Formatting.slowPrint50("\nGoldriver couldn't heard all that, so he need to think about one of the most important choices of his life");
		
	}
	public static void finalTwo(Scanner input, Player player) {
		Formatting.slowPrint100("non-canonical ending");
		Formatting.slowPrint50("\nGoldriver with a insane rage, get out of the hole and starts screaming and start a combat\r\n");
		Formatting.slowPrint100("\nPLEASE STOP \nKIDS RUN AWAY");
		Formatting.slowPrint50("\nGoldriver starts killing all the village. Until the king appears");
		Formatting.slowPrint50("\nafter the king came, Goldriver starts screaming");
		Formatting.slowPrint100("\nGoldriver:DANYEL YOU ARE DEADDDDDDDDDDDDDD");
		Formatting.slowPrint50("\nnow Goldriver recieve his revange and starts an empire with all his angry, \nkilling everyone that cross your path \n\n\n");
		
		Formatting.slowPrint100("thank you for playing");
	}
	public static void finalOne(Scanner input, Player player) {
		Formatting.slowPrint100("\ncanonical ending");
		Formatting.slowPrint50("\nGoldriver remember his friend telling that revenge wasn't worth it, \nso he prefers to ignore ");
		Formatting.slowPrint50("\nall that riot, and leave Dirty Helment");
		Formatting.slowPrint50("\nNow with 22 years old, Decker is alone, \nsought by the kingdom and looking for some meaning to his life.");
		Formatting.slowPrint50("\nHe follows his adventure searching for some peace in Kriften");
		Formatting.slowPrint100("\njust like "+ player.getName() + " asked for...");
		
		Formatting.slowPrint100("\nthank you for playing");
	}
}
