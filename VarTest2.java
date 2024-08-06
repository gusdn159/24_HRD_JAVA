package day01;

public class VarTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수형 변수 2개 선언하기. i
		// 문자열 변수 1개 선언하기. var1
		// 문자형 변수 1개 선언하기. var2
		// 정수형 변수 1개와 문자열 변수 연결해서 출력하기
		
		int i1 = 10, i2 = 20;
		char var2 = 'A';
		String var1 = "더하기";
		
		System.out.println(i1+i2);
		System.out.println(i1+var1);
		
		
		// 강제 형 변환
		double k = 3.141592;
		i2= i2+(int)k;
		System.out.println("i2:"+i2+"\nk"+k);
	}

}
