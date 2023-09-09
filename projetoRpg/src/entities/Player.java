package entities;

public class Player {
	private String name;
	private int PV;
	
	private int strength;
	private int constitution;
	private int agility;
	private int dexterity;
	
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
	
	public String toString() {
		return "Character's name: " + name + " | Character's PV: " + PV + " | Character's strength: " + strength +
				" | Character's constitution: " + constitution + " | Character's agility: " + agility + " | Character's dexterity: " +dexterity;
	}
}
