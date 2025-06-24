package com.kh._interface.step1;

public class Taxi implements Vehicle{

	@Override
	public void run() {
		System.out.println("택시가 달린다");
	}

	@Override
	public void trun() {
		System.out.println("택시가 돈다");
	}

}
