package day03;

public class ACBVLExample1 {

	public static void main(String[] args) {
		//문자열 데이터 4개를 저장한 배열 선언
		String[] season = { "Spring","Summer","Fall","Winter"};
		//배열의 항목값 읽기
		
		for(int i=0; i<4; i++) {
			System.out.println("season"+"["+i+"]="+season[i]);
		}
		season[1]="여름";
		
		for(int i=0; i<4; i++) {
			System.out.println("season"+"["+i+"]="+season[i]);
	}
		//이름 문자열 3개를 저장할 배열 선언 및 초기화
		String[] names = null;
		
		names = new String[] {"자바","씨플플","파이썬"};
			
}
}
