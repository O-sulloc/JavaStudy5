package com.jh.s8.rpg;

public class Magician extends Character implements Act {

		int mp;
		
	@Override
	public void attack() {

		this.spel();
	}

	@Override
	public void move() {

	}

	 void spel() {
		System.out.println("마법퓌두르기");
	}
}
