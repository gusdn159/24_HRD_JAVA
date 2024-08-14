package day07;
import java.net.*;
public class InetAddressExample {

	public static void main(String[] args) {
		try {
			
		InetAddress local = InetAddress.getLocalHost();
		System.out.println("내 컴퓨터 IP 주소:" + local.getHostAddress());
		
		InetAddress[] iaArr = InetAddress.getAllByName("www.dju.ac.kr");
		for(InetAddress remote : iaArr) {
			System.out.println("www.dju.ac.kr IP 주소:" + remote.getHostAddress());
		}
		}catch(UnknownHostException e) {
			e.printStackTrace();
		}

	}

}
