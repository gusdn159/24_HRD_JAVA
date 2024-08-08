package day03;
import java.util.Scanner;
public class CodingTest1 {

	public static void main(String[] args) {
		//string 5
		//stringstringstringstringstring
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		int n = scanner.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.println(str);
		}

	}

}
