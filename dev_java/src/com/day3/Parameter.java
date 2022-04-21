package com.day3;

public class Parameter {

	public static void main(String[] args) {
		// 메인메소드 파라미터값으로 부르기
		System.out.println(args.length);
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		
		// 배열을 선언하기 - 한 번에 방이 3개가 생김
		String[] names = new String[3];
		names[0] = "이순신";
		names[1] = "강감찬";
		names[2] = "김유신";
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		
		// 제어문으로 파라미터값 반복 호출하기 - 반복문 for 이용
		for (int i=0; i<3; i++) {
			System.out.println(args[i]);
			System.out.println(names[i]);
		}
	}

}