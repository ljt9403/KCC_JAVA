package ch06.sec05.exam03;

public class Car {

	int speed;
	
	void run() {
		System.out.println(speed+"으로 달립니다.");
	}
	
	
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.speed =60; // 필드에 저장이 됐다
		myCar.run();

	}

}
