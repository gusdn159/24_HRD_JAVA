package day06;
import java.io.*;
public class ReadExample {
	public static void main(String[] args) {
		try {
			Reader reader = null;
			
			reader = new FileReader("test.txt");
			while(true) {
				int data = reader.read();
				if(data == -1)break;
				System.out.println((char)data);
			}
			reader.close();
			System.out.println();
			
			reader = new FileReader("test.txt");
			char[] data = new char[100];
			while(true) {
				int num = reader.read(data);
				if(num == -1)break;
				for(int i=0; i<num; i++) {
					System.out.print(data[i]);
				}
			}
			reader.close();
			

	}catch(FileNotFoundException e) {
		e.printStackTrace();
	}catch(IOException e) {
		e.printStackTrace();
	}

}
}
