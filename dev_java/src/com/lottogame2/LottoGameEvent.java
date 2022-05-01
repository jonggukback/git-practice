package com.lottogame2;

import java.util.Random;
import java.util.Scanner;

public class LottoGameEvent {

	LottoGameUI ui = new LottoGameUI();

	//새 게임
	public void newGame() {
		Random random = new Random();
		ui.rn = random.nextInt(9);
		System.out.println("---------------------");
		System.out.println("새게임을 불러왔습니다.");
		System.out.println("0~9사이 숫자를 맞추세요");
		System.out.println("정답은 "+evenOdd()+" 입니다");
		System.out.println("---------------------");

		int count = 2;

		while (true) {
			Scanner scan = new Scanner(System.in);
			System.out.print("정답>");
			ui.dap = scan.nextInt();
			
			if (ui.dap > 9 || ui.dap < 0) {
				System.out.println("0~9 사이 값을 입력해주세요");
			} else if (count == 0) {
				System.out.println("틀렸습니다");
				System.out.println("정답은 " + ui.rn + " 입니다.");
				ui.lose += 1;
				break;
			} else if (ui.dap == ui.rn) {
				System.out.println("맞췄습니다");
				ui.win += 1;
				break;
			} else if (ui.dap > ui.rn) {
				System.out.println("---------------------");
				System.out.println(ui.dap + "보다 down");
				System.out.println("남은목숨 : " + count);
				System.out.println("---------------------");
				count--;
			} else if (ui.dap < ui.rn) {
				System.out.println("---------------------");
				System.out.println(ui.dap + "보다 up");
				System.out.println("남은목숨 : " + count);
				System.out.println("---------------------");
				count--;
			}
		}
	}

	// 전적 불러오기
	public void history() {
		System.out.println("---------------------");
		System.out.println("전적을 불러왔습니다.");
		if (ui.win == 0 && ui.lose == 0) {
			System.out.println("아직 전적이 없습니다");
		} else {
			System.out.printf("전적 : %d승, %d패 입니다.\n", ui.win, ui.lose);
		}
	}

	public String evenOdd() {
		String evenNumber = "짝수";
		String oddNumber = "홀수";
		if (ui.rn % 2 == 1) {
			return oddNumber;
		} else {
			return evenNumber;
		}
	}
}
