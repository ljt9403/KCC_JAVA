package ch06.sec05.exam05;

public class Person {

	final String nation = "Korea";
	final String ssn; // 원래는 바로 초기화 해줘야하지만 생성자를 이용해 초기화를 시켜줘도 된다
	String name;
	
	public Person(String ssn,String name) { 
		this.name = name;
		this.ssn = ssn;
	}
	
}
