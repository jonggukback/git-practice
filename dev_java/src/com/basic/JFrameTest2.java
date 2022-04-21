package com.basic;

public class JFrameTest2 {
	// 선언부

	// 화면 그리기 non-static method
	public void initDisPlay() {
		System.out.println("initDisPlay 호출 성공");
	}// end

	public static void main(String[] args) {
		JFrameTest2 jft = new JFrameTest2();
		jft.initDisPlay();
	}// end

}// end

/*
 * 실행순서 :
 * 11(main method 호출) -> 12(인스턴스화) -> 13(method 호출)
 * 7(method 구현이동)-> 8(initDisPlay 호출) -> 역순으로 종료 9-14-16
 */
