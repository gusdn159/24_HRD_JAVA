package day02;
import java.util.Scanner;
public class IfExam3 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("#로그인 아이디");
	String name = scan.next();	
	String login ="";
	if(name.equals("admin")) {
		login="어드민";
	}else {
		login=name;
	}
	System.out.println(login+"로그인!");
	System.out.println("##메뉴를 선택하세요(1~2)##");
	int a = scan.nextInt();

	if(a==1) {
		System.out.println(login+"1번 선택함!!");	
	}else if(a==2) {
		System.out.println(login+"2번 선택함!!");
	}
	}
}
