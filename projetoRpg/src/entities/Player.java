package entities;

public class Player {
	private String name;
	private int PV;
	
	private int strength;
	private int constitution;
	private int agility;
	private int dexterity;
	//Equipment
	private Weapon weapon;
	private Armor armor;
	
	public Player (String name, int PV, int strength, int constitution, int agility, int dexterity){
		this.name = name;
		this.PV = PV;
		getAllAtributes(strength, constitution, agility, dexterity);		
	}
	
	public void getAllAtributes(int strength, int constitution, int agility, int dexterity) {
		this.strength = strength;
		this.constitution = constitution;
		this.agility = agility;
		this.dexterity = dexterity;
	}
	
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
	public void setArmor(Armor armor) {
		this.armor = armor;
	}
	
	public String toString() {
		return "| Character's name: " + name + " \n|\n| Character's PV: " + PV + "\n|\n| Character's strength: " + strength +
				" \n|\n| Character's constitution: " + constitution + " \n|\n| Character's agility: " + agility + " \n|\n| Character's dexterity: " +dexterity
				+ " \n|\n| Character's weapon: " + weapon.getWeaponName() + " \n|\n| Character's armor: " + armor.getArmorName();
	}
}
