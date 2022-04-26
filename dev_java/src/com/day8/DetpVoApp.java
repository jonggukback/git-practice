package com.day8;

public class DetpVoApp {

	public static void main(String[] args) {
		
		// 객채생성 인스턴스화 -> 메모리에 담기
		DetpVO dvo = new DetpVO();
		
		// 접근제한자 private 붙어있어서 외부에서 직접적인 설정 불가능
		// dvo.detpno = 0;

		// setter를 이용하여 값 설정 가능
		dvo.setDetpno(10);
		// getter를 이용하여 확인 가능
		System.out.println(dvo.getDetpno());
	}
}
