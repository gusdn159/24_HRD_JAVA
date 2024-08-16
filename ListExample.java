package day08;
import java.util.List;

class Board{
	private String title;
	private String content;
	
	public Board(String title, String content) {
		this.title=title;
		this.content=content;
	}
	public String getTitle() {return title;}
	public String getContent() {return content;}
}
class BoardDao{
	Board board;
	List<Board> list = new ArrayList<Board>();
	
	public BoardDao(Board board) {
		this.board=board;
	}
	List<Board>list getBoardList(){
		List<Board> list = new List<Board>
		return
	}
}
public class ListExample {

	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
		List<Board>list = dao.getBoardList();
		for(Board board : list) {
			System.out.println(board.getTitle()+"-"+board.getContent());
		}

	}

}
