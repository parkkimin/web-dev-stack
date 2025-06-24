package com.kh._interface.step2;

public class Audio implements RemoteControl {

	private int voluem;
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다");
	}

	@Override
	public void setVolume(int volume) {
		
		if(volume > Volume.MAX_VOLUME) {
			this.voluem = Volume.MAX_VOLUME;
		} else if(volume < RemoteControl.MIN_VOLUME) {
			this.voluem = Volume.MIN_VOLUME;
		} else {
			this.voluem = volume;
		}
		System.out.println("현재 Audio 볼륨 " + this.voluem);
	}

	@Override
	public void search(String url) {
	}

}
