package oop.A6_추상화;

// abstract 부모로만 사용해야한다 -> 객체로서 사용x 확장해야한다
public abstract class Exam {

	private int kor;
	private int eng;
	private int math;
	
	public Exam() {
		this(0,0,0);
	}
	
	public Exam(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	// 추상화 클래스에서 자식 클래스들이 수정해야 할 부분
	public abstract int total();
	
	protected int onTotal() {
		return kor+eng+math;
	}

	public abstract float avg();
	

}