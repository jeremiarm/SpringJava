package com.jere.statusclasses;

public class Freeze implements Status {

	@Override
	public void getEffect() {
		System.out.println("Stop moving until thawed");

	}

}
