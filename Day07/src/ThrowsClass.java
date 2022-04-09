import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ThrowsClass {
	
	public static void main(String[] args) // + throws Exception도 가능  
		{
		
		while(true) {
		try {
			readUserInput();
			break;
		} catch (Exception e) {
			System.out.println("숫자를 입력헤 주세요.");
			}
		
		}
	}
	static void readUserInput() 
			throws InputMismatchException
					,NoSuchElementException {
		
		System.out.println("숫자를 입력하세요 :");
		Scanner sc = new Scanner(System.in);
		int val = sc.nextInt();
		System.out.println("입력된 숫자 : " + val);
	}
}
