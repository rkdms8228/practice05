package com.javaex.ex01;

public class Member {

	//필드
	private String name;
	private String id;
	private int point;
	
	//생성자
	
	//메소드-gs
	public void setName(String name) {
		this.name = name;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setPoint(int point) {
		this.point = point;
	}
		
	public String getName() {
		return name;
	}
	
	public String getId() {
		return id;
	}
	
	public int getpoint() {
		return point;
	}

	//메소드-일반
	public void showInfo() {
		System.out.println("회원 정보: "+name+"("+id+"), "+point+"점.");
	}
	
}
