package com.day8;

public class DetpVO {

	// 접근제한자 private 를 이용하면 외부 클래스에서 이용이 불가능하지만
	// getter, setter를 통해 값을 넘겨 받을 수 있다
	private int detpno; // 지역넘버
	private String dname; // 지역이름
	private String lco; // 지역주소
	
	public int getDetpno() {
		return detpno;
	}
	public void setDetpno(int detpno) {
		this.detpno = detpno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLco() {
		return lco;
	}
	public void setLco(String lco) {
		this.lco = lco;
	}
}
