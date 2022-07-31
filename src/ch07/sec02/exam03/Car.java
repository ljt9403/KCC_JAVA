package ch07.sec02.exam03;

public class Car {

	Tire frontLeftTife = new Tire("앞 왼쪽", 6);
	Tire frontrightTife = new Tire("앞 오른쪽", 2);
	Tire backLeftTife = new Tire("뒤 왼쪽", 3);
	Tire backtrightTife = new Tire("뒤 오른쪽", 4);

	int run () {
System.out.println("[자동차가 달립니다.]");
if(frontLeftTife.roll()==false) {stop(); return 1;}
if(frontrightTife.roll()==false) {stop(); return 2;}
if(backLeftTife.roll()==false) {stop(); return 3;}
if(backtrightTife.roll()==false) {stop(); return 4;}
return 0;	
}





	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
	
}


