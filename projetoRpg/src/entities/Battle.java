package entities;

import java.util.Random;
import java.util.Scanner;

public class Battle {

	public static void playerTurn(Scanner input, Monster monster, Player player) {
		double damage, heal;

		player.setDefense(player.getOriginalDefense());
		System.out.println("\n" + player.getName() + "'s life: " + player.getLife() + " || " + monster.getName()
				+ "'s life: " + monster.getPV() + "\n\n");
		System.out.println("what do you want to do?\n ATTACK[1] DEFENSE[2] POTION[3]");

		int choice = input.nextInt();

		switch (choice) {
		case 1:
			damage = player.getDamage();
			System.out.println("\n\nyou dealt " + damage + " damage!!!\n\n");
			monster.receiveDamage(damage);
			break;
		case 2:
			player.setDefense(player.getDefense() * 2);
			System.out.println("you defended yourself!!!");
			break;

		case 3:
			heal = player.drinkPotions();
			if (player.getAmountPotions() == 0) {
				System.out.println("you don't have enough potions!!");
			} else if (player.getLife() == player.getPVMax()) {
				System.out.println("Your life is full");
			} else if (player.getLife() + heal > player.getPVMax()) {
				player.setLife(player.getPVMax());
				player.setAmountPotions(1);
				System.out.println("now your life is full");
			} else {
				System.out.println("You healead " + heal + " points of life");
				player.healLife(heal);
				player.setAmountPotions(1);

			}

		}

	}

	public static void monsterTurn(Scanner input, Monster monster, Player player, Random random) {
		int monsterChoice;
		double monsterDamage, heal;

		monster.setDefense(monster.getOriginalDefense());
		monsterChoice = (random.nextInt(3) + 1);
		switch (monsterChoice) {
		case 1:
			monsterDamage = monster.getDamage();
			player.receiveDamage(monsterDamage);
			System.out.println("the " + monster.getName() + " dealt " + monsterDamage + " damage!\n\n");
			break;

		case 2:
			monster.setDefense(player.getDefense() * 2);
			System.out.println("the monster defended himself!!!");
			break;

		case 3:
			heal = monster.drinkPotion();
			if (monster.getAmountOfPotions() <= 0) {
				System.out.println("the monster tried to heal... but failed");
			} else if (monster.getPV() == monster.getPVMax()) {
				System.out.println("the monster tried to heal... but his life is full");
			} else if (monster.getPV() + heal > monster.getPVMax()) {
				monster.setPVtoMax(monster.getPVMax());
			} else {
				System.out.println("You healead " + heal + " points of life");
				monster.healLife(monster.drinkPotion());

			}
		}
	}

	public static void combat(Scanner input, Monster monster, Player player) {
		Random random = new Random();

		System.out.println("You find a " + monster.getName() + "!\n\n\n\n THE BATTLE BEGINS!!!");

		while (player.getLife() > 0 && monster.getPV() > 0) {

			if (player.getAgility() >= monster.getAgility()) {
				playerTurn(input, monster, player);

				if (monster.getPV() <= 0) {
					break;
				}

				monsterTurn(input, monster, player, random);
			}
			if (player.getAgility() < monster.getAgility()) {
				monsterTurn(input, monster, player, random);

				if (player.getLife() <= 0) {
					break;
				}

				playerTurn(input, monster, player);
			}
		}
		System.out.println("You defeated the " + monster.getName());
	}
}
