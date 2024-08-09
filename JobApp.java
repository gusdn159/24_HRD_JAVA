package day04;
import java.util.Scanner;
import static java.lang.System.out;
import java.util.ArrayList;
import day04.Person;

public class JobApp {
	static Person p1=new Person();
	//static Person p2=new Person();
 ArrayList<Person> arraylist = new ArrayList<Person>();

	
	public void showMenu() {
		System.out.println("*******JobApp*******");
		System.out.println("**1.구직 등록**");
		System.out.println("**2.구인 등록**");
		System.out.println("**3.구직자 정보 출력**");
		System.out.println("**4.구인회사 정보 출력**");
		System.out.println("**5.종료**");
		System.out.println("********************");
		System.out.println("메뉴 번호를 입력하세요=>");
		System.out.println("********************");
		
	}
//이름 나이 성별 전화번호 입력
	public  void inputPerson() {
		Scanner sc=new Scanner(System.in);
		p1=new Person();
		out.println("구직 등록 start!");
		out.println("이름 입력=>");
		String nm=sc.next();
		p1.name=nm;
		out.println("나이 입력=>");
		int a=sc.nextInt();
		p1.age=a;
		out.println("--성별 메뉴----");
		out.println("1.남자 2.여자");
		out.println("---------------");
		out.println("성별 메뉴번호 입력=>");
		int s=sc.nextInt();
		if(s==1) 
			p1.gender='M';
		else if(s==2)
			p1.gender='F';
		else
			out.println("지원되지 않는 메뉴 번호입니다.");
		out.println("전화번호 입력=>");
		String t=sc.next();
		p1.tel=t;		
		arraylist.add(p1);
}
	public  void inputPerson2() {
		Scanner sc=new Scanner(System.in);
		//p2=new Person();
		out.println("구인 등록 start!");
		out.println("원하는 경력 입력=>");
		String lk=sc.next();
		p1.lluk=lk;
		out.println("원하는 나이 입력=>");
		int a=sc.nextInt();
		p1.age=a;
		out.println("--성별 메뉴----");
		out.println("1.남자 2.여자");
		out.println("---------------");
		out.println("성별 메뉴번호 입력=>");
		int s=sc.nextInt();
		if(s==1) 
			p1.gender='M';
		else if(s==2)
			p1.gender='F';
		else
			out.println("지원되지 않는 메뉴 번호입니다.");
		out.println("전화번호 입력=>");
		String t=sc.next();
		p1.tel=t;	
		arraylist.add(p1);		
	}
	//구직자 정보 출력 메소드
	
	void showInfo() {
		for(Person p: arraylist) {
			p.getInfo();
		}
	}
	void showInfo2() {
		for(Person pp: arraylist) {
			pp.getInfo2();
		}
	}


	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		JobApp ja=new JobApp();
		
	while(true) {
		ja.showMenu();
		int no=sc.nextInt();
		if(no==5) {
			System.out.println("종료합니다");
			System.exit(0);
		}else if(no==1) {
			ja.inputPerson();
		}else if(no==2 ) {
			ja.inputPerson2();
		}else if(no==3) {
			ja.showInfo();
		}else if(no==4) {
			ja.showInfo2();
	}
	}
	}
}

	
	
