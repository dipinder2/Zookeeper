package com.dipinder.zookeeper;

public class GorillaTest {

	public static void main(String[] args) {
		Gorilla gorilla = new Gorilla();
		gorilla.throwSomething();
		gorilla.throwSomething();
		gorilla.throwSomething();
		gorilla.eatBananas();
		gorilla.eatBananas();
		gorilla.climb();
		System.out.println(gorilla.getEnergyLevel());
		
		Bat bato = new Bat();
		bato.attackTown();
		bato.attackTown();
		bato.attackTown();
		bato.eatHumans();
		bato.eatHumans();
		bato.fly();
		bato.fly();
		bato.displayEnergy();

	}

}
