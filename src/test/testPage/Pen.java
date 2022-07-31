package test.testPage;

public class Pen {

	String color;
	int price;
	
	public Pen(String color, int price) {
		this.color = color;
		this.price = price;
	}
	
	public Pen(String color) {
		this(color,1000);
	}
	

	public Pen() { // 기본 생성자
					// 매개변수가 없는 생성자
		this("black",1000);
		//super(); //분모의 객체를 만들어주세요
	
		
		
	}
	
	public void write() {
		System.out.println(color+"펜을 사용합니다.");
	}
	
	
}
