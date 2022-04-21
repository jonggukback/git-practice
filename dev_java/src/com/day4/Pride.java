package com.day4;

public class Pride {

	private int speed;
	private String color;
	
	public Pride() {
		this(0,"black");
	}
	
	public Pride(int speed, String color) {
		this.color = color;
		this.speed = speed;
	}
	
	public void stop() {
		speed--;
	}
	
	public static void main(String[] args) {

		Pride car1 = new Pride(100,"red");
		System.out.println(car1.color);
		System.out.println(car1.speed);
		car1.speed = 70;
		System.out.println(car1.speed);
		car1.stop();
		System.out.println(car1.speed);

		
	}

}
