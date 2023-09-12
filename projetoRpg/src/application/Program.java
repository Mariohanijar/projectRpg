package application;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

import entities.Player;
import entities.playerActions;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		
		Player player = playerActions.characterCreation(input, random);
		player.setWeapon(playerActions.weaponSelector(input));
		player.setArmor(playerActions.armorSelector(input));
		System.out.println(player);
		
	}

}
