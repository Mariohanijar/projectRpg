package entities;

public class Monster {
	private String monsterName;
	private int PV;
	private int damage;
	private int defense;
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
	
	public int getLife() {
		return PV;
	}
	
	public int getAgility() {
		return this.agility;
	}
	
	public int getDamage() {
		return this.damage;
	}
	
	public int getDefense() {
		return this.defense;
	}
	
	public void setLifeMonster(int damage) {
		this.PV -= damage;
	}
	}
