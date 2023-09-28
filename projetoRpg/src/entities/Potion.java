package entities;

import java.util.Random;
import java.lang.Math;

public class Potion {
	Random random  = new Random();
	private int amountPotions = 3;
	
	public double DrinkPotion() {
		return Math.round(random.nextDouble(5)+random.nextDouble(5)+random.nextDouble(5));
	}
	
	public int getAmountPotions() {
		return this.amountPotions;
	}
	public void setAmountPotion(int potion) {
		this.amountPotions = potion;
	}
}
