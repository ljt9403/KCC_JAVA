package ch06.sec04.exam02;

public class ComputerExample {

	public static void main(String[] args) {
		
		Computer com = new Computer();
		int[] array = new int[]{1,2,3,4,5,6,7,8,9,10};
		int sum = com.sum1(array);
		System.out.println("sum  : "+sum);
		
		int sum1 = com.sum1(new int[]{1,2,3,4,5,6,7,8,9,10});
		System.out.println("sum1 : "+sum1);
		
		int sum2 = com.sum2(1,2,3);
		System.out.println("sum2 : "+sum2);
		
		int sum3 = com.sum2(new int[] {1,2,3,4});
		System.out.println("sum3 : "+sum3);
	}

}
