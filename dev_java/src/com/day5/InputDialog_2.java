package com.day5;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class InputDialog_2 {
	public static void main(String[] args) {
		// 사용자에 의한 첫번째 문자열 입력
		String inputValue = null;
		inputValue = JOptionPane.showInputDialog("Enter first string");
		JTextArea jta_result = new JTextArea(5,20);
		jta_result.setText("♠♠♠ 텍스트 첫번째 라인 지정 ♠♠♠");
		jta_result.append("\n");
		jta_result.append("사용자가 입력한 값 : " + inputValue);
		// 결과 표시
		JOptionPane.showMessageDialog(null, jta_result
				                    , "결과 표시", JOptionPane.INFORMATION_MESSAGE);
		// 자바 가상머신과 연결고리 끊기
		System.exit(0);
	}
}
