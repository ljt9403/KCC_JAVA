package ch07.sec01.exam06;

public class SportsCar extends Car {

	@Override
	public void speedUp() {speed +=10;}
	
	// stop 메소드는 final 메소드이기 때문에 재정의가 불가능하다
//	@Override
//	public void stop() {
//		System.out.println("스포츠카를 멈춤");
//		speed = 0;
//	}
	
}
