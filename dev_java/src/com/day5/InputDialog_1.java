package com.day5;

import javax.swing.JOptionPane;

public class InputDialog_1 {
	public static void main(String[] args) {
		// 사용자에 의한 첫번째 문자열 입력
		String inputValue = null;
		inputValue = JOptionPane.showInputDialog("Enter first string");
		System.out.println("사용자가 입력한 값 : " + inputValue);
	}

}
