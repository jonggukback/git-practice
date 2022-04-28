package com.lottogame;

public class LottoGameMain {

	public static void main(String[] args) {
		// 0~9 사이에 번호를 채번해서 그 숫자를 맞추는 게임 (5번안에 맞춰야한다)
		LottoGameApp lga = new LottoGameApp();

		boolean keepLoop = true;
		
		while (keepLoop) {
			switch (lga.menu()) {
			case 1:
				System.out.println("---------------------");
				System.out.println("새게임을 불러왔습니다.");
				System.out.println("0~9사이 숫자를 맞추세요");
				lga.newGame();
				break;
			case 2:
				System.out.println("---------------------");
				System.out.println("전적을 불러왔습니다.");
				lga.history();
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
