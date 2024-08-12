package day05;

public class Student extends Person{

	//ID,학급 변수 cName 추가
	private String id;
	private String cName;
	
	// 생성자..
	public Student(String id, String cName,String name, int age) {
		super(name,age);
		this.id=id;
		this.cName=cName;
	}
	public Student() {}
	
	 //setter 메소드 정의 필드 값 변경 하는 메소드
	 public void setId(String id) {
		 this.id = id;
	 }
	 public void setCName(String cName) {
		 this.cName = cName;
	 }
	 //getter 메소드 정의 필드 값 변경 하는 메소드
	 public String getId() {
		 return id;
	 }
	 public String CName() {
		 return cName;
	 }
	@Override
	public String personInfo() {
		String info = super.personInfo();
		info+="ID: "+ id +"\n 학급이름: "+ cName; 
		return info;
	}	
	
	
	 //메소드 오버라이딩...

}
