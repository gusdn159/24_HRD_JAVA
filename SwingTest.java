package day05;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SwingTest extends JFrame{
	//JFrame은 스윙에 이미 만들어져있음
	
	JButton okBtn;
	
	
	
	
	

	public SwingTest() {
		super("첫번째 스윙연습");
		setTitle("타이틀...");
		okBtn =new JButton("OK");
		
		MyListener my = new MyListener();
		okBtn.addActionListener(my);
		add(okBtn);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500,300);
		setVisible(true);;
	}
	//내부 클래스(Inner Class로 이벤트 처리자 구현하기)
	class MyListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			String result = e.getActionCommand();
			
			if(result.equals("OK")) {
				System.out.println("OK 버튼이 클릭됨");
				
			}
		}
		
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		new SwingTest();
		//익명 변수-> 참조형변수가 필요없을때 씀

	}

}
