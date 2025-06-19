package com.kh.practice;

import java.util.Scanner;

public class OperatorPractice {

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		OperatorPractice o = new OperatorPractice();
		o.method1();
	    //o.method2();
		//o.method3();
		//o.method4();
		//o.method5();
		//o.method6();
		//o.method7();
		//o.method8();

	}

	// 모든 사람이 연필을 골고루 나눠가지려고 한다. 인원 수와 연필 개수를 입력 받고
	// 1인당 동일하게 나눠가진 연필 개수와 나눠주고 남은 연필의 개수를 출력하세요.
	public void method1() {
		System.out.print("인원 수를 입력하세요");
		int num = sc.nextInt();
		System.out.print("연필 개수를 입력하세요");
		int num1 = sc.nextInt();
		
		

		System.out.println(num / num1);
		System.out.println(num % num1);
	}

	// 입력 받은 숫자를 산술 연산자만 사용해서 십의 자리 이하는 버리는 코드를 작성하세요.
	// 만약 432이라면 400, 111이라면 100이 출력됩니다.
	public void method2() {
		System.out.print("숫자를 입력하세요");
		
		int num = Integer.parseInt(sc.nextLine());
		System.out.println(num - num % 100);
		System.out.println(num / 100 * 100);
	
	}

	// 3개의 수를 입력 받아 입력 받은 수가 모두 같으면 true, 아니면 false를 출력하세요.
	public void method3() {
		System.out.print("숫자를 입력하세요");
		int num = sc.nextInt();
		System.out.print("숫자를 입력하세요");
		int num1 = sc.nextInt();
		System.out.print("숫자를 입력하세요");
		int num2 = sc.nextInt();

		if (num == num1 && num1 == num2) {
			System.out.println("true");
		} else
			System.out.println("false");

	}

	// 입력 받은 하나의 정수가 짝수이면 "짝수다", 짝수가 아니면 "짝수가 아니다"를 출력하세요.
	public void method4() {
		System.out.print("숫자를 입력하세요");
		int num = sc.nextInt();
		sc.nextLine();

		if (num / 2 == 0) {
			System.out.println("짝수다");
		} else
			System.out.println("홀수다");

	}

	// 주민번호(-포함)를 입력받아 남자인지 여자인지 구분하여 출력하세요
	public void method5() {
		System.out.print("주민번호를 입력해주세요");
		String num = sc.nextLine();
		char id = num.charAt(7);

		if (id == '1' || id == '3') {
			System.out.println("남자 입니다");
		} else if (id == '2' || id == '4') {
			System.out.println("여자 입니다");
		} else
			System.out.println("사람이 아닙니다");

	}

	// 나이를 입력 받아 어린이(13세 이하)인지, 청소년(13세 초과 ~ 19세 이하)인지,
	// 성인(19세 초과)인지 출력하세요.
	public void method6() {
		System.out.print("나이를 입력해주세요");
		int num = sc.nextInt();

		if (num > 19) {
			System.out.println("성인");
		} else if (num > 13) {
			System.out.println("청소년");
		} else {
			System.out.println("어린이");
		}

	}

	// 사과의 개수와 바구니의 크기(바구니 1개의 들어가는 사과의 개수)를 입력받아
	// 필요한 바구니의 수를 출력하세요
	public void method7() {
		System.out.print("바구니의 크기를 입력하세요");
		int count = sc.nextInt();
		System.out.print("사과의 개수를 입력하세요");
		int apple = sc.nextInt();

		System.out.println((apple / count) + (apple % count == 0 ? 0:1));
	}

	// 초 단위 시간을 입력받아 1시간 1분 1초 형식으로 출력
	public void method8() {
		System.out.print("시간을 초 단위로 입력해주세요");
		int second = Integer.parseInt(sc.nextLine());
		
		int hour = second /3600;
		second -= hour * 3600;
		int minute = second % 3600 /60;
		second -= minute * 60;
		
		
		System.out.println(hour + "시간" + minute + "분" + second +"초");


	}

}