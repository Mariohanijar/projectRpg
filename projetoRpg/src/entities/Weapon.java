package entities;

public class Weapon {
	private double damage;
	private String category;
	private String weaponName;
	private String damageType;
	
	public Weapon( int damage, String category, String weaponName, String damageType) {
		this.damage = damage;
		this.category = category;
		this.weaponName = weaponName;
		this.damageType = damageType;
	}
	
	public String getWeaponName() {
		return this.weaponName;
	}
	
	public double getWeaponDamage() {
		return this.damage;
	}
	
	public String getWeaponCategory() {
		return this.category;
	}
	
	public String getDamageType() {
		return damageType;
	}

	public String toString() {
		return "Weapon Status:\n" + "Name:" + weaponName + "\nCategory: " + category + "\nDamage:" + damage;
	}
}
