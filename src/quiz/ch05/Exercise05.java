package quiz.ch05;

public class Exercise05 {

	public static void main(String[] args) {
int[][] array = {
		{95,86},
		{83,92,96},
		{78,83,93,87,88}
 };

	int sum = 0;
	double avg = 0.0;
	int listNum = 0;
	for (int i =0; i<array.length;i++) {// 0,1,2
		for(int j = 0; j<array[i].length;j++) {// 길이 2, 3, 5
		 sum +=array[i][j];
		}
	} 
	
	for(int i =0; i<array.length;i++) {
	listNum +=array[i].length;	
	}
	
	avg = sum / (double)listNum;
	
	
	System.out.println("sum: "+sum);
	System.out.println("avg: "+avg);

	}

}
