package test.testPage;

public class ArrayEx {

	public static void main (String[] args) {
		
		int[] intArr = {20,30,40,50};
		int sum = 0;
		for(int i=0; i <4; i++) {
			sum += intArr[i];
		
		}
		System.out.println(sum);
		
		//배열의 길이가 달라지면, for문의 조건범위에도 변화를 줘야한다.
		// 일일이 다 바꾸기 힘들기 대문에 .length(속성)를 이용
		
		int[] intArr1 = {20,30,40,50,60}; 
		int sum1 = 0;
		for(int i=0; i <intArr1.length; i++) {
			sum1 += intArr1[i];
		
		}
		System.out.println(sum1);
		
		//문자열의 .lenght은 메소드이다
		// 문자의 길이를 보여준다 (알파벳 + 특수문자)
		String s1 = "Hi Java";
		System.out.println(s1.length());
		
		//enhanced for문
		int sum3=0;
		for(int data : intArr) {
			//System.out.println(data);
			sum3 += data;
		
		}
		System.out.println(sum3);
		
	}
}
