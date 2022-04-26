package com.day6;

import javax.swing.JOptionPane;

// 1. 달의 중력은 지구 중력의 17%에 불과합니다. 
// 지구에서 몸무게가 100kg인 사람은 달에 가면 17kg밖에 안됩니다.
// 당신의 몸무게는 달에서 얼마입니까?
// 		몸무게 N은 실수이고 키보드로부터 입력받습니다.
//		출력) 지구몸무게 : 100
//		     달 몸무게 : 17kg


public class VariableTest2 {
	
	public double Dal(double d) {
		double dal_N = d*0.17;
		return dal_N;
	}
	
	public static void main(String[] args) {
		// 사용자에 의한 첫번째 문자열 입력
		VariableTest2 v1 = new VariableTest2();
		String inputValue = JOptionPane.showInputDialog("당신의 몸무게는 얼마입니까? : ");
		System.out.println("지금 몸무게 : " + inputValue);
		System.out.println("달 몸무게 : " + v1.Dal(Double.parseDouble(inputValue)));
	}

}