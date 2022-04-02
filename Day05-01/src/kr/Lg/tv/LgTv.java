package kr.Lg.tv;
import kr.thejoeun.tv.TvInterFace;

public class LgTv implements TvInterFace{

	@Override
	public void turnOnTv() {
		// TODO Auto-generated method stub
		System.out.println("LG Tv Å°±â");
	}

	@Override
	public void turnOffTv() {
		// TODO Auto-generated method stub
		System.out.println("LG Tv ²ô±â");
	}

	@Override
	public void volumUp() {
		// TODO Auto-generated method stub
		System.out.println("LG Tv º¼·ýÅ°¿ì±â");
	}

	@Override
	public void volumDown() {
		// TODO Auto-generated method stub
		System.out.println("LG Tv º¼·ý³»¸®±â");
	}
	
}
