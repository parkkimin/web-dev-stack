package com.kh.polymorphism.model;

public class Manager extends Employee {
	private String dept;

	public Manager() {
	}

	public Manager(String name, int salarty, String dept) {
		super(name, salarty);
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Manager [dept=" + dept + ", getName()=" + getName() + ", getSalarty()=" + getSalarty() + "]";
	}


	

}
