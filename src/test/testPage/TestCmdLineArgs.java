package test.testPage;

public class TestCmdLineArgs {

	public static void main(String[] args) {
		System.out.println("main 시작");
		for(String arg : args) {
			System.out.println(arg);
		}
		System.out.println("main 종료");
	}
		
}
