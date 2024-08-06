package day01;

public class VarTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.정수 변수
		
		int x;
		// 변수 초기화
		x = 1;
		
		int y = 2 ;
		
		int result = x + y;
		// sysout 컨트롤 스페이스 엔터
		System.out.println(result);
		
		//2.실수 변수
		//float(4byte),double(8byte)
		double height = 179.5;
		float weight = 88.5f;
		System.out.print("키:"+height+"\n몸무게:"+weight+"\n");
		
		//3. 문자형 변수
		//char  문자형은 작은따옴표
		char blood = 'A';
		System.out.println("혈액형:"+ blood +"형 입니다.");
		//4. 문자열 변수
		//String
		String name = "강현우";
		System.out.println("이름:"+name+"입니다.");
		//5. 논리변수
		//boolean
		boolean stop = true;
		
		if(stop == true) {
			System.out.println("중지합니다");
		}else {
			System.out.println("시작합니다");
		}

	
	}

}
