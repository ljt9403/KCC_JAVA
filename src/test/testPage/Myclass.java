package test.testPage;

public class Myclass {

	int a = 10;
	static int b;
	final int c;
	 static{//static block은 static 멤버를 초기화할 때 사용한다 // instance보다 밑에 둬도 먼저 실행
		// 클래스가 로딩되면서 꼭 한 번 실행되어야할 때
		 b = 10;
		System.out.println("static b = "+ b);
		System.out.println("static initializer");// 프로그램 시작할 때 한 번 실행
	}
	{// 인스턴스 블록에서 하는 변수 초기화는  생성자에서도 해도 되기 때문에 굳이 필요는 없다
		c = 20;
		System.out.println("final c = "+ c);
		System.out.println("instance initializer"); //final 변수를 초기화하는 용도
	}
	
	public Myclass(int a) {
		this.a = a;
		System.out.println("constructor");
	}
	
	public void printInfo() {
		System.out.println(a +" "+b+" "+c);
	}
	
}
