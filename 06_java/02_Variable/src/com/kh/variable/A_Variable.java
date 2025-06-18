package com.kh.variable;

public class A_Variable {
	
	/*
	 * 변수(Variable): 값을 저장하는 "공간"
	 * */

	public static void main(String[] args) {
		
		//실행할 메서드가 있는 클래스 생성(new)
		A_Variable variable = new  A_Variable();
		
		//생성한 클래스로 메서드 실행(호출)
//		variable.printValue();
//		variable.variableTest();
		variable.constant();
	}

	public void printValue() {
		// 원의 둘레와 원의 넓이를 출력
		// 원의 둘레 = 반지름 x 2 x 3.141592....
		// 원의 넓이 = 반지름 x 반지름 x 3.141592....
		
		System.out.println(30 * 2 * 3.141592);
		System.out.println(30 * 30 * 3.141592);
	
		// 변수 사용해서
		int r = 30;
		double pi = 3.141592;
		
		System.out.println(r * 2 * pi);
		System.out.println(r * r * pi);
	}
	
	public void variableTest() {
		/*
		 * 변수의 선언
		 * 
		 * 
		 * 자료형 변수명;
		 * - 자료형 : 어떤 값을 저장할지, 어떤 크기에 메모리를 할당 받을지에 대한 정보
		 * - 변수명 : 변수의 이름으로 값을 읽고, 쓰고 지우는 작업을 할 때 사용
		 * 
		 * 변수의 초기화
		 * 
		 * 변수명 = 값;
		 * - 변수에 처음으로 값을 저장하는 것
		 * - '='는 오른쪽 값을 왼쪽 변수에 대입(저장)허눈 연산자
		 * */
		//1. 논리형 1byte=8bit
		boolean isTrue; // 변수 선언
		isTrue = true; // 변수 초기화
		
		boolean isFalse = false; //변수 선언과 함께 초기화
		
		// 2. 문자형 2byte=16bit
		char ch = 'a';
		//ch = 'ab'; -> 에러 발생
		
		//3. 정수형
		byte bNum = 1;// 1byte(=8bit) ->2^8 = 256(-128 ~127)
//		bNum =128; -> 에러 발생 오버플로우(overflow) 
		short sNum = 128; // 2byte(=16bit) -> 2^16
		int iNum = 922337283; // 4byte (기본)
		long lNum = 922337283458L; //8byte - 숫자 뒤에 L(l)을 입력
		
		System.out.println(lNum);
		
		//4. 실수형
		float fNum = 1.2F; // 4byte - 숫자 뒤에 F(f)를 입력
		double dNum = 1.2;// 8byte (기본)
		
		System.out.println(fNum);
		
		// * 참조 자료형(클래스) : 4byte,기본형을 제외한 나머지, 주소값 저장
		// 실제 데이터 값은 힙 메모리에 저장하고,
		// 스택 메모리의 변수 공간에는 실제 변수값이 저장된 힙 메모리의 위치값 저장
		// 스택 메모리에 생성된 공간에 실제 변수값이 저장
		String name = "이진용";
		String name2 = new String("이진용");
		System.out.println(name);
		
		// 변수의 네이밍 규칙 
		// 1. 대소문자 구분
		int number;
		int NUMBER;
		int Number;
//		String number; 자료형이 달라도 변수명이 같으면 에러
		
		//2. 숫자로 시작하면 안 된다.
//		int 1age;
		int a2g3e4;
		
		//3. 특수 문자는 '_','$'만 사용 가능
		int _age;
		int age$;
//      int %age;
		
		//4. 예약어(Reserved word)를 사용하면 안 된다.
//		int public;
		int void2;
	
		//5. (권장사항) 낙타표기법(카멜케이스)
		// 첫글자는 항상 소문자, 여러 단어가 오면 대문자
		int maxnumber;
		int max_number;; // 자바에서x, 파이썬에서 0(스네이크 기법)
		int maxNumver; //자바에서 사용
	 	}
	public void constant() {
		/*
		 * 상수
		 * final 자료형 변수명;
		 * 
		 * - 변하지 않는 값으로 특정 변수의 값이 변경되는 걸 원하지 않을 때 사용
		 * - 초기화 이후에는 값을 변경할 수 없다.
		 * - 상수의 네이밍 규칙은 대문자로 표기, 여러 단어가 오면 _로 구분
		 * */
		int age = 20;
		age=25;
		System.out.println(age);
		
		final int MAX_AGE =25;
//		int MAX_AGE=20;
		System.out.println(MAX_AGE);
	}
	
}
