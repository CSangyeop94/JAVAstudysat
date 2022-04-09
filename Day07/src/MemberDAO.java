import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO {
	//�����ͺ��̽� ���� ��ü
	Connection conn = null;
	java.sql.Statement stmt = null;
	ResultSet rs = null;
	
	// �����ͺ��̽� ����
	public MemberDAO() {
		try {
			// �����Ƶ�� ����̹� �ε�
			Class.forName("org.mariadb.jdbc.Driver");
			// �����ͺ��̽� ����
			conn = DriverManager.getConnection(
					"jdbc:mariadb://localhost:3306/sang",
					"root",
					"1234"
					);
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} 
	}
	
	//������ �Է�
	public int insert(MemberVO vo) {
		
		int result = 0;
		try {
			String sql = "INSERT INTO member (memberno, id, name) "
					+ "VALUES ("+vo.getMemberno()+ ", '"+vo.getId()+"', '"
							+ vo.getName()+"' )";
					stmt = conn.createStatement();
					result = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return result;
	}
	//������ ��ȸ
	public MemberVO selectOne(int memberno) {


		MemberVO vo = new MemberVO();
		try {
			String sql = "SELECT * FROM member WHERE memberno ="+memberno;
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			if (rs.next()) {
				vo.setMemberno(rs.getInt("memberno"));
				vo.setId(rs.getString("id"));
				vo.setName(rs.getString("name"));
		}
		}	catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return vo;
	}
	// ������ ����
	public int update(MemberVO vo) {
		int result = 0;	
		try {
			String sql = "UPDATE member SET id='"
					+ vo.getId()+"', name ='"+vo.getName()+"' "
					+ "WHERE memberno="+vo.getMemberno();
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return result;
		
	}
	// ������ ����
	public int delete(int memberno) {
		
		int result = 0;
		try {
			String sql = "DELETE FROM member WHERE memberno="+memberno;
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
			} catch(SQLException e) {
				System.out.println(e.getMessage());
			}
		return result;
	}
	// ȸ�����
	public List<MemberVO> list() {
		List<MemberVO> list = new ArrayList<MemberVO>();
		
		try {
			String sql = "SELECT * FROM member";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				MemberVO vo = new MemberVO();
				vo.setMemberno(rs.getInt("memberno"));
				vo.setId(rs.getString("id"));
				vo.setName(rs.getString("name"));
				list.add(vo);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return list;
	}
	
	// �ڿ� close()
	public void close() {
		if(conn != null) {
			try {conn.close(); } catch (SQLException e) {}
		}
		if (stmt != null) {
			try {stmt.close(); } catch (SQLException e) {}
		}
		if (rs !=null) {
			try {stmt.close(); } catch (SQLException e) {}
		}
	}
}
