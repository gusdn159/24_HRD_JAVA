package day03;
import java.util.Scanner;
public class Jumsubunsuk {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		boolean jum=true;
		int[] scores= null;
		while(jum){
		System.out.println("----------------------------------------------");
		System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
		System.out.println("----------------------------------------------");
		
		int b = scanner.nextInt();
		int i=0,c,d;
		
		if(b==1) {
			System.out.println("학생 수를 입력하시오");
			i = scanner.nextInt();
			scores = new int[i];		
			System.out.println("학생 수는"+scores.length+"명입니다.");
			System.out.println(scores.length);
			
		}else if(b==2) {
				System.out.println("몇번째 학생의 점수를 입력하시겠습니까?");
				c = scanner.nextInt();
				System.out.println("점수를 입력하세요");
				d = scanner.nextInt();
				scores[c] = d;

			}else if(b==3) {
				for(int f=0; f<scores.length; f++) {
				System.out.println("점수="+scores[f]);
				
			}
		}
		}
	}
}



