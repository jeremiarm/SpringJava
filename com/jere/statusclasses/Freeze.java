package com.jere.statusclasses;

public class Freeze implements Status {

	@Override
	public String getEffect() {
		return "Stop moving until thawed";

	}

}
