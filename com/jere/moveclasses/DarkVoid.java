package com.jere.moveclasses;

import com.jere.statusclasses.Status;

public class DarkVoid implements Move {
	
	private Status myStatus;
	private int damage;
	private int accucary;

	
	@Override
	public String toString() {
		return "DarkVoid [myStatus=" + myStatus + ", damage=" + damage + ", accucary=" + accucary + "]";
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
