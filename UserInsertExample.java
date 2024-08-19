package day09;
/*
 *  1.JDBC 드라이버 로드
 *  2.데이터 베이스 연결
 *  
*/
import java.sql.*;

public class UserInsertExample {

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
			String sql2="insert into users(userid,username,userpassword,userage,useremail)"+"values(?,?,?,?,?)";
			PreparedStatement st = con.prepareStatement(sql2);
			st.setString(1, "김길동");
			st.setString(2, "010-45855-655");
			st.setString(3, "kh3511@awfr");
			st.setInt(4, 28);
			st.setString(5, "k3511@awfr");
			//4.데이터 추가 명령 전송 하기
					//int result = st.executeUpdate(sql2);	
			int result = st.executeUpdate();		
					if(result>0) {
						System.out.println("데이터 저장 성공~~");
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
