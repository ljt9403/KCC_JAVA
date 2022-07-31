package ch07.sec03.exam01;

public abstract class PhoneExample {

	public static void main (String[] args) {

		//Phone phone = new Phone();

		// 생성자
		SmartPhone smartPhone = new SmartPhone("홍길동");
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
		
	}
	
	

}
