package entities;

import java.util.Scanner;

/**
 * 
 */
public class Market {
	private String mercant;
	private String district;
	private String products;
	private String description;
	private int magicCost;
	private int potionCost;
	private int armorCost;
	private int weaponCost;
	
	
	public void sellWeapon(Scanner input, Player player, Weapon weapon) {
			
		 player.setWeapon(weapon);
	}
	
	
	
	
	
	public Market(String mercant, String district, String products, String description, int magicCost, int potionCost,
			int armorCost, int weaponCost) {
		this.mercant = mercant;
		this.district = district;
		this.products = products;
		this.description = description;
		this.magicCost = magicCost;
		this.potionCost = potionCost;
		this.armorCost = armorCost;
		this.weaponCost = weaponCost;
	}





	public String getMercant() {
		return mercant;
	}
	
	public void setMercant(String mercant) {
		this.mercant = mercant;
	}
	
	public String getDistrict() {
		return district;
	}
	
	public void setDistrict(String district) {
		this.district = district;
	}
	
	public String getProducts() {
		return products;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setProducts(String products) {
		this.products = products;
	}
	

	public int getMagicCost() {
		return magicCost;
	}




	public void setMagicCost(int magicCost) {
		this.magicCost = magicCost;
	}




	public int getPotionCost() {
		return potionCost;
	}




	public void setPotionCost(int potionCost) {
		this.potionCost = potionCost;
	}




	public int getArmorCost() {
		return armorCost;
	}




	public void setArmorCost(int armorCost) {
		this.armorCost = armorCost;
	}




	public int getWeaponCost() {
		return weaponCost;
	}




	public void setWeaponCost(int weaponCost) {
		this.weaponCost = weaponCost;
	}

	
	
	


	@Override
	public String toString() {
		return "Hello my name is " + mercant + ", I'm from " + district +  " So what can I help you?";
	}




	
	
}
