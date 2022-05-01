package com.baseballgame;

import java.util.ArrayList;
import java.util.Random;

public class BaseBallGameRule {

	Random random = new Random();
	private ArrayList<Integer> randomNumber = new ArrayList<Integer>();
	private ArrayList<Integer> dapNumber = new ArrayList<Integer>();

	public BaseBallGameRule() {
		for (int i = 0; i < 3; i++) {
			randomNumber.add(i, random.nextInt(9) + 1);
			for (int j = 0; j < i; j++) {
				if (randomNumber.get(i) == randomNumber.get(j)) {
					i--;
				}
			}
		}
	}
	
	public String total() {
		return Integer.toString(randomNumber.get(0))+
				Integer.toString(randomNumber.get(1))+
				Integer.toString(randomNumber.get(2));

	}
	
	public ArrayList<Integer> getRandomNumber() {
		return randomNumber;
	}

	public ArrayList<Integer> getDapNumber() {
		return dapNumber;
	}


}
