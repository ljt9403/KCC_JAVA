package test.testPage;

public class ArrayCopyExample {

	public static void main(String[] args) {

		int[] arr1 =  {3,5,7,9,11};
		int[] arr2= {0,1,2,3,4};
		
		System.arraycopy(arr1, 1, arr2, 0, 3);
		//System.arraycopy(arr1, arr1에서 몇 번째, arr2, arr2에서 몇 번째, 복사할 길이);
		for (int arrr2 : arr2) {
			System.out.print(arrr2);	
		}
		
		

		
	}

}
