package com.jere.moveclasses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.jere.statusclasses.*;

@Component
public class IceBeam implements Move {
	
	@Autowired
	@Qualifier("freeze")
	private Status myStatus;
	
	@Value("${moves.damage}")
	private int damage;
	@Value("${moves.accucary}")
	private int accucary;
	@Value("${moves.chance}")
	private int chance;
	
	public IceBeam(Status myStatus, int damage, int accucary, int chance) {
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
		return "IceBeam [myStatus=" + myStatus + ", damage=" + damage + ", accucary=" + accucary + ", chance=" + chance
				+ "]";
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
