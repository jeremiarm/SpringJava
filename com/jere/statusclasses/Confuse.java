package com.jere.statusclasses;

import org.springframework.stereotype.Component;

@Component
public class Confuse implements Status {

	@Override
	public String getEffect() {
		return "Have a chance to hit yourself or allies around you";

	}

}
