
//형변환 ((DATA)Type Casting)
public class CastingClass {
	public static void main(String[] args) 
	{
			long age = 100;
			int age2 = (int)age; //형변환
			//(int)는 long을 int로
			//강제로 변형시키겠다는 의미
			
			//자동 형변환
			char name = 100;
			int name2 = name;
			//char는2byte int는4byte
			//작은데이터를 큰데이터에 담을떄는 
			//형변환이 자동으로 된다.
			
			//강제 형변환
			//큰데이터를 작은 데이터에 담고자할떄
			//형변환을 강제로 시켜준다.
			//(데이터타입)변수명;
			long a = 1000;
			int b = (int)a;
		
			//!)
			//short aaa = 32767;
			//강제 형변환할떄 주의점
			short aaa = 129;
			// byte의 최대범위를 넘어섬
			byte bbb = (byte)aaa;
			System.out.println(bbb);
			
			int abc = (int)3.14;
			float c = (float)3d;
			
			int abc2 = (int)3f;
			double abc3 = 30l;
			//실제로 정수변수에 실수를 담고자 하면
			//정수형으로 강제 형변환이 필요
			//그 반대의 경우는 자동 형변환
	}
}
