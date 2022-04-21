package com.basic;

public class StaticTest {
	// non-static 타입의 변수로 선언하고 초기화
	// 변수명 대신 컴퓨터는 메모리의 주소번지로 기억하지만 사람은 이 긴 숫자를 기억
	// 보다는 변수명으로 접근하는 것이 편리하다
	int age = 20; // = 대입연산자

	// static 타입의 변수 선언
	static int age2 = 28;

	public static void main(String[] args) {
		// age 변수에 접근이 가능한가?
		// main 메소드는 선언부에 static이 붙어 있어서 age 사용이 불가능
		// non-static 타입은 static 타입안에서 사용이 불가능하다
		// 사용하게하려면? '인스턴스화'를 해야한다
		StaticTest st = new StaticTest();
		System.out.println(st.age);

		// static 타입이라 인스턴스화 없이 사용가능
		System.out.println(age2);
	}
}
