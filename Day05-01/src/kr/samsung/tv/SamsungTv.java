package kr.samsung.tv;
import kr.thejoeun.tv.Nintendo;
import kr.thejoeun.tv.TvInterFace;


public class SamsungTv implements TvInterFace,Nintendo{

	@Override
	public void turnOnTv() {
		// TODO Auto-generated method stub
		System.out.println("»ï¼º Tv Å°±â");
	}

	@Override
	public void turnOffTv() {
		// TODO Auto-generated method stub
		System.out.println("»ï¼º Tv ²ô±â");
	}

	@Override
	public void volumUp() {
		// TODO Auto-generated method stub
		System.out.println("»ï¼º Tv º¼·ýÅ°¿ì±â");
	}

	@Override
	public void volumDown() {
		// TODO Auto-generated method stub
		System.out.println("»ï¼º Tv º¼·ý³»¸®±â");
	}

	@Override
	public void attachNintendo() {
		// TODO Auto-generated method stub
		System.out.println("´ÑÅÙµµ ºÙÀÌ±â");
	}

	@Override
	public void dettachNintendo() {
		// TODO Auto-generated method stub
		System.out.println("´ÑÅÙµµ ²ô±â");
	}
	
	
	
}
