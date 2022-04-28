package com.lottogame;

import java.util.Random;
import java.util.Scanner;

public class LottoGameApp {

	Scanner scan = new Scanner(System.in);
	Random random = new Random();
	private int randomNumber;
	private int dap;
	private int win;
	private int lose;

	public int menu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("---------------------");
		System.out.println("Lotto game");
		System.out.println("1. 새 게임");
		System.out.println("2. 전적");
		System.out.println("3. 종료");
		System.out.println("---------------------");
		System.out.print("메뉴>");
		int number = scan.nextInt();
		return number;
	}

	public void newGame() {
		randomNumber = random.nextInt(9);
//		System.out.println("정답은 "+evenOdd()+" 입니다");
		System.out.println("---------------------");

		int count = 2;

		while (true) {
			System.out.print("정답>");
			dap = scan.nextInt();
			if (dap > 9 || dap < 0) {
				System.out.println("0~9 사이 값을 입력해주세요");
			} else if (count == 0) {
				System.out.println("틀렸습니다");
				System.out.println("정답은 " + randomNumber + " 입니다.");
				lose += 1;
				break;
			} else if (dap == randomNumber) {
				System.out.println("맞췄습니다");
				win += 1;
				break;
			} else if (dap > randomNumber) {
				System.out.println("---------------------");
				System.out.println(dap + "보다 down");
				System.out.println("남은목숨 : " + count);
				System.out.println("---------------------");
				count--;
			} else if (dap < randomNumber) {
				System.out.println("---------------------");
				System.out.println(dap + "보다 up");
				System.out.println("남은목숨 : " + count);
				System.out.println("---------------------");
				count--;
			}
		}
	}

	public void history() {
		if (win == 0 && lose == 0) {
			System.out.println("아직 전적이 없습니다");
		} else {
			System.out.printf("전적 : %d승, %d패 입니다.\n", win, lose);
		}
	}

	public String evenOdd() {
		String evenNumber = "짝수";
		String oddNumber = "홀수";
		if (randomNumber % 2 == 1) {
			return oddNumber;
		} else {
			return evenNumber;
		}
	}

}
