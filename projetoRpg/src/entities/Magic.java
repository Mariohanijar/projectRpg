package entities;
import java.util.Scanner;
import java.util.Random;

public class Magic {
	private int manaCost;
	private String magicName;
	//private int magic[] = new int[4];
	
	public Magic(int manaCost, /*int magic[],*/ String magicName) {
		this.manaCost = manaCost;
		//this.magic = magic;
		this.magicName = magicName;
	}
	/*
	public int getMagic() {
		return magic;
	}
	*/
	public int getManaCost() {
		return manaCost;
	}
	public String getMagicName() {
		return magicName;
	}
	public String toString() {
		return "Magic status: \n" + "magic name: " + magicName + "\nnecessary mana: " + manaCost;
	}
	
	
}
