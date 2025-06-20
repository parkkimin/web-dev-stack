package com.kh.practice2;

import java.util.Scanner;

import com.kh.practice2.controller.SnackController;
import com.kh.practice2.model.Snack;

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		SnackController controller = new SnackController();
		
		System.out.println("스낵류를 입력하세요.");
		
		System.out.print("종류: ");
		String name = sc.nextLine();
		System.out.print("이름: ");
		String name1 = sc.nextLine();
		System.out.print("맛: ");
		String name2 = sc.nextLine();
		System.out.print("개수:");
		int name3 = sc.nextInt();
		System.out.print("가격:");
		int name4 = sc.nextInt();
		System.out.println(controller.saveData(name, name1, name2, name3, name4));
		
		
		
		System.out.println(controller.confirmData());
		
		
		

	}

}
