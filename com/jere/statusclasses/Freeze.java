package com.jere.statusclasses;

import org.springframework.stereotype.Component;

@Component
public class Freeze implements Status {

	@Override
	public String getEffect() {
		return "Stop moving until thawed";

	}

}
