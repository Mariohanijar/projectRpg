package entities;

import java.util.Random;

public class Monster {
	private String monsterName;
	private double PV;
	private double PVMax;
	private double damage;
	private double defense;
	private double originalDefense;
	private int agility;

	Potion potion = new Potion();
	private int amountOfPotions = potion.getAmountPotions();
	Random random = new Random();

	public Monster(String monsterName, int PV, int damage, int defense, int agility) {
		this.monsterName = monsterName;
		this.PV = PV;
		this.PVMax = PV;
		this.damage = damage;
		this.defense = defense;
		this.agility = agility;
	}

	public String getName() {
		return monsterName;
	}

	public double getPV() {
		return PV;
	}

	public int getAgility() {
		return this.agility;
	}

	public double getDamage() {
		return Math.round(random.nextDouble(this.damage));
	}

	public double getDefense() {
		return defense;
	}

	public void setDefense(double defense) {
		this.defense = defense;
	}

	public double getOriginalDefense() {
		return originalDefense;
	}

	public void setOriginalDefense(double originalDefense) {
		this.originalDefense = originalDefense;
	}

	public double getPVMax() {
		return this.PVMax;
	}

	public void setPVtoMax(double PV) {
		this.amountOfPotions -= 1;
		this.PV = PV;
	}

	public void receiveDamage(double damage) {
		this.PV -= (damage - this.defense);
	}

	public int getAmountOfPotions() {
		return this.amountOfPotions;
	}
	
	public void setAmountOfPotions() {
		this.amountOfPotions = this.amountOfPotions - 1;
	}

	public double drinkPotion() {
		return potion.DrinkPotion();
	}

	public void healLife(double PV) {
		this.PV += PV;
	}
}
