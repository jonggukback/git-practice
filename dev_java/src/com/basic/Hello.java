package com.basic;

public class Hello {
// 여기는 클래스 영역입니다.
// 클래스 안에는 '변수' 와 '메서드'가 살고 있습니다.
// '변수'에는 데이터(숫자, 문자열, 참거짓)을 담습니다.
	
	// 메인 메소드가 있어야 .exe 파일로 만들 수 있습니다. -> 실행 할 수 있다.
	// main method 가 entry point이다 -> 제일 먼저 실행 된다.
	// 메인 스레드 이다.
	public static void main(String[] args) {
		// System - > 현재 사용중인 PC
		// .out - > 출력장치를 사용하겠다
		// .println -> 출력 기능을 담당하는 method
		System.out.println("Hello Java");
	}// end of main method - 기능, 처리, event

}// end of Class(Hello)
