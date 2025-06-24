package com.kh.polymorphism.model;

// 부모 클래스! 공통적인 특성들만 가지고 있기
public class Employee {
	private String name;
	private int salarty;
	
	public Employee() {
	}
	
	public Employee(String name, int salarty) {
		this.name = name;
		this.salarty = salarty;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalarty() {
		return salarty;
	}
	public void setSalarty(int salarty) {
		this.salarty = salarty;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salarty=" + salarty + "]";
	}
	
	

}
