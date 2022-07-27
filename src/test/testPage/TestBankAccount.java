package test.testPage;

public class TestBankAccount {

	public static void main(String[] args) {
		
		BankAccount myAccount = new BankAccount();
		myAccount.balance=10000;
		myAccount.deposit(20000);
		System.out.println(myAccount.balance);
		
		myAccount.withDraw(30000);
		System.out.println(myAccount.balance);
		
		//myAccount라는 변수가 힙 영역에 저장된다
		
		int [] scores = {10,20,30};
		// scores라는 변수는 스택에 저장되고 주소값를 가지게 된다
		// 해당 주소값이 가리키는 곳은 heap이 되며 해당 주소에 10,20,30이 저장된다
		
	}

}
