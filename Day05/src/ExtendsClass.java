import math.MathUtilClass;
import students.Student;

class MathUtilClassSon extends MathUtilClass {
	
}

public class ExtendsClass {

		public static void main(String[] args) {
			/*public int x1; //--전체공유
			private int x2;	//--자기만(MathUtilClass) 사용
			protected int x3;//-- 같은 집에 있는 사람만 사용
			int x4; //-- 같은 방에 있는 사람만 사용
			*/
			
			MathUtilClassSon son = new MathUtilClassSon();
			//son.x1 = 10;
			//son.x2 = 10; // x2는 받을수 없다
						 // protected 는 상속불가
			//son.x3 = 10; // x3은 패키지가 달라서 x
			//son.x4 = 10; // private x
			
			Student std = new Student();
			std.setGrade(1);
			std.setGender("남자");
			std.setName("추상엽");
			
			System.out.println(std.getName());
			System.out.println(std.getGrade());
			System.out.println(std.getGender());
			
		}
}
