package test.testPage;

public class ComputerExample {

	public static void main(String[] args) {
		
		Computet com = new Computet();

int a = com.sum(1,2,3,4,5,6);
int b = com.sum(0, new int[]{2,3,4,5});
int c = com.sum(1,2,3);
	
System.out.printf("값: %d,%d,%d",a,b,c);
	}

}
