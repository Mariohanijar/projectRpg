package entities;

public class Weapon {
	private int damage;
	private String category;
	private String weaponName;
	
	public Weapon( int damage, String category, String weaponName) {
		this.damage = damage;
		this.category = category;
		this.weaponName = weaponName;
	}
	
	public String getWeaponName() {
		return this.weaponName;
	}
	
	public int getWeaponDamage() {
		return this.damage;
	}
	
	public String getWeaponCategory() {
		return this.category;
	}
	
	public String toString() {
		return "Weapon Status:\n" + "Name:" + weaponName + "\nCategory: " + category + "\nDamage:" + damage;
	}
}
