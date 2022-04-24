package com.javaex.ex02;

public class Goods {

	//필드
	private String name;
	private int price;
	
	//생성자
	public Goods() {
		//추가로 로직이 필요하지 않으면 생략 가능함(컴파일러가 알아서 생성)
		//하지만 생성자가 한 개라도 있다면 컴파일러가 알아서 기본 생성자를 추가하지 않음으로 작성 필요
	}
	
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	//메소드-gs
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	//메소드-일반
	public void showInfo() {
		System.out.println("상품명: "+name+", 가격: "+price);
	}
	
}
