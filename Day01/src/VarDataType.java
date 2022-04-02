
public class VarDataType {

		public static void main(String[] args) {
			
			//변수 선언은 [데이터타입] 변수명;
			//변수 선언과 동시에 초기화 [데이터타임] 변수명 = 1;
			//기본타입
			//자바의 기본 데이터 타입
			//-1.정수형 10진수
			//char, byte, short, int,  long
			System.out.println(20); //int 정수형 기본타임
			//-2.실수형 소수점
			//-float. double(기본데이터 타입)
			float f1 = 2.01f;
			//-3.논리형 true fales 
			int age = 10;
			
			System.out.println(f1);
			//-논리형은 다음에
			
			char name = 'a';
			System.out.println(name);
			System.out.println(name + 1); // 98? 
			System.out.println((int)name);
			
			System.out.println((char)(name - 5));
			
			//https://velog.io/@exploit017/%EC%95%84%EC%8A%A4%ED%82%A4-%EC%BD%94%EB%93%9C%ED%91%9C
		}
}
