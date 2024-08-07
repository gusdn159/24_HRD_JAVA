package day02;
import java.util.Scanner;
public class IfExam {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int jumsu = 0;
		System.out.println("점수 입력");
		jumsu = scan.nextInt();
		
		if(jumsu>=90) {
			System.out.println("a+입니다");
		}else if(jumsu>=80) {
		System.out.println("a0입니다");
		}else if(jumsu>=70) {
			System.out.println("b+입니다");
		}else if(jumsu>=60) {
			System.out.println("b0입니다");
		}else if(jumsu>=50) {
			System.out.println("c+입니다");
		}else if(jumsu>=40) {
			System.out.println("c0입니다");
		}else if(jumsu>=30) {
			System.out.println("d+입니다");
		}else if(jumsu>=20) {
			System.out.println("d0입니다");
		}else{
			System.out.println("f입니다");
		}

	}
	}

