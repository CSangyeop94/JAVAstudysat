class StaticEx {
	static int count = 0; // 객체를 호출하는 수
	static void printVar() {
		System.out.println(count);
	}
}

// java StaticClass
// -> StaticClass.main()
// static를 사용하지않으면 new를사용 (힙영역에 저장)
// 사용방법은 .으로 접근 클래스.속성명 클래스.메서드

public class StaticClass {
	
	public static void main(String[] args) {
		
		//StaticEx ex = new StaticEx();
		StaticEx.count += 1;
		StaticEx.printVar();
		
		//StaticEx ex2 = new StaticEx();
		StaticEx.count += 1;
		StaticEx.printVar();
		
	}
}
