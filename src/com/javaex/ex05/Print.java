package com.javaex.ex05;

public class Print {

	//필드
	private int num;
	private String fact;
	private double lowNum;
	private String name;
	
	//생성자
	
	
	//메소드-gs
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getFact() {
		return fact;
	}
	public void setFact(String fact) {
		this.fact = fact;
	}
	public double getLowNum() {
		return lowNum;
	}
	public void setLowNum(double lowNum) {
		this.lowNum = lowNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//메소드-일반
	public void print() {
		System.out.println(num);
		System.out.println(fact);
		System.out.println(lowNum);
		System.out.println(name);
		
	}
	
}
