package entities;


public class Magic {
	private String magicName;
	private String damageType;
	
	private double damage;
	
	
	public Magic(String magicName, String damageType, double damage) {
		this.magicName = magicName;
		this.damageType = damageType;
		this.damage = damage;
	}
	
	
	public String getMagicName() {
		return magicName;
	}

	public String getDamageType() {
		return damageType;
	}

	public void setDamageType(String damageType) {
		this.damageType = damageType;
	}


	public double getDamage() {
		return damage;
	}

	public void setDamage(double damage) {
		this.damage = damage;
	}
	
	public String magicStatus() {
		return "Magic status: \n" + "magic name: " + magicName + "\n damageType: "+ damageType + "\n damage: "+ damage;
	}

	public String toString() {
		return magicName;
	}
	
	
}
