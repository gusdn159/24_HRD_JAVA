package day09;
/*
 *  1.JDBC 드라이버 로드
 *  2.데이터 베이스 연결
 *  
*/
import java.sql.*;

public class UserSelect {

	public static void main(String[] args) {
		Connection con = null;
		try {
			//1. JDBC 드라이버 로딩....
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2. 데이터 베이스 연결....
			String url = "jdbc:mysql://localhost:3306/contacts";
			String id = "root";
			String pwd = "khw159753";
			con= DriverManager.getConnection(url,id,pwd);
			System.out.println("DB연결 성공~~");
			//3.SQL문을 실행한다. Statement,PreparedStatement 객체 생성
		//	String sql="INSERT INTO person VALUES ('강현우','010-747-7474','KHW@DD',26);";
					//Statement st = con.createStatement();
			String sql2="select * from users where userid = ?";
			PreparedStatement st = con.prepareStatement(sql2);
			st.setString(1,"강길동");
            ResultSet rs = st.executeQuery();
			 
			
	
			//4.데이터 추가 명령 전송 하기
					//int result = st.executeUpdate(sql2);		
					if(rs.next()) {
						System.out.println("데이터 조회 성공~~");
						String name = rs.getString("username");
						int age = rs.getInt("userage");
						System.out.println("이름:"+name);
						System.out.println("나이"+age);
					}else {
						System.out.println("데이더 저장 실패!!!");
					}
			
		}catch(Exception e) {
			System.out.println("드라이버 로딩 실패.");
		}finally {
			try {
				con.close();
			}catch(SQLException es) {
				
			}
		}

		
	}

}
