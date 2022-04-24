package com.javaex.ex05;

public class PrintApp {

	public static void main(String[] args) {

		Print point = new Print();
		point.setNum(10);
		
		Print result = new Print();
		result.setFact("true");
		
		Print lowPoint = new Print();
		lowPoint.setLowNum(5.7);
		
		Print name = new Print();
		name.setName("홍길동");
		
		/*
		System.out.println(point.getNum());
		System.out.println(result.getFact());
		System.out.println(lowPoint.getLowNum());
		System.out.println(name.getName());
		*/
		
		point.print();
		result.print();
		lowPoint.print();
		name.print();

	}

}
