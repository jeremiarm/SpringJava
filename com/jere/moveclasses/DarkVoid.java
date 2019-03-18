package com.jere.moveclasses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.jere.statusclasses.Status;

@Component
public class DarkVoid implements Move {
	
	@Autowired
	@Qualifier("confuse")
	private Status myStatus;
	private int damage;
	private int accucary;
	private int chance;

	
	public DarkVoid(Status myStatus, int damage, int accucary, int chance) {
		super();
		this.myStatus = myStatus;
		this.damage = damage;
		this.accucary = accucary;
		this.chance = chance;
	}

	public int getChance() {
		return chance;
	}

	public void setChance(int chance) {
		this.chance = chance;
	}


	@Override
	public String toString() {
		return "DarkVoid [myStatus=" + myStatus + ", damage=" + damage + ", accucary=" + accucary + ", chance=" + chance
				+ "]";
	}

	public DarkVoid() {
		super();
	}

	public DarkVoid(Status myStatus) {
		super();
		this.myStatus = myStatus;
	}



	public DarkVoid(Status myStatus, int damage, int accucary) {
		super();
		this.myStatus = myStatus;
		this.damage = damage;
		this.accucary = accucary;
	}



	public Status getMyStatus() {
		return myStatus;
	}



	public void setMyStatus(Status myStatus) {
		this.myStatus = myStatus;
	}



	public int getDamage() {
		return damage;
	}



	public void setDamage(int damage) {
		this.damage = damage;
	}



	public int getAccucary() {
		return accucary;
	}



	public void setAccucary(int accucary) {
		this.accucary = accucary;
	}



	@Override
	public String getDetails() {
		return "Move your enemies to a deep void of darkness, making them to sleep";

	}

}
