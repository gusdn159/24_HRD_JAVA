package day05;

public class Teacher extends Person{

	private String id;
	private String tclass;
	
	public Teacher(String id, String tclass,String name, int age) {
		super(name,age);
		this.id=id;
		this.tclass=tclass;
	}
	public Teacher() {}
	
	 //setter 메소드 정의 필드 값 변경 하는 메소드
	 public void setId(String id) {
		 this.id = id;
	 }
	 public void setTClass(String tclass) {
		 this.tclass = tclass;
	 }
	 //getter 메소드 정의 필드 값 변경 하는 메소드
	 public String getId() {
		 return id;
	 }
	 public String gettClass() {
		 return tclass;
	 }
	@Override
	public String personInfo() {
		String info = super.personInfo();
		info+="ID: "+ id +"\n 수업: "+ tclass; 
		return info;
	}	
	
	

}
