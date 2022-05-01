package com.lottogame2;

import java.util.Scanner;

public class LottoGameUI {

	LottoGameRule rule = new LottoGameRule();
	int rn = rule.getRandomNumber();
	int dap = rule.getDap();
	int win = rule.getLose();
	int lose = rule.getWin();

	// UI
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

	public static void main(String[] args) {
		// 0~9 사이에 번호를 채번해서 그 숫자를 맞추는 게임 (5번안에 맞춰야한다)
		LottoGameUI view = new LottoGameUI();
		LottoGameEvent event = new LottoGameEvent();

		boolean keepLoop = true;

		while (keepLoop) {
			switch (view.menu()) {
			case 1:
				event.newGame();
				break;
			case 2:
				event.history();
				break;
			case 3:
				System.out.println("안녕히 계세요");
				keepLoop = false;
				break;
			default:
				System.out.println("숫자 1 ~ 3 사이만 입력 가능합니다.");
			}
		}
	}
}