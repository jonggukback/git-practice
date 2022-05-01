package oop.A5_UI분리하기;

public class ExamList {

	private Exam[] exams;
	private int current;

	public ExamList() {
		this(3);
	}

	public ExamList(int size) {
		exams = new Exam[size];
		current = 0;
	}

	public Exam get(int i) {
		return this.exams[i];
	}

	public void add(Exam exam) {
		Exam[] exams = this.exams;
		int size = this.current;

		// 배열에 공간이 없으면
		if (exams.length == size) {
			// 1. 크기가 5개 더 큰 새로운 배열 만들기
			Exam[] temp = new Exam[size + 5];
			// 2. 값을 이주 시키기
			for (int i = 0; i < size; i++) {
				temp[i] = exams[i];
			}
			// 3. list.exams가 새로 만든 temp 배열을 참조 할수있게 한다
			this.exams = temp;
		}

		exams[current] = exam;
		current++;
	}

	public int size() {
		return current;
	}
}
