package test.testPage;

public class StringTypeArrayObject {

	public static void main(String[] args) {
		String[] strArr = new String [3];
		strArr[0]="안녕";
		strArr[1]="나는";
		strArr[2]="나야";
		System.out.println(strArr);// strArr이 스택 영역에서 가지고 있는 주소
		System.out.println(strArr[0]);
		int[][] intArr = new int[2][3];
		System.out.println(intArr[0][0]);
	}

}
