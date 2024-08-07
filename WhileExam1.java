package day02;

public class WhileExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0,sum=0; //초기식
		while(i<=100) { //조건식
			i++; //증감식
			if(i%2==0){
				//i%2!=면 홀수
			sum=sum+i;
		}
		}
		System.out.println("0에서 100까지 짝수들의 합:"+sum);
	}
}
