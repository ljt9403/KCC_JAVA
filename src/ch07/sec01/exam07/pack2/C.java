package ch07.sec01.exam07.pack2;

import ch07.sec01.exam07.pack1.A;

public class C extends A{
	String field;
	
	public C(){
		super.field="199";	
		this.field= super.field;
	
		super.method();
	}
	
	public void method() {
		super.method();
	}


	
	
}
