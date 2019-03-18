package com.jere.statusclasses;

public class Paralyze implements Status {

	@Override
	public void getEffect() {
		System.out.println("Have a chance to stop moving");
	}

}
