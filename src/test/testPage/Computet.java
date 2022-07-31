package test.testPage;

public class Computet {

	public int sum(int num1, int num2) {
		
		return num1+num2;
	}
	
	public int sum(int num1,int num2, int num3 ) {
		
		return num1+ num2+num3;
	}
	
	
	public int sum(int[] values) {//배열
		int sum = 0;
		for (int value : values) {
			sum += value;
		}
		return sum;
		
	}
	
	
	public int sum(int init,int ... values) { //배열과 같은 처리라서 앞에 하나를 추가해준다
		int sum = init;
		for (int value : values) {
			sum += value;
		}
		return sum;
	}
}
