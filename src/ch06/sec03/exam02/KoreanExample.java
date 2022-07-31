package ch06.sec03.exam02;

public class KoreanExample {

	public static void main(String[] args) {

		Korean k1 = new Korean("박자바","1234-1234");
		System.out.println("k1.name : "+k1.name);
		System.out.println("k1.ssn  : "+k1.ssn);
				
		System.out.println();
		
		Korean k2 = new Korean("임진택", "940310-1010101");
		System.out.println("k2.name : "+k2.name);
		System.out.println("k2.ssn  : "+k2.ssn);
		
	}

}
