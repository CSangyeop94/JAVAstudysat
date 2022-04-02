//-----
//변수


public class variable01 {

		public static void main(String[] args) {
			//-- 1+2
			System.out.println(1+2);
			System.out.println((1+2)*20);
		
			//-- 변수 문법
			// 데이터타입 변수이름; "선언"
			
			int a = 1; 
			int b = 2;
			int c;
			
			//--int 0name 숫자로 이름을 시작할 수 없다.
			c = a + b; //(1+2)
			System.out.println(c);
			
			/*	--변수명으로_는 포함될수 있으나
			 	-- -는 포함할 수 없다.
			ex) int _age;
			ex) int i_am_a_boy; 
			ex) int u-are-a-girl; error
			*/

			//변수명은 숫자로 시작할 수 없고, _.$를제외한 모든 특수문자는 사용할 수 없다.
			
			//--결과값에 *20
			System.out.println((c)*20);
			
		
		}
}
