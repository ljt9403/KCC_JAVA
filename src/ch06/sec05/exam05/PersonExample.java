package ch06.sec05.exam05;

public class PersonExample {

	public static void main(String[] args) {

		Person p1 = new Person("123456-1234567", "홍길동");
		System.out.println(p1.name);
		System.out.println(p1.ssn);
		System.out.println(p1.nation);
		
		//p1.ssn = "111111-1111111"; 
		//p1.nation= "미국";
		// final 필드로 생성할 경우 상수값(한 번 초기화하면 변하지 않는 값)이 되어 수정할 수 없다
		p1.name = "홍길순";
		
	}

}
