package ch06.sec05.exam04;

public class SingletonExample {

	public static void main(String[] args) {
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("same Singleton 객체입니다.");
		}else {
			System.out.println("different Singleton 객체입니다.");
		}
		
	}

}
