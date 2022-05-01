package com.baseballgame;

import java.util.Scanner;

public class BaseBallGameUI {

	public int menu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("---------------------");
		System.out.println("숫자야구 게임");
		System.out.println("1. 새 게임");
		System.out.println("2. 종료");
		System.out.println("---------------------");
		System.out.print("메뉴>");
		int number = scan.nextInt();
		return number;
	}
	
	public static void main(String[] args) {
		
		BaseBallGameEvent event = new BaseBallGameEvent();
		BaseBallGameUI view = new BaseBallGameUI();
		boolean keepLoop = true;

		while (keepLoop) {
			switch (view.menu()) {
			case 1:
				event.newGame();
				break;
			case 2:
				System.out.println("안녕히 계세요");
				keepLoop = false;
				break;
			default:
				System.out.println("숫자 1,2만 입력 가능합니다.");
			}
		}
		
	}

}
