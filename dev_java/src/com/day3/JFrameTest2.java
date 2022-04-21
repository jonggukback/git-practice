package com.day3;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JFrameTest2 {
	// 선언부
	JFrame jf = new JFrame();
	JButton btn = new JButton("click");
	
	
	public void initDisPlay() {
		int width = 500;
		int height = 400;
		String name = "백종국";
		jf.add("Center",btn);
		jf.setSize(width,height);
		jf.setLayout(null);
		jf.setVisible(true);
		jf.setTitle(name);
		System.out.println("호출 성공");
	}

	// 메인 메소드
	public static void main(String[] args) {		
		JFrameTest2 jft = new JFrameTest2(); // 인스턴스화
		jft.initDisPlay(); // jft 인스턴스 변수를 붙이면 사용가능
	}

}

/*
 * static 영역 안에서 non-static 타입의 변수나 메소드를 호출 할 수 없다. 선언부에 선언된 변수나 메소드는 본래 클래스
 * 내부에서는 언제든 어느 위치에서든 호출할 수 있는데 위의 경우는 예외인 것 이다. 문제 해결 방법 : non-static 타입의 변수나
 * 메소드를 사용할 때 는 인스턴스화를 하면 접근이 가능하다
 */
