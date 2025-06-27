package com.kh.practice2.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.practice2.model.Member;

public class Membercontroller {
	
	// 전체 회원 목록
	private List<Member> members = new ArrayList<>();
	
	// 현재 로그인된 회원 (여러명인 경우가 힘드시다면 이걸로)
	private Member member = null;
	
	// 회원가입 및 로그인 처리
	public boolean registerAndLogin(String name, int age) {
		// members.add(new Member(name, age));
		
		for(Member member : members) {
			if(member.getName().equals(name) && member.getAge() == age) {
				this.member = new Member();
				this.member.setAge(age);
				this.member.setName(name);
				return true;
			}
			
			if(member.getName().equals(name)) {
				return false;
			}
		}
		
		Member m = new Member();
		m.setName(name);
		m.setAge(age);
		members.add(m);
		
				member = new Member();
				member.setName(name);
				member.setAge(age);
		// 동일 이름 존재하면 가입 불가 처리
		// 이름이랑 나이가 같은 경우 로그인 처리
		// 기존에 해당하는 이름이 없다면 가입 후 로그인 처리
		return false;
	}
	
	// 로그아웃
	public void logout() {
		member = null;
		
	}
	
	// 마이페이지 - 현재 로그인된 정보
	public Member getMember() {
		return null;
	}
	
	
}