package ch06.sec03.exam03;

public class Car {
	//필드
	String company = "현대자동차";
	String model ;
	String color ;
	int maxSpeed ;

	//생성자
	Car(){
		
	}
	
	Car(String model){
		this.model = model;
	}
	// 오버로딩
	Car(String model,String color){
		this.model = model;
		this.color = color;
	}
	
	Car(String model,String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	
}