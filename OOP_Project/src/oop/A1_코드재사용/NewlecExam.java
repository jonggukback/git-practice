package oop.A1_코드재사용;

import oop.A5_UI분리하기.Exam;

public class NewlecExam extends Exam{

	private int com;

	public NewlecExam() {
		this(0,0,0,0);
	}
	
	// super 키워드로 부모 클래스(Exam)의 생성자도 불러 올 수 있다.
	public NewlecExam(int kor, int eng, int math, int com) {
		super(kor,eng,math);
		this.com = com;
	}
	
	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}
	
	// super 키워드로 부모 클래스(Exam)에 있는 method를 불러 올 수 있다.
	public int total() {
		return super.total()+com;
	}
	
	public float avg() {
		return total()/4.0f;
	}
	
}
