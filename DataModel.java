package day10;
import java.sql.*;
import java.io.*;
import java.util.*;
import day10.Board;
public class DataModel {
//1.데이터 베이스 연결..
//2.데이터 입출력 담당 메소드 구현
	Connection con = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	ConnectDB cdb = null;
	Board board = null;
	Scanner scan = null;
	
	public DataModel() {
		cdb = new ConnectDB();
		con = cdb.getCon();
		if(con !=null) {
			System.out.println("연결 성공~~");
		}else {
			System.out.println("연결 실패~~");
		}
	}// 생성자...
	
	//데이터 추가 메소드 insertData() (insert into~)
	public void insertData(Board board) throws SQLException {
		int num = 0;
		this.board=board;
		String sql = "INSERT INTO boards(btitle,bcontent,bwriter,bdate) VALUES (?,?,?,now())";
		pst=con.prepareStatement(sql);
		pst.setString(1, board.getBtitle());
		pst.setString(2, board.getBcontent());
		pst.setString(3, board.getBwriter());
		
		num = pst.executeUpdate();
		if(num>0) System.out.println("저장 성공~~");
		else System.out.println("저장 실패~~");
	}

	public void create() throws SQLException {
		Board board = new Board();
		Scanner scan = new Scanner(System.in);
		System.out.println("[새 게시물 입력]");
		System.out.println("제목: ");
		board.setBtitle(scan.nextLine());
		System.out.println("내용: ");
		board.setBcontent(scan.nextLine());
		System.out.println("작성자: ");
		board.setBwriter(scan.nextLine());
		/////////////////////////////
		insertData(board);
		////////////////////////////
		
	}


	public static void main(String[] args) throws SQLException {
		DataModel dm = new DataModel();
		dm.create();
		dm.list();

	}
	
	//데이터 검색 list()
	public void list() {
		System.out.println();
		System.out.println("[게시물 목록]");
		System.out.println("-------------------------------");
		System.out.printf("%-6s%-12s%-16s%-40s\n","no","title","content","writer","date");
		System.out.println("-------------------------------");
		
		
		try {
			String sql = "SELECT bno, btitle, bcontent, bwriter, bdate FROM boards order by bno desc" ;
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			PreparedStatement pstmt= con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Board board = new Board();
				board.setBno(rs.getInt("bno"));
				board.setBtitle(rs.getString("btitle"));
				board.setBcontent(rs.getString("bcontent"));
				board.setBwriter(rs.getString("bwriter"));
				board.setBdate(rs.getDate("bdate"));
				System.out.printf("%-6s%-12s%-16s%-40s\\n",
				board.getBno(),
				board.getBwriter(),
				board.getBdate(),
				board.getBtitle());

				
			}
			rs.close();
			pstmt.close();
		}catch(SQLException e) {
			e.printStackTrace();
			
		}
		
		//데이터 조건검색 list()
		public void list(String name) throws SQLException {
			System.out.println();
			System.out.println("[게시물 목록]");
			System.out.println("-------------------------------");
			System.out.printf("%-6s%-12s%-16s%-40s\n","no","title","content","writer","date");
			System.out.println("-------------------------------");
			
			
			try {
				String sql = "SELECT bno, btitle, bcontent, bwriter, bdate FROM boards where bwriter=?" ;
				pst = con.prepareStatement(sql);
				pst.setString(1,name);
				rs = pst.executeQuery();
				PreparedStatement pstmt= con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
				while(rs.next()) {
					Board board = new Board();
					board.setBno(rs.getInt("bno"));
					board.setBtitle(rs.getString("btitle"));
					board.setBcontent(rs.getString("bcontent"));
					board.setBwriter(rs.getString("bwriter"));
					board.setBdate(rs.getDate("bdate"));
					System.out.printf("%-6s%-12s%-16s%-40s\\n",
					board.getBno(),
					board.getBwriter(),
					board.getBdate(),
					board.getBtitle());

					
				}
				rs.close();
				pstmt.close();
			}catch(SQLException e) {
				e.printStackTrace();
				
			}
	}

