package quiz.ch6;

public class Exercise6_4_03 {

	public static void main(String[] args) {

		MemberService ms = new MemberService();
		
	boolean result = ms.login("hong", "12345");
	if(result) {
		System.out.println("로그인 되었습니다.");
	}else {
		System.out.println("id 또는 password가 옳바르지 않습니다.");
	}
		//System.out.println(result);
		ms.logout("hong");
	}

}
