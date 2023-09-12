package entities;

public class Armor {
	private int defense;
	private String armorName;
	
	public Armor(int defense, String armorName) {
		this.defense = defense;
		this.armorName = armorName;
	}
	
	public int getDefense() {
		return this.defense;
	}
	
	public String getArmorName() {
		return this.armorName;
	}
	
	public String toString() {
		return "Armor Status: \n" + "Armor Name: " + armorName + "\nDefense: " + defense;
	}
}
