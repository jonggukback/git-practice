package com.lottogame;

import java.util.Random;

public class LottoGameRN {

	Random random = new Random();
	private int randomNumber;
	private int answer;

	public int getRandomNumber() {
		return randomNumber;
	}

	public void setRandomNumber(int rNumber) {
		this.randomNumber = random.nextInt(rNumber);
	}

	public int getAnswer() {
		return answer;
	}

	public void setAnswer(int answer) {
		this.answer = answer;
	}

	private String evenOdd(int randomNumber) {
		String evenNumber = "짝수";
		String oddNumber = "홀수";
		if (randomNumber % 2 == 1) {
			return oddNumber;
		} else {
			return evenNumber;
		}
	}

}
