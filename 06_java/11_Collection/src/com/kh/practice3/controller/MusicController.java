package com.kh.practice3.controller;

import java.util.ArrayList;

import com.kh.practice3.model.Music;

public class MusicController {

	private ArrayList<Music> list = new ArrayList<>();
	// 메서드 리턴타입, 파라미터 받는 부분 자유!
	//1. 특정 곡 추가
	public void addList(String artist, String song) {
		//add
		Music musics = new Music(artist, song);
		
		list.add(musics);
		
		System.out.println("음악이 추가 되었습니다" + musics.getArtist() + "의" + musics.getSong() + "입니다");
		/*
		if(musics.getArtist() == musics.setArtist() && musics.getSong() == musics.setSong()) {
			retrun;
		}
		*/
	}
	
	
	
		
	
	
	//2. 전체 곡 목록 출력
	public void printAll() {
		
	}
	
	//3. 특정 곡 검색
	public void searchMusic() {
		// contains - 문자열 비교
		
	}
	
	//4. 특정 곡 수정
	public void updateMusic() {
		//set
		
	}
	
	//5. 특정 곡 삭제
	public void removeMusic() {
		//remove
		
		
	}
	
}