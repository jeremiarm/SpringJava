package com.jere.moveclasses;

import com.jere.statusclasses.Status;

public class ThunderWave implements Move {

	private Status myStatus;
	private int damage;
	private int accucary;
	
	
	
	@Override
	public String toString() {
		return "ThunderWave [myStatus=" + myStatus + ", damage=" + damage + ", accucary=" + accucary + "]";
	}



	public ThunderWave(Status myStatus) {
		super();
		this.myStatus = myStatus;
	}



	public ThunderWave() {
		super();
	}



	public ThunderWave(Status myStatus, int damage, int accucary) {
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
		return "Some electromagnetic that make your enemies become paralyzed";

	}

}
