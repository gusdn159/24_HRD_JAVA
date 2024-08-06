package day01;
/*
 * 사칙연산과 나머지 연산을 하는 간단한 계산기 예제
 */
import java.util.Scanner;
public class VarTest6 {

	public static void main(String[] args) {
		//1. 4칙 연산을 입력받아 저장하는 변수 선언
		//2. 2개 정수 입력받아 저장하는 변수 선언
		//3. "+" 덧셈, "-" 뺄셈, "*" 곱하기 "/" 나누기 , "&" 나머지
		Scanner scan = new Scanner(System.in);
		int a;
		System.out.println("첫번째 정수 입력:");
		a = scan.nextInt();
		int b;
		System.out.println("두번째 정수 입력:");
		b = scan.nextInt();
		int c;
		System.out.println("더하기는1 곱하기는2 나누기는3 나머지는4를 입력하시오");
		c = scan.nextInt();
		
		int result=1;
		
		if(c==1) {
			result=a+b;
		}
		else if(c==2){
			result=a*b;
		}
		else if(c==3) {
				result=a/b;
		}
		else if(c==4) {
					result=a&b;
					
				}
		System.out.println("결과="+result);

		
		

	}

}