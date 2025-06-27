package com.kh.practice2.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.kh.practice2.model.Book;
import com.kh.practice2.model.Member;

public class Bookcontroller {

	// (선택사항) 책 제목 기준으로 현재 대여 인원 수 파악
	private Map<String, Integer> bookCount = new HashMap<>();
	
	// 책 대여
	public String rentBook(Book book, Member member) {
		// 내 책 리스트 
		ArrayList<Book>list = member.getBookList();
		
		member.getBookList().add(book);
		
		if(list.size() > 2) {
			return " 더 이상 대여할 수 없습니다.";
		} 
		if(list.contains(book)) {
			return "이미 대여한 책입니다";
		}
		if(member.getCoupon() == 0) {
			return "나이 제한 대여를 할 수 없습니다";
		}
		if(book.getCount() > 2) {
			return "더 이상 책을 빌릴 수 없습니다"
		}
		
		if(book.isCoupon()) {
			member.setCoupon(member.getCoupon()+1);
		}
		
		
		if(member.getAge() < book.getAccessAge()) {
			member.setCoupon(member.getCoupon()-1);
			return "대여를 할 수 없습니다";
		}
		
		
		
		
		list.add(book);
		return "성공적으로 대여되었습니다.";
/*
 * -> 1. 한 사람 당 대여할 수 있는 책은 총 3권
		 *              "더 이상 대여할 수 없습니다."
		 *      -> 2. 해당 사람이 대여한 책은 대여 불가능
		 *      		"이미 대여한 책입니다."
		 *      -> 3. 나이 제한에 걸리는 책들 대여 불가능
		 *              "나이 제한으로 대여 불가능합니다."
		 *      -> 4. 쿠폰이 있는 경우 나이 제한 걸려도 대여 가능
		 *      -> (선택사항) 5. 각 책들마다 가능한 대여가 3권까지만
		 *                     HashMap -> getOrDefault(키, 초기값)
		 *      -> 대여 가능한 경우 : "성공적으로 대여되었습니다."	
 * */
		
	}
	
	
	
	
	
	
	
	
	
}