package com.kh._interface.step1;

public class Bus implements Vehicle{

	@Override
	public void run() {
		System.out.println("버스가 달린다");
	}

	@Override
	public void trun() {
		System.out.println("버스가 돈다");
	}

}
