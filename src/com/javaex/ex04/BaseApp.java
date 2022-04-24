package com.javaex.ex04;

public class BaseApp {

	public static void main(String[] args) {
		
		Base day = new Base();
		day.setTime("낮");
		day.setDoing("열심히 수업듣자");
		
		Base night= new Base();
		night.setTime("밤");
		night.setDoing("숙면");
		
		Base afternoon = new Base();
		afternoon.setTime("오후");
		afternoon.setDoing("마찬가지로 공부");
		
		System.out.println(day.getTime()+"에는 "+day.getDoing());
		System.out.println(night.getTime()+"에는 "+night.getDoing());
		System.out.println(afternoon.getTime()+"도 "+day.getTime()+"과 "+afternoon.getDoing()+"해야 합니다.");
		
	}

}
