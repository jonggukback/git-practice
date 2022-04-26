package com.day6;

import java.util.Scanner;

public class VariableTest {

	// 1. 달의 중력은 지구 중력의 17%에 불과합니다. 
	// 지구에서 몸무게가 100kg인 사람은 달에 가면 17kg밖에 안됩니다.
	// 당신의 몸무게는 달에서 얼마입니까?
	// 		몸무게 N은 실수이고 키보드로부터 입력받습니다.
	//		출력) 지구몸무게 : 100
	//		     달 몸무게 : 17kg

	public double Dal(double N) {
		double dal_N = N*0.17;
		return dal_N;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("당신의 몸무게는 얼마입니까? : ");
		double N = scan.nextInt();
		
		VariableTest v1 = new VariableTest();
		System.out.println("지금 몸무게 : "+N);
		System.out.println("달 몸무게 : "+v1.Dal(N));
		scan.close();
	}
	
}
