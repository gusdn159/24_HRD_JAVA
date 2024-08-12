package day05;

interface DataAccessObject {
	public void select();
	public void insert();
	public void update();
	public void delete();
}
class OracleDao implements DataAccessObject{

	@Override
	public void select() {
		System.out.println("Oracle DB에서 검색");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insert() {
		System.out.println("Oracle DB에서 삽입");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		System.out.println("Oracle DB에서 수정");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		System.out.println("Oracle DB에서 삭제");
		// TODO Auto-generated method stub
		
	}
	
}

class MysqlDao implements DataAccessObject{

	@Override
	public void select() {
		System.out.println("MySql DB에서 검색");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insert() {
		System.out.println("MySql DB에서 삽입");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		System.out.println("MySql DB에서 수정");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		System.out.println("MySql DB에서 삭제");
		// TODO Auto-generated method stub
		
	}
	
}

public class DaoExample {
	
	static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}

	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MysqlDao());
		// TODO Auto-generated method stub

	}

}
