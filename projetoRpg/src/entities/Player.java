package entities;

import java.util.Random;

public class Player {
	private String name;
	private double PV;
	private double PVMax;

	private int strength;
	private int constitution;
	private int agility;
	private int dexterity;
	
	// Equipment
	private Weapon weapon;
	private Armor armor;
	private Magic magic;
	private Potion potion;
	private int amountOfPotions;
	private double defense = this.getDefense();
	private double originalDefense = this.getDefense();

	Random random = new Random();

	public Player(String name, double PV, int strength, int constitution, int agility, int dexterity, Potion potion) {
		this.name = name;
		this.PV = PV;
		this.PVMax = PV;
		this.potion = potion;
		amountOfPotions = potion.getAmountPotions();
		getAllAtributes(strength, constitution, agility, dexterity);
	}

	public void getAllAtributes(int strength, int constitution, int agility, int dexterity) {
		this.strength = strength;
		this.constitution = constitution;
		this.agility = agility;
		this.dexterity = dexterity;
	}

	public double getDamage() {
		if (weapon.getWeaponCategory() == "light") {
			return Math.round(weapon.getWeaponDamage() + (random.nextDouble(6) + 1) + (random.nextDouble(6) + 1)
					+ (random.nextDouble(4) + 1) + (this.dexterity / 2));
		} else {
			return Math.round(weapon.getWeaponDamage() + (random.nextDouble(12) + 1) + 1.5 * this.strength);
		}
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public void setMagic(Magic magic) {
		this.magic = magic;
	}

	public void setArmor(Armor armor) {
		this.armor = armor;
	}

	public double getLife() {
		return this.PV;
	}

	public int getAgility() {
		return this.agility;
	}

	public double getDefense() {
		return this.defense;
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

	public String getWeaponCategory() {
		return weapon.getWeaponCategory();
	}

	public int getStrength() {
		return this.strength;
	}

	public int getDexterity() {
		return this.dexterity;
	}

	public int getAmountPotions() {
		return this.amountOfPotions;
	}

	public double drinkPotions() {
		return potion.DrinkPotion();
	}

	public void setLife(double PV) {
		this.PV = PV;
	}

	public void healLife(double heal) {
		this.PV += heal;
	}

	public String getName() {
		return name;
	}

	public double getPVMax() {
		return this.PVMax;
	}

	public void setAmountPotions(double set) {
		this.amountOfPotions -= set;
	}

	public void receiveDamage(double damage) {
		this.PV -= damage;
	}

	public String toString() {
		return "| Character's name: " + name + " \n|\n| Character's PV: " + PV + "\n|\n| Character's strength: "
				+ strength + " \n|\n| Character's constitution: " + constitution + " \n|\n| Character's agility: "
				+ agility + " \n|\n| Character's dexterity: " + dexterity + " \n|\n| Character's weapon: "
				+ weapon.getWeaponName() + " \n|\n| Character's armor: " + armor.getArmorName()
				+ " \n|\n| magic chosen: " + magic.getMagicName();
	}
}
