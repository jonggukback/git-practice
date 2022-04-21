package com.day5;

public class SungJuk {

	int kor;
	int eng;
	int math;
	
	public SungJuk() {
		this(0,0,0);
	}
	
	public SungJuk(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	int total() {
		int hap = kor+eng+math; // 245
		return hap;
	}
	
	double avg(int hap) {
		double avg = hap/3.0;
		return avg;
	}
	
	public static void main(String[] args) {
		// A1은 참조형 변수 -> 참조형 변수로 호출하면 주소번지가 출력됨
		// 언제 사용하지? -> 클래스 안에 선언된 변수나 메소드를 사용할때
		SungJuk A1 = new SungJuk(90,95,60);
		
		System.out.println("국어 성적 : "+A1.kor);
		System.out.println("영어 성적 : "+A1.eng);
		System.out.println("수학 성적 : "+A1.math);
		
		System.out.println("------------------------");
		
		// 총 성적값
		int total = A1.total();
		System.out.println("총합 성적 : "+total);
		
		// 평균 성적값
		double avg = A1.avg(total);
		System.out.println("평균 성적 : "+String.format("%.1f",avg));
	}
}
