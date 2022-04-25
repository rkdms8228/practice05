package com.javaex.ex04;

public class Base {
	
	//필드
	private String day;
	private String night;
	private String afternoon;
	
	//생성자
	
	//메소드-gs
	
	//메소드-일반
	public void service(String state) {
		if(state.equals("낮")) {
			this.day  = state;
		}else if(state.equals("밤")) {
			this.night = state;
		}else {
			this.afternoon = state;
		}

	}

    public void day() {
    	System.out.println(day+"에는 열심히 수업듣자");
    }

    public void night() {
    	System.out.println(night+"에는 숙면");
    }
    
    public void afternoon(){
    	System.out.println(afternoon+"도 낮과 마찬가지로 공부해야 합니다.");
    }
    
}
