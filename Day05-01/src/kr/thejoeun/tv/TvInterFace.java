package kr.thejoeun.tv;
import kr.samsung.tv.*;
import kr.Lg.tv.LgTv;

// 인터페이스는 class 가 아닌 interface다
// 따라서 정의할때는 class 클래스명이 아닌
// interface 인터페이스명


public interface TvInterFace {
		

	void turnOnTv();
	void turnOffTv();
	void volumUp();
	void volumDown();
	default void turn() {
		System.out.println("으아");
	}
	
}
