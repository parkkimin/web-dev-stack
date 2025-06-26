package com.kh.practice1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Application {

	public static void main(String[] args) {
		// 1등 당첨 기준 로또 번호 6개
		// 둘 다 랜덤 로또 번호는 1번
		// 내 번호는 맞출때 까지 1~45
		// 정렬이 딱 맞으면 equals로 비교 가능
		// number = (int)(Math.random() * 45) +1;
		// System.out.println(number);
		Set<Integer> lotto = new HashSet<>();
		while (lotto.size() < 6) {
			lotto.add((int) (Math.random() * 45) + 1);
		}

		List<Integer> sortedLotto = new ArrayList<>(lotto);
		Collections.sort(sortedLotto);
		System.out.println("당첨 번호 : " + sortedLotto);
		System.out.println("================================");

		int tryCount = 0;

		while (true) {
			tryCount++;

			// 2. 내 번호 자동 생성
			Set<Integer> mylotto = new HashSet<>();
			while (mylotto.size() < 6) {
				mylotto.add((int) (Math.random() * 45) + 1);
			}

			// 3. 비교
			Set<Integer> matched = new HashSet<>(lotto);
			matched.retainAll(mylotto);

			if (matched.size() == 6) {
				List<Integer> sortedMyLotto = new ArrayList<>(mylotto);
				Collections.sort(sortedMyLotto);

				System.out.println("1등 당첨! (" + tryCount + "번 시도)");
				System.out.println("내 번호 : " + sortedMyLotto);
				break;
			}
		}
	}
}