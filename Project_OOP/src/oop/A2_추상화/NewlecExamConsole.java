package oop.A2_추상화;

import java.util.Scanner;

import oop.A6_추상화.Exam;
import oop.A6_추상화.ExamConsole;

public class NewlecExamConsole extends ExamConsole {

	@Override
	protected Exam mekeExam() {
		return new NewlecExam();
	}

	@Override
	protected void onInput(Exam exam) {
		Scanner scan = new Scanner(System.in);
		NewlecExam newlecExam = (NewlecExam)exam;
		int com;
		
		do {
			System.out.printf("컴퓨터 : ");
			com = scan.nextInt();

			if (com < 0 || 100 < com) {
				System.out.println("컴퓨터 성적은 0~100까지의 범위만 입력이 가능합니다.");
			}
		} while (com < 0 || 100 < com);
		
		newlecExam.setCom(com);
	}

	@Override
	protected void onPrint(Exam exam) {
		NewlecExam newlecExam = (NewlecExam)exam;
		int com = newlecExam.getCom();
		System.out.printf("컴퓨터 : %d\n", com);
	}

}
