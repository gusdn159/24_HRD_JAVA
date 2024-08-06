package day01;
import java.util.Scanner;
public class VarTest4 {

	public static void main(String[] args) {
		//스캐너 입력객체 new키워드 반드시 써주기(참조형변수일때)
		Scanner scan = new Scanner(System.in);
		
		int x;
		x = 5;	
		System.out.println("첫번째 정수 입력:");
		x = scan.nextInt();
		//x 값을 입력		
		
		int y = 2 ;	
		System.out.println("두번째 정수 입력:");
	    y = scan.nextInt();
	    //y 값을 입력
	    
		int result = x + y;
		System.out.println(result);
		
		
		double height = 179.5;
		System.out.println("키 입력:");
		height = scan.nextDouble();
		
		
		float weight = 88.5f;
		System.out.println("몸무게 입력:");
		weight = scan.nextFloat();
		
		String name = "";
		System.out.println("이름 입력:");
		name = scan.next();
		
		
		System.out.print("키:"+height+"\n몸무게:"+weight+"\n");
		char blood = 'A';
		System.out.println("혈액형:"+ blood +"형 입니다.");
		System.out.println("이름:"+name+"입니다.");
		
		
		boolean stop = true;
		if(stop == true) {
			System.out.println("중지합니다");
		}else {
			System.out.println("시작합니다");
		}

	
	}

}
