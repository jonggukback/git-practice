package oop.A3_인터페이스;

public class A {
	private X x;
	
	public void setX(X x) {
		this.x = x;
	}

	public A() {
	}
	
	public void print() {
		int total = x.total();
		System.out.println("total is : "+total);
		
	}
}
