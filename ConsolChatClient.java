package day08;
import day08.ConsolChatServer;
import java.io.*;
import java.net.*;

public class ConsolChatClient implements Runnable{
	// Socket 클래스
	// DataIn,out 객체
	Socket sock= null;

	public ConsolChatClient() {
		
		try {
			sock = new Socket("192.168.0.3",8080);
			System.out.println("서버와 연결 성공~");
			BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter pout = new PrintWriter(sock.getOutputStream(),true);
			
			Thread thread = new Thread(this);
			thread.start();
			
			String msg="";
			while((msg=key.readLine())!=null) {
				pout.println(msg);
			}
			
		}catch(IOException e) {
			
		}
	}
	public static void main(String[] args) {
		try {
			new ConsolChatClient();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public void run() {
		try {
			//OutputStream os = sock.getOutputStream();
			//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
			//String clientMsg="";
			InputStream is = sock.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String clientMsg="";
			while(true) {
				clientMsg=br.readLine();
				System.out.println("From Server>>"+clientMsg);
			}

			}catch(Exception e) {
				System.out.println("예외: "+e.getMessage());
			}


		// TODO Auto-generated method stub
		
	}

}
