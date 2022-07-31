package a.c;

import a.b.ClassA;

public class ClassC {
public void doIt() {
	ClassA claA = new ClassA(); 
	//다른 패키지기 때문에 import없인 접근 불가
	System.out.println(claA.a);
	//System.out.println(claA.b);
//	System.out.println(claA.c);
	//System.out.println(claA.d);
}
}
