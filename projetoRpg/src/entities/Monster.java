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
	private String strongAgainst;
	private String weakAgainst;
	
	Potion potion = new Potion();
	private int amountOfPotions = potion.getAmountPotions();
	Random random = new Random();

	public Monster(String monsterName, int PV, int damage, int defense, int agility, String strongAgainst, String weakAgainst) {
		this.monsterName = monsterName;
		this.PV = PV;
		this.PVMax = PV;
		this.damage = damage;
		this.defense = defense;
		this.agility = agility;
		this.strongAgainst = strongAgainst;
		this.weakAgainst = weakAgainst;
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
		return Math.round(random.nextDouble(this.damage)+1);
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

	public double receiveDamage(double damage, String damageType) {
		if(damageType == strongAgainst) {
			System.out.println("the "+ this.monsterName + "is strong against "+ damageType +", damage has been reduced!");
			damage = (damage - this.defense)/2.00;
		}
		else if(damageType == weakAgainst) {
			System.out.println("the "+ this.monsterName + "is weak against "+ damageType +", damage has been increased!");
			damage = (damage - this.defense)*1.50;
		}
		else {
			damage = (damage - this.defense);
		}
		this.PV -= damage;
		return damage;
		
	}
	

	public String getStrongAgainst() {
		return strongAgainst;
	}

	public String getWeakAgainst() {
		return weakAgainst;
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
