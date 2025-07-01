package com.kh.practice3.model;

import lombok.AllArgsConstructor;
import lombok.Builder.ObtainVia;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Music implements Comparable{

	private String artist;
	private String song;
	
	
	@Override
	public int compareTo(Music o) {
		return this.artist.compareTo(o.artist);
	}
	


}