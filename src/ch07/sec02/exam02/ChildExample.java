package ch07.sec02.exam02;

public class ChildExample {

	public static void main(String[] args) {

		Parent parent = new Parent();
		
		parent.method1();
		parent.method2();
		
		System.out.println("-------------");
		
		Child child = new Child();
		
		child.method1(); // Parent 클래스의 메소드 | Parent 클래스를 상속받아  Parent 클래스의 메소드 사용 가능
		child.method2(); // 재정의된 메소드가 호출된다
		child.method3();
		System.out.println("---------");
		
//		child = (Child)parent; 
//
//		child.method1();
//		child.method2();
//		child.method3();
		System.out.println("---------");
		parent = child;
		parent.method1();
		parent.method2(); //상속 후 재정의가 된 메소드라서 재정의된 메소드로 호출된다
		
		
	}

}
