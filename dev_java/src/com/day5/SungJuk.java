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

}
