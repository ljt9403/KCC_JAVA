package ch07.sec02.exam01;

class A{}

class B extends A{}
class C extends A{}
class D extends B{}
class E extends C{}

public class PromotionExample {

	B b = new B();
	C c = new C();
	D d = new D();
	E e = new E();
	
	A a1 = b;
	A a2 = c;
	A a3 = d;
	A a4 = e;
	
	B b1 = d;
	C c1 = e;
	
	// 상속 관계에 있지 않다
	//	B b3 = e;
	//	C c2 = d;
	
	
}
