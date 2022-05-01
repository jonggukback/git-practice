package oop.A1_코드재사용;

public class Progarm {

	public static void main(String[] args) {
		NewlecExam exam = new NewlecExam();

		exam.setKor(10);
		exam.setEng(10);
		exam.setMath(10);
		exam.setCom(10);
		
		System.out.println(exam.total());
		System.out.println(exam.avg());

	}

}
