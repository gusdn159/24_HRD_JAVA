package day02;

public class ForExam2 {

	public static void main(String[] args) {
		// for(초기식; 조건식; 증감식){반복 수행문}
		// 0에서 100까지 짝수들의 합 계산
		int sum=0;
		for(int i=0; i<=100; i++) {
			if(i%2==0){
				//i%2!=면 홀수
			sum=sum+i;
		}
		}
		System.out.println("0에서 100까지 짝수들의 합:"+sum);
	}

}
