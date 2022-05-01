package oop.A2_추상화;

import oop.A6_추상화.ExamConsole;

public class Program {

	public static void main(String[] args) {
		ExamConsole console = new NewlecExamConsole();
		
		console.input();
		console.print();
	}

}
