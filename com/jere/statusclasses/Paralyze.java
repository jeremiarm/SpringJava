package com.jere.statusclasses;

import org.springframework.stereotype.Component;

@Component
public class Paralyze implements Status {

	@Override
	public String getEffect() {
		return "Have a chance to stop moving";
	}

}
