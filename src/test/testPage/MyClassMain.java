package test.testPage;

public class MyClassMain {

	public static void main(String[] args) {
		
		Myclass obj1 = null;
		System.out.println("-----");
		obj1 = new Myclass(100);
		Myclass obj2 = new Myclass(200);
		obj1.printInfo();
		System.out.println("=====");
		obj2.printInfo();
	}

}
