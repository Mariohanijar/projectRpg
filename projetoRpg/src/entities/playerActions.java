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
		Player player = new Player(name, pv, strength, constitution, agility, dexterity);
		return player;
		
	}
}
