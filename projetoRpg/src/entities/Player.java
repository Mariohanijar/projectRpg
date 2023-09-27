package entities;

import java.util.ArrayList;
import java.util.Random;

public class Player {
	private String name;
	private double PV;
	private double PVMax;
	private double mp = 3;
	private double mpMax = mp;

	private int strength;
	private int constitution;
	private int agility;
	private int dexterity;
	private int coin;

	// Equipment
	private Weapon weapon;
	private Armor armor;
	private ArrayList<Magic> magics = new ArrayList<Magic>();
	private Potion potion;
	private int amountOfPotions;
	private double defense = this.getDefense();
	private double originalDefense = this.getDefense();

	Random random = new Random();

	public Player(String name, double PV, int strength, int constitution, int agility, int dexterity, Potion potion,
			int coin) {
		this.name = name;
		this.PV = PV;
		this.PVMax = PV;
		this.potion = potion;
		this.coin = coin;
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
					+ (random.nextDouble(4) + 1) + (this.dexterity / 4));
		} else {
			return Math.round(weapon.getWeaponDamage() + (random.nextDouble(12) + 1) + 0.1 * this.strength);
		}
	}

	public int getConstitution() {
		return constitution;
	}

	public double getMp() {
		return mp;
	}

	public void setMp(double mp) {
		this.mp = mp;
	}

	public int getMagicLenght() {
		return magics.size();
	}

	public Magic getMagic(int i) {
		return magics.get(i);
	}

	public double getMpMax() {
		return mpMax;
	}

	public void setMpMax(double mpMax) {
		this.mpMax = mpMax;
	}

	public void setConstitution(int constitution) {
		this.constitution = constitution;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
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

	public void setCoin(int coin) {
		this.coin = coin;
	}

	public String getWeaponCategory() {
		return weapon.getWeaponCategory();
	}

	public String getWeaponType() {
		return weapon.getDamageType();
	}

	public int getStrength() {
		return this.strength;
	}

	public int getCoin() {
		return this.coin;
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

	public double receiveDamage(double damage) {
		damage = (damage - this.defense);
		this.PV -= damage;
		return damage;
	}

	public void addMagic(Magic magic) {
		this.magics.add(magic);
	}

	public String getMagicType(int i) {
		return magics.get(i).getDamageType();
	}

	public double getMagicDamage(int i) {
		return magics.get(i).getDamage();
	}

	public String toString() {
		return "| Character's name: " + name + " \n|\n| Character's PV: " + PV + "\n|\n| Character's strength: "
				+ strength + " \n|\n| Character's constitution: " + constitution + " \n|\n| Character's agility: "
				+ agility + " \n|\n| Character's dexterity: " + dexterity + " \n|\n| Character's coins: " + coin
				+ " \n|\n| Character's weapon: " + weapon.getWeaponName() + " \n|\n| Character's armor: "
				+ armor.getArmorName() + " \n|\n| magics: " + magics + " \n|\n| amount of cure potions: " + amountOfPotions;
	}

	public void setPVMax(double pVMax) {
		PVMax = pVMax;
	}

	public void resetPlayer() {
		this.PV = this.PVMax;
		//this.amountOfPotions = 3;
		this.mp = this.mpMax;
	}
}
