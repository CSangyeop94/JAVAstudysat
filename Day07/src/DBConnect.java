import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	
	public static void main(String[] args) {
		//���̤ú��̽� ���� ��ü
		Connection conn = null;
		
		try {
			// MariaDB ����̹� �ε�
			Class.forName("org.mariadb.jdbc.Driver");
			// �����ͺ��̽� ����
			conn = DriverManager.getConnection(
					"jdbc:mariadb://localhost:3306/sang", //Host
					"root", // �����
					"1234"); //��ȣ
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			if (conn !=null) try {conn.close();} catch (Exception e) {}
			}
		if (conn != null) {
			System.out.println("�����ͺ��̽� ����");
			}
		}
	} // �����ͺ��̽� ���� �Ϸ�.

