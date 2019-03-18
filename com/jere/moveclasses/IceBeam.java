package com.jere.moveclasses;

import com.jere.statusclasses.*;

public class IceBeam implements Move {
	
	private Status myStatus;
	private int damage;
	private int accucary;
	
	@Override
	public String toString() {
		return "IceBeam [myStatus=" + myStatus + ", damage=" + damage + ", accucary=" + accucary + "]";
	}
	public IceBeam(Status myStatus, int damage, int accucary) {
		super();
		this.myStatus = myStatus;
		this.damage = damage;
		this.accucary = accucary;
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
	public IceBeam() {
		super();
	}
	public IceBeam(Status myStatus) {
		super();
		this.myStatus = myStatus;
	}
	public Status getMyStatus() {
		return myStatus;
	}
	public void setMyStatus(Status myStatus) {
		this.myStatus = myStatus;
	}
	@Override
	public String getDetails() {
		return "A beam made from ice which deals some massive damage and have a chance to freeze the enemies";

	}

}
