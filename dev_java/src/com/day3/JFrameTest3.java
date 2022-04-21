package com.day3;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JFrameTest3 {
	// 선언부
	JFrame jf = new JFrame();
	JButton btn = new JButton("click");
	
	
	public void initDisPlay() {
		int width = 500;
		int height = 400;
		String name = "백종국";
		jf.add("Center",btn);
		jf.setSize(width,height);
//		jf.setLayout(null);
		jf.setVisible(true);
		jf.setTitle(name);
		System.out.println("호출 성공");
	}

	// 메인 메소드
	public static void main(String[] args) {		
		JFrameTest2 jft = new JFrameTest2(); // 인스턴스화
		jft.initDisPlay(); // jft 인스턴스 변수를 붙이면 사용가능
		
		String[] names = {"김유신","이순신","강감찬"};
		for(int i=0; i<3; i++) {
			System.out.println(names[i]);
			System.out.println(args[i]);
		}
	}

}

/*
 * 한번에 하나만 담을 수 있다
 * 같은 타입만 담을 수 있다.
 * 타입이 갖고 있는 크기만큼만 담을 수 있다
 * 변수 - 배열 - 객체 배열 - List or Map 자료구조 - 쿠키와 세션
 */
