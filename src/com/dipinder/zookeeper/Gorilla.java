package com.dipinder.zookeeper;

public class Gorilla extends Mammal {
	
	public void throwSomething(){
		this.setEnergyLevel(this.getEnergyLevel()-5);
		System.out.println("Gorilla threw something and "
				+ "now energy has decreased by 5");
	}
	public void eatBananas() {
		this.setEnergyLevel(this.getEnergyLevel()+10);
		System.out.println("Gorilla eats bananas! Adds +10 to energy");
		
	}
	public void climb() {
		this.setEnergyLevel(this.getEnergyLevel()-10);
		System.out.println("Gorilla climbed 10 ft and wasted "
				+ "-10 energy by doing so.");
	}
}
