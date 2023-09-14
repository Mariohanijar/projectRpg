package entities;

public class Armor {
	private double defense;
	private String armorName;
	
	public Armor(double defense, String armorName) {
		this.defense = defense;
		this.armorName = armorName;
	}
	
	public double getDefense() {
		return this.defense;
	}
	
	public String getArmorName() {
		return this.armorName;
	}
	
	public String toString() {
		return "Armor Status: \n" + "Armor Name: " + armorName + "\nDefense: " + defense;
	}
}
