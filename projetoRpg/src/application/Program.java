package application;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import entities.Battle;
import entities.Monster;
import entities.Player;
import entities.playerActions;


public class Program {
	
	//slow print
	public static void slowPrint(String output) {
	    for (int i = 0; i<output.length(); i++) {
	      char c = output.charAt(i);
	      System.out.print(c);
	      try {
	        TimeUnit.MILLISECONDS.sleep(30);
	      }
	      catch (Exception e) {
	      }
	    }
	}
	
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		Monster slime = new Monster("Slime", 10, 3, 1, -10);
		
		Player player = playerActions.characterCreation(input, random);
		player.setWeapon(playerActions.weaponSelector(input));
		player.setMagic(playerActions.magicSelector(input));
		player.setArmor(playerActions.armorSelector(input));
		System.out.println(player);
		Battle.combat(input, slime, player);
		
		
		
		
	}

}
