import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ThrowsClass {
	
	public static void main(String[] args) // + throws Exception�� ����  
		{
		
		while(true) {
		try {
			readUserInput();
			break;
		} catch (Exception e) {
			System.out.println("���ڸ� �Է��� �ּ���.");
			}
		
		}
	}
	static void readUserInput() 
			throws InputMismatchException
					,NoSuchElementException {
		
		System.out.println("���ڸ� �Է��ϼ��� :");
		Scanner sc = new Scanner(System.in);
		int val = sc.nextInt();
		System.out.println("�Էµ� ���� : " + val);
	}
}
