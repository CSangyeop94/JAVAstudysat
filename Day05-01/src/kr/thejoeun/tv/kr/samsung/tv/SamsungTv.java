package kr.thejoeun.tv.kr.samsung.tv;
import kr.thejoeun.tv.TvInterFace;

public class SamsungTv implements TvInterFace{
	
	@Override
	public void turnOnTv() {
		System.out.println("»ï¼ºTVÅ°±â");
	}

	@Override
	public void turnOffTv() {
		System.out.println("»ï¼ºTV²ô±â");
	}

	@Override
	public void volumUp() {
		System.out.println("»ï¼ºTV º¼·ý¿Ã¸®±â");
	}

	@Override
	public void volumDown() {
		System.out.println("»ï¼ºTV º¼·ý³»¸®±â");
	}

}
