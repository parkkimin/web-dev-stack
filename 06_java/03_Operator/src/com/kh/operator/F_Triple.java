package com.kh.operator;

import java.util.Scanner;

public class F_Triple {
	
	/*
	 * 삼항 연산자
	 * 
	 * 조건식 ? 값1 : 값2;
	 * 
	 * - 조건식에는 주로 비교, 논리 연산자가 사용된다
	 * - 조건식의 결과는 true이면 값1를 반환한다.
	 * - 조건식의 결과가 false이면 값2를 반환한다.
	 * */

	public static void main(String[] args) {
		F_Triple f = new F_Triple();
		//f.method1();
		//f.practice1();
		//f.practice2();
		f.practice3();

	}
	Scanner sc = new Scanner(System.in);
	public void method1() {
		
		//입력받은 정수가 양수인지 음수인지 판단
		System.out.print("정수값 >>");
		int number = sc.nextInt();
		
		String result = number > 0 ? "양수" : "음수";
		System.out.println(result);
		
		// +) 0인 경우는 0입니다
		result = number > 0 ? "양수" : number == 0? "0입니다" : "음수";
		System.out.println(result);
		
	}
	
	/*
	 * 문제 1
	 * 사용하자한테 두 개의 정수값을 입력받아서 두 정수의 곱셈 결과 100보다 크거나 같은 경우
	 * "결과가 100이상입니다" 아닌경우 "결과가 100보다 작습니다" 출력 
	 * */
	public void practice1() {
		System.out.print("숫자를 입력해주세요");
		int number = sc.nextInt();
		System.out.print("숫자를 입력해주세요");
		int number1 = sc.nextInt();
		
		String result = number * number1 >= 100 ? "100이상입니다" : "100보다 작습니다";
		System.out.println(result);
		
	}
	
	
	/*
	 * 문제2
	 * 사용자한테 문자를 하나 입력받아서 입력한 문자가 대문자이면 "알파벳 대문자입니다"
	 * 소문자이면 "알파벳 소문자입니다", 둘 다 아니라면 "알파벳이 아닙니다"
	 * */
	public void practice2() { 
		System.out.print("문자를 입력해주세요");
		char ch = sc.nextLine().charAt(0);
		
		String result = 'A' <= ch && ch <= 'Z' ? "알파벳 대문자 입니다" : 
						'a'<= ch && ch<='z'? "알파벳 소문자 입니다" :
					    "알파벳이 아닙니다";
												
		System.out.println(result);
		
	}
	
	/*
	 * 문제3
	 * 사용자한테 숫자를 입력받아서 해당 숫자가 알파벳 범위안에 들어 간다면 
	 * "알파벳 D입니다" 그게 아니면 "알파벳이 아닙니다"
	 * */
	/*public void practice3() {
		System.out.print("숫자를 입력하세요");
		int num = sc.nextInt();
		
		String result = 65<= num && 90>=num ? "알파벳 A~Z 입니다" || 97<= num && 122>=num ? "알파벳 a~z 입니다" :"알파벳이 아닙니다.";
		
		System.out.println(result);
		
			
	}
	*/

}
