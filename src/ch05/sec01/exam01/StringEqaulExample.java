package ch05.sec01.exam01;

public class StringEqaulExample {

	public static void main(String[] args) {
		String strVar1 = "임진택";
		String strVar2 = "임진택";
	
		if(strVar1 == strVar2) // 객체 주소를 비교
		{
			System.out.println("strVar1과 strVar2는 참조가 같음");
		}else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		
		if(strVar1.equals(strVar2)) { //객체의 주소가 참조하는 값이 값음
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		}
		
		String strVar3 = new String ("임진택");
		String strVar4 = new String ("임진택");
		
		System.out.println(strVar1==strVar3);// 값은 같지만 객체의 주소가 다름. 객제 주소를 비교하는 == 연산자
		System.out.println(strVar1.equals(strVar3)); // equals를 이용해 객체의 주소 비교가 아닌 주소가 참조하는 값을 비교
		
		if(strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		}else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		}
		
}
	
}
