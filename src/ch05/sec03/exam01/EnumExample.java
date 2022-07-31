package ch05.sec03.exam01;

public class EnumExample {

	public static void main(String[] args) {
		Week today = Week.MONDAY; // 열거 타입 변수 선언, 생성 및 초기화
		
		System.out.println(Week.일요일);
		System.out.println(today);
		System.out.println(today == Week.MONDAY);
		
		// enum이 나오기 전 방법은 클래스를의 상수를 이용했음
		int today2 =  MyWeek.FRIDAY;
		System.out.println(today2);
		System.out.println(MyWeek.MONDAY);
	}
	

}
// 클래스의 상수를 이용하기 위한 클라스
class MyWeek{
	public static final int MONDAY=1; // 상수로 정의
	public static final int FRIDAY=5; 
}
