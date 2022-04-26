package com.day5;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutView {

	// 인스턴스화 하기 - syntax -> 타입 인스턴스변수명 = new 생성할 클래스명(); // 생성자
	// 생긴 모양이 괄호가 있으면 셋중에 하나이다. 메소드, 생성자, Casting 형변환 연산자
	// 상수로 되어 있는 것들을 변수로 바꿔보자
	JFrame jf = new JFrame();
	String send = "전송";
	int widht = 500;
	int height = 500;
	JButton btn_north = new JButton(send);
	JButton btn_south = new JButton("남쪽");
	JButton btn_east = new JButton("동쪽");
	JButton btn_west = new JButton("서쪽");
	
	public void initDisplay() {
		System.out.println("호출 성공");
		btn_north.setBackground(Color.LIGHT_GRAY);
		String north = "North"; // 버튼을 배치할 위치를 담는 변수
		jf.add(north,btn_north);
		jf.add("South", btn_south);
		jf.add("West", btn_west);
		jf.add("East", btn_east);
		jf.setSize(widht, height);
		jf.setVisible(true);
	
	
	}
	
}
