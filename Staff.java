package day05;

public class Staff extends Person{

	private String id;
	private String dept;
	//id
	//private String dept;담당 부서
	public Staff(String id,String dept,String name, int age) {
		super(name,age);
		this.id=id;
		this.dept=dept;
	}
	
	public Staff() {}
	
	public void SetId(String id) {
		this.id=id;
	}
	public void SetDept(String dept) {
		this.dept=dept;
	}
	public String getId() {
		return id;
	}
	public String gedDept() {
		return dept;
	}
	@Override
	public String personInfo() {
		String info = super.personInfo();
		info+="ID: "+ id +"\n 담당부서: "+ dept; 
		return info;
	}
	
	
	
}
