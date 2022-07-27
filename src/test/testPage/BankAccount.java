package test.testPage;

public class BankAccount {

	int balance; // 멤버 변수, instance(인스턴스) 변수
	static int value; //  멤버 변수(클래스 멤버), static(정적) 변수
	static final int SU=10; // 상수, 기본값을 꼭 미리 가져야함, 대문자, static이 따라 다닌다, 보통 메소드 영역에서 생성 
	
	public BankAccount() {} //기본 생성자
	
	public void deposit(int amount) {
	balance = balance + amount;	
	}//입금 처리 메소드

	public void withDraw(int amount) {
		balance = balance - amount;
	}//출금 처리 메소드
	
	
}
