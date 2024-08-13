package day06;
import java.io.*;
import java.io.FileWriter;
import java.io.IOException;
public class FileWriterExample {

	static FileWriter fw =null;
	static BufferedInputStream dis = null;
	//static DataInputStream dis=null;
	//static DataOutputStream dos=null;
	//static InputStreamReader isr =null;
	//OutputStreamWriter osw = null;
	public static void main(String[] args) {
		try {
			//1.키보드로부터 문자데이터를 읽어와서 콘솔 출력하고 파일로도 출력하기
			InputStream is = System.in;
			dis =new BufferedInputStream(is);
			BufferedOutputStream bos = new BufferedOutputStream(System.out);
			
			int data = 0;
			while((data = dis.read())!=-1) {
				bos.write(data);
				bos.flush();
			}
			
			//System.out.println("메세지:" + message);
			//dos=new DataOutputStream(System.out);
			//dos.writeUTF(message);
			
		
		
		//fw = new FileWriter("file.txt");
		//fw.write("java");
		
		}catch(IOException e) {
			System.out.println(e.getMessage());
			System.out.println("파일이 존재 하지 않습니다.");
		}finally {
			try {
				fw.close();
				dis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
