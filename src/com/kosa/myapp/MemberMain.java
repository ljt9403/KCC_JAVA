package com.kosa.myapp;



public class MemberMain {

	public static void main(String[] args) {
		Member user1 = new Member();
		//user1.age=-2;
		//System.out.println(user1.age);
		
		
		user1.setName("임진순");
		Member user2 = new Member("임진택",20,"010-3333-3333","ljt9403@");
		String name1 = user1.getName();
		
		String name = user2.getName();
		System.out.println("Member()생성자로 만든 객체: "+name1);
		System.out.println("Member(....)생성자로 만든 객체"+name);
		
	}

}
