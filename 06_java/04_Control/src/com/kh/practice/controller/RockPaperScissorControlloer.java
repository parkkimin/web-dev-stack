package com.kh.practice.controller;

import java.util.Arrays;

import com.kh.practice.model.RockPaperScissor;

public class RockPaperScissorControlloer {
	
	RockPaperScissor rpsModel = new RockPaperScissor();
// 컴퓨터 랜덤값 추출 -가위바위보
	public void randomComputer() {
		//컴퓨터 - 0:가위, 1:바위, 2:보
		int computer = (int)(Math.random() * 3);
		// 컴퓨터는 인덱스로 값을 찾음
		return rpsModel.getRps()[computer];
	}
	
	public int computer() {
		return computer;
	}
	// 사용자가 입력한 값으로 인덱스 찾기
	public int userIndex(String input) {
		return Arrays.asList(rpsModel.getRps()).indexOf(input);
		
	}
	public void rpsDraw() {
		rpsModel.setDraw(rpsModel.getDraw()+1);
	}
	public void rpsWin() {
		rpsModel.setWin(rpsModel.getWin()+1);
	}
	public void rpsLose() {
		rpsModel.setLose(rpsModel.getLose()+1);
	}
	public String rpsResult() {
		return "비긴 횟수 : " + rpsModel.getDraw()
		+ ", 진 횟수" + rpsModel.getLose()
		+ ", 이긴 회수" + rpsModel.getWin();
	}
	public void rpsGame() {
		
		
	}
}
