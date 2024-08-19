package day09;
/*
 *  1.JDBC 드라이버 로드

 *  2.데이터 베이스 연결
 *  
*/
import java.io.IOException;
import java.sql.*;
import java.io.FileInputStream;

public class BoardInsertExample {

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
			String sql2="insert into boards(btitle,bcontent,bwriter,bdate,bfilename,bfiledata)"+"values(?,?,?,now(),?,?)";
			PreparedStatement st = con.prepareStatement(sql2,Statement.RETURN_GENERATED_KEYS);
			st.setString(1, "눈 오는 날");
			st.setString(2, "함박눈이 내려요");
			st.setString(3, "winter");
			st.setString(4, "snow1.jpg");
			st.setBlob(5, new FileInputStream("C:\\Users\\COMPUTER\\eclipse-workspace\\JavaOOP\\src\\day09\\snow1.jpg"));
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
