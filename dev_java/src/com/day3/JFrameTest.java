package com.day3;

public class JFrameTest {
	// 선언부
	// 화면 그리기 메소드 -> non static method
	public void initDisPlay() {
	}
	
	// 호출성공 메소드 -> static method
	public static void MethodA(){
		System.out.println("호출 성공");
	}
	
	// 메인 메소드
	public static void main(String[] args) {
		// 내안에 선언된 method여도 static 영역안에서 사용될수 없으므로
		// 인스턴스화를 통해서 method를 호출해야 한다.
		JFrameTest jft = new JFrameTest(); // 인스턴스화
		jft.initDisPlay(); // jft 인스턴스 변수를 붙이면 사용가능
		
		// 같은 static method는 인스턴스화 없이도 사용이 가능하다
		MethodA();
	}

}

/* 
 * static 영역 안에서 non-static 타입의 변수나 메소드를 호출 할 수 없다.
 * 선언부에 선언된 변수나 메소드는 본래 클래스 내부에서는 언제든 어느 위치에서든 호출할 수 있는데
 * 위의 경우는 예외인 것 이다.
 * 문제 해결 방법 : non-static 타입의 변수나 메소드를 사용할 때 는 인스턴스화를 하면 접근이 가능하다
 */
 