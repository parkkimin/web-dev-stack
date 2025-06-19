package com.kh.step2;

import com.kh.step2.model.Card;

public class Application {

	public static void main(String[] args) {

		// 클래스 변수는 객체 생성 없이 호출 가능!
		System.out.println(Card.heigth);
		System.out.println(Card.width);
		
		Card card1 = new Card();
		card1.kind = "Heart";
		card1.number = 7;
		
		Card card2 = new Card();
		card2.kind = "Spade";
		card2.number = 2;
		// 클래스 변수는 모든 객체가 하나의 저장공간을 공유하므로 항상 공통된 값을 갖는다
		Card.heigth = 50; // 이게 더 명확하고 클래스 이름으로 직접 접근하는게 확실하
		card2.width = 30; // 인스턴스 변수 바꾸는 것처럼 보이지만, 실제는 클래스 변수 값을 바꿈
		
		System.out.println("첫번째 카드는" + card1.kind + " " + card1.number + "이며, " + "크기는" + card1.width + "X" + card1.heigth + "입니다." );
		System.out.println("첫번째 카드는" + card2.kind + " " + card2.number + "이며, " + "크기는" + card2.width + "X" + card2.heigth + "입니다." );
	}

}
