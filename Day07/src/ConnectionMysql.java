import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/*
 * Host :
	javalec-sat.crwq4oaekhum.ap-northeast-2.rds.amazonaws.com
	id : 여러분이 준거
	password : 여러분이 준거
	Port : 3306
	Db Name : 아이디_db
 */
public class ConnectionMysql {
	
	public static void main(String[] args) {
		Connection conn = null;
		
			try { 
				
				Class.forName("org.mariadb.jdbc.Driver"); 
				// Class.forName("com.mysql.cj.jdbc.Dreiver"); -mysql
				System.out.println("데이터베이스 연결 성공");
				conn = DriverManager.getConnection(
						"jdbc:mariadb://javalec-sat.crwq4oaekhum.ap-northeast-2.rds.amazonaws.com:3306/sang_db", // Url
						"sang", // ID
						"sang1234"  // Password
						);
				System.out.println("데이터베이스 연결성공");
				
				//-- 셀렉트 
				printNaverPrices(conn);
				
				//-- 인서트 
				NaverPriceVO vo = new NaverPriceVO(); 
				vo.setGoods_name("상엽패드");
				vo.setPrice(500);
				vo.setGoods_link("http://naver.com/1");
				vo.setRegi_date("2022-04-03");
				
				insertNaverPrice(conn, vo);
				
				//--딜리트
				NaverPriceVO vo2 = new NaverPriceVO(); 
				vo.setGoods_name("상엽패드");
				deleteNaverPrice(conn, vo2);
				
				//-- 업데이트
				NaverPriceVO vo3 = new NaverPriceVO();
				vo3.setGoods_name("아이폰13pro");
				updateNaverPrice(conn, vo3);
				
				
			} catch (ClassNotFoundException e) {
				System.out.println("드라이버 로딩 실패");
			} catch (SQLException e) {
			    System.out.println(e.getMessage());
			} catch (Exception e) {
				System.out.println("개 에러");
			}
			
		}
		
		
		//-----------------------------------------
		//-- R: 전체 데이터를 들고오는 메서드 
		//-----------------------------------------
		
		public static void printNaverPrices(Connection conn) 
		throws Exception
		{
			
			String sql = "select * from naver_price"; 
			
			//-- 1. statement (SQL 구문을 날린 준비를 한다) 
		    Statement stmt = conn.createStatement(); 
		    ResultSet rs = stmt.executeQuery(sql);
		    
		    List<NaverPriceVO> list 
		    		= new ArrayList<NaverPriceVO>(); 
		    
		    while(rs.next()) {
		    	NaverPriceVO vo = new NaverPriceVO();
		    	vo.setGoods_name(rs.getString("goods_name"));
		    	vo.setGoods_link(rs.getString("goods_link"));
		    	vo.setRegi_date(rs.getString("regi_date"));
		    	vo.setPrice(rs.getInt("price"));
		    	list.add(vo);
		    }
			
		}
		
		//-----------------------------------------
		//-- C: 데이터 생성 
		//-----------------------------------------
		
		public static void insertNaverPrice(
				Connection conn, NaverPriceVO vo) 
		throws Exception {
			
			/*String sql = "insert into naver_price ("
					   + "goods_name, price, goods_link, regi_date"
					   + ") values ("
					   + "'" + vo.getGoods_name() + "',"
					   + "'" + vo.getPrice() + "',"
					   + "'" + vo.getGoods_link() + "',"
					   + "'" + vo.getRegi_date() + "'"
					   + ")";
			
			System.out.println(sql); 
			//-- SQL 에디터열기 
			Statement stmt = conn.createStatement(); 
			//-- SQL 문 실행 
			stmt.executeUpdate(sql);
			System.out.println("등록완료");*/
			
			String sql = "insert into naver_price\n"
			           + "(goods_name, price, goods_link, regi_date)\n" 
					   + "values (?,?,?,?)"; 
			
			PreparedStatement pstmt 
					   = conn.prepareStatement(sql); 
			
			pstmt.setString(1, vo.getGoods_name());
			pstmt.setInt(2, vo.getPrice());
			pstmt.setString(3, vo.getGoods_link());
			pstmt.setString(4, vo.getRegi_date());
		
			pstmt.executeUpdate(); // 쿼리실행 
			pstmt.close(); 
			
			System.out.println("입력완료");
			
		}

		//-----------------------------------------
		//-- D: 데이터 삭제 
		//-----------------------------------------
		
		public static void deleteNaverPrice
		(Connection conn, NaverPriceVO vo) throws Exception {
			
//			String sql = "delete from naver_price \n"
//					   + "where goods_name = '"
//					   + vo.getGoods_name() + "'";
//			
//			System.out.println(sql);
//			
//			Statement stmt = conn.createStatement(); 
//			stmt.executeUpdate(sql);
//			System.out.println(vo.getGoods_name() + ":: 삭제완료");
			String sql = "delete from naver_price where "
						+"goods_name = ?";
			 PreparedStatement pstmt = conn.prepareStatement(sql);
			 pstmt.setString(1, vo.getGoods_name());
			 pstmt.executeUpdate();
			 pstmt.close();
			
		}
		

		//-----------------------------------------
		//-- U: 데이터 업데이트 (아이패드가격이 만원오름) 
		//-----------------------------------------
		
		public static void updateNaverPrice
		(Connection conn, NaverPriceVO vo) throws Exception {
			
//			 String sql = "update naver_price SET +"
//					 	+ "goods_name ='상패드 +'"
//					 	+ "where price = +10000" ;
//			 
//			 System.out.println(sql);
//			 Statement stmt = conn.createStatement();
//			 stmt.executeUpdate(sql);
//			 System.out.println(vo.getGoods_name() + " :: 가격 상승"); 
			
			 String sql = "update naver_price \n"
					 	+ "price = price + ? \n"
					 	+ "where goods_name = ?";
			 PreparedStatement pstmt = conn.prepareStatement(sql);
			 pstmt.setString(1, vo.getGoods_name());
			 pstmt.executeUpdate();
			 pstmt.close();
		}
		
	}