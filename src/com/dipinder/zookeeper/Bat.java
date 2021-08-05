package com.dipinder.zookeeper;

public class Bat extends Mammal{
	void fly() {
		this.setEnergyLevel(this.getEnergyLevel()-50);
		System.out.println("Oooo Lost energy by 50....");
	}
	void eatHumans() {
		this.setEnergyLevel(this.getEnergyLevel()+25);
		System.out.println("Ewww Gross but gained energy by 25....");
	}
	void attackTown() {
		this.setEnergyLevel(this.getEnergyLevel()+100);
		System.out.println("Ewww Gross but gained energy by 100....");
		
	}
	

}
