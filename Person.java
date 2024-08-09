package day04;

public class Person {
	//객체 모델링 (클래스 멤버)
	//tel
	//속성 : has -a 
	int age;
	String name;
	char gender; // 'F','M'
	String tel;
	String lluk;
	
	//기본 생성자
	public Person() {
	}	
	//메소드 getInfo()
	void getInfo() {
		System.out.println(this.name+"님 정보----------");
		System.out.println("나이:"+this.age);
		System.out.println("성별:"+this.gender);
		System.out.println("전화번호:"+this.tel);
		
		
	}
	void getInfo2() {
		System.out.println("선호 경력:"+this.lluk);
		System.out.println("선호 나이:"+this.age);
		System.out.println("선호 성별:"+this.gender);
		System.out.println("전화번호:"+this.tel);
	}
}
