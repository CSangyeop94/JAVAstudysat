
//증감연산
public class InClass2 {
	
	public static void main(String[] args) {
		
			int a = 10;
			// 1. a = a + 1;
			// 2. a += 1;
			// 3. ++a;  --a; --증감연산
			// 연산자가 앞에 있는경우 전위연산
			// a++; a--;
			// 후위연산
			
			System.out.println(++a);
			//전위 연산은 바로 실행값이나옴
			System.out.println(a--);
			//후위 연산은 실행후 다음 라인에 값이나옴
			System.out.println(a);
			
			int x = 10;
			int y = x++;
			System.out.println(+x);
			System.out.println(+y);
			
			//비교연산
			//>,<,>=,<=,==,!=
			//결과값은 논리 (참or 거짓)
			//boolean is true = true or false;
			
			int xx = 100;
			int yy = 99;
			System.out.println(xx > yy); //true
			System.out.println(xx < yy); //false
			System.out.println(xx >= yy++); //false
			System.out.println(xx <= yy++); //true
			System.out.println(xx == yy); //false
			System.out.println(xx != yy); //true
			System.out.println(xx != --yy); //false
			
			// 논리연산 
			// 결과값 참 거짓
			// a)AND A && B (A & B)
			// 		A와 B 모두 참일떄 참
			// 		true & true => true
			// 		true & false => false
			// 		false & false => false
			// 		false & false => false
			// b) OR 연산 A || B (A | B)
			// 		A와 B중 하나라도 true 면 true
			//		true | true => true
			//		true | false => true
			//		false | true => true
			// 		flase | false => false
			
			int b_1 = 10;
			int b_2 = 9;
			
			System.out.println(
					//(b_1 < b_2) & (b_1++ > b_2)
					(b_1 < b_2) && (b_1++ > b_2)
					);
			// &를 한개만쓰면 뒤에가 false 할지라도 뒤에까지 연산함
			System.out.println("논리연산");
			System.out.println(b_1);
			
			System.out.println(
					(b_1 > b_2) || (b_1++ > b_2)
					);
			System.out.println("논리연산");
			System.out.println(b_1);
			
			//--XOR
			// 두항중 하나의 값만 true 경우 true다
			// A^B
			
			System.out.println("XOR TEST");
			System.out.println(true ^ true);
			System.out.println(true ^ false);
			System.out.println(false ^ true);
			System.out.println(false ^ false);
			
			//--Not ! ex) a != b
			//-- !(논리값) !true !false
			int c_1 = 100;
			
			System.out.println("NOT 연산");
			System.out.println(!(10 > 5));
			System.out.println(
					!(10 > 5) 
					&&
					(c_1++ > 100)
					);
			System.out.println(c_1);
			
	}
}
