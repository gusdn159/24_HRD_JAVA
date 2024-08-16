package day08;
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ConsolChatServer implements Runnable {
	private static ServerSocket serverSocket = null;
	static Socket socket = null;
	 
	public ConsolChatServer(){
		
		try {
		serverSocket = new ServerSocket(50001);
		System.out.println("[서버] 시작됨");
		socket =serverSocket.accept();
		System.out.println("클라이언트 접속 성공");
		//클라이언트에게 메세지 전송할 스트림 생성
		BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
		
		PrintWriter pout= new PrintWriter(socket.getOutputStream(),true);
		Thread tr= new Thread(this);
		tr.start();
		String msg="";
		
		while((msg=key.readLine())!=null) {
			pout.println(msg);
		}
		}catch(IOException e) {
			
		}
	}
	
	public static void main(String[] args) throws IOException {
		try {
			new ConsolChatServer();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		

	@Override
	public void run() {
		try {
			InputStream is = socket.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String clientMsg="";
			while(true) {
				clientMsg=br.readLine();
				System.out.println("From Client>>"+clientMsg);
			}
		}catch(Exception e) {
			System.out.println("예외: "+e.getMessage());
		}
		
	}

}
