package com.kh.operator;

import java.util.Scanner;

public class A_If {
	Scanner sc = new Scanner(System.in);
	
	/*
	 *if문 
	 * 
	 *if(조건식) {
	 * 조건식이 참(true)일 때 실행
	 * } else {
	 *  조건식이 거짓(false)일 때 실행
	 * }
	 * - 보통 조건식에는 비교연산자, 논리연산자를 주로 사용
	 * */
	public void method1() {
		//입력받은 성적이 60점 이상이면 '합격입니다' 출력
		//아니면 불합격 입니다 
		System.out.print("성적을 입력하세요");
		int score = sc.nextInt();
		
		// 한 줄인 경우만 중괄호 ({}) 생략 가능
		if(score >=60) {
			System.out.println("합격입니다");
		} else System.out.println("불합격입니다.");
		
		//삼항연산자
		System.out.println(score >= 60?  "합격":"불합격");
    }
	public void method2() {
		// 본인의 이름을 입력했을 때 본인이면 "본인이다", 아니면 "본인이 아니다" 출력
		System.out.print("이름을 입력하세요");
		String name = sc.nextLine();
		
		System.out.println();
	
		
		
	}
	

	public static void main(String[] args) {
	 A_If a= new A_If();
	 //a.method1()
	 a.method2();

	}


}
