package day09;
/*
 *  1.JDBC 드라이버 로드
 *  2.데이터 베이스 연결
 *  
*/
import java.sql.*;
import java.util.ArrayList;

public class PersonSelect {

	public static void main(String[] args) {
		Connection con = null;
		Statement st=null;
		ResultSet rs=null;
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
			String sql2="select * from person";
			//이름이 홍길동과 같은 사람의 모든 열의 정보를 검색해서 출력하
			//PreparedStatement st = con.prepareStatement(sql2);

			 st = con.createStatement();
			 rs = st.executeQuery(sql2);
			//4.데이터 추가 명령 전송 하기
					//int result = st.executeUpdate(sql2);	
			String email="";
			 String name="";
			String phone="";
			int age = 0;	
			Person person = null;
			ArrayList<Person> arlist = new ArrayList<Person>();
			while(rs.next()) {
				phone=rs.getString("phone");
				email=rs.getString("email");
				name=rs.getString("name");
				age=rs.getInt("age");
			    person = new Person(name,phone,email,age);
				arlist.add(person);

				
			}
			for(Person p : arlist) {
				System.out.println("이름:"+p.getName());
				System.out.println("전화번호:"+p.getPhone());
				System.out.println("이메일:"+p.getEmail());
				System.out.println("나이:"+p.getAge());
				
			}
		}catch(Exception e) {
			System.out.println("드라이버 로딩 실패.");
		}finally {
			try {
				con.close();
				st.close();
				rs.close();
				
			}catch(SQLException es) {
				
			}
		}

		
	}

}
