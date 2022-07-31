package test.testPage;

public class PenExample {

	public static void main(String[] args) {

		Pen myPen = new Pen(); //myPen은 Pen의 객체 주소
		System.out.println(myPen);
		
		Pen myPen2 = new Pen();
		System.out.println(myPen2);
		
		System.out.println(myPen==myPen2); //서로 다른 주소값
		
		myPen.color = "blue";
		myPen.color = "red";
		
		myPen.write();
		myPen2.write();
		
		SimplePen pen = SimplePen.getInstance();
		// 하나의 클래스로 하나의 객체만 만들 수 있다
		SimplePen pen2 = SimplePen.getInstance();
		System.out.println(pen==pen2);
		// 같은 주소를 가진다
		
	}

	
	}
	class SimplePen{
	private static SimplePen pen = new SimplePen();
	private SimplePen() {}
	public static SimplePen getInstance() {
		return pen;
	}
}
