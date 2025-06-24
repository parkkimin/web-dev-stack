package com.kh.polymorphism.model;

public class Secretary extends Employee{
	private String boss;

	public Secretary() {
	}

	public Secretary(String name, int salarty, String boss) {
		super(name, salarty);
		this.boss = boss;
		
	}

	
	@Override
	public String toString() {
		return "Secretary [boss=" + boss + ", getName()=" + getName() + ", getSalarty()=" + getSalarty() + "]";
	}

	
	

}
