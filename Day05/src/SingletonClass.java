class SharedObject {

		static int createdCount = 0;
		static SharedObject sharedobject = null;
		
		static SharedObject getObject() {
			//제한을 걸어야함
			if(sharedobject == null) {
				createdCount += 1;
				sharedobject = new SharedObject();
			}
			
			return sharedobject;
		}
		
		int plugMethod(int x, int y) {
			return x + y;
			
		}
		
		float plugMethod(float x, float y) {
			return x + y;
		}
}

public class SingletonClass {

		public static void main(String args[]) {
		//	SharedObject so = new ShraedObject();
			SharedObject so1 = SharedObject.getObject();
			SharedObject so2 = SharedObject.getObject();
			SharedObject so3 = SharedObject.getObject();
			
			System.out.println("객체수 : "
					+SharedObject.createdCount);
			
			so1.plugMethod(10, 20);
			so2.plugMethod(20, 30);
		}
}
