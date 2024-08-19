package day09;
/*
 *  1.JDBC 드라이버 로드

 *  2.데이터 베이스 연결
 *  
*/
import java.io.IOException;
import java.sql.*;
import java.io.FileInputStream;
import java.io.*;
public class BoardSelectExample {

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
			String sql2="select*from boards where bwriter=?";
			PreparedStatement st = con.prepareStatement(sql2,Statement.RETURN_GENERATED_KEYS);
			st.setString(1,"winter");
            ResultSet rs = st.executeQuery();
			//4.데이터 추가 명령 전송 하기
					//int result = st.executeUpdate(sql2);	
            if(rs.next()) {
				System.out.println("데이터 조회 성공~~");
				int bno = rs.getInt("bno");
				String btitle = rs.getString("btitle");
				String bcontent = rs.getString("bcontent");
				String bwriter = rs.getString("bwriter");
				String d = rs.getDate("bdate").toString();
				String bfilename = rs.getString("bfilename");
				String fdata = null  ;
				Blob blob = rs.getBlob("bfiledata");
				InputStream is = blob.getBinaryStream();
				OutputStream os = new FileOutputStream("C:\\Users\\COMPUTER\\eclipse-workspace\\JavaOOP\\src\\day09\\snow1.jpg");
				is.transferTo(os);
				System.out.println("번호:"+bno);
				System.out.println("제목:"+btitle);
				System.out.println("내용:"+bcontent);
				System.out.println("작성자:"+d);
				System.out.println("파일이름"+bfilename);

				os.flush();
				os.close();
				is.close();
				
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
