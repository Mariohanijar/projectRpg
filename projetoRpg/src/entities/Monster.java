package entities;

public class Monster {
	private String monsterName;
	private double PV;
	private double damage;
	private double defense;
	private int agility;
	
	public Monster (String monsterName, int PV, int damage, int defense, int agility) {
		this.monsterName = monsterName;
		this.PV = PV;
		this.damage = damage;
		this.defense = defense;
		this.agility = agility;
	}
	
	public String getName() {
		return monsterName;
	}
	
	public double getLife() {
		return PV;
	}
	
	public int getAgility() {
		return this.agility;
	}
	
	public double getDamage() {
		return this.damage;
	}
	
	public double getDefense() {
		return this.defense;
	}
	
	public void setLifeMonster(double damage) {
		this.PV -= (damage-this.defense);
	}
	}
