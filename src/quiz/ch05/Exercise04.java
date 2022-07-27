package quiz.ch05;

import java.util.Arrays;

public class Exercise04 {

	public static void main(String[] args) {
	
		int max = 0;
		int[] array = {1,5,3,8,2};
		
	/*  Arrays.sort(array);
	  max = array[4];*/
		
		for(int data : array) {
			if(max<data) {
				max=data;
			}
		}
	  System.out.println("max: "+max);
		
		int min = 9999;
		for(int i=0; i<array.length;i++) {
			if(min > array[i]) {
				min=array[i];
			}
		}System.out.println("min: "+min);
	  
	  
	}

}
