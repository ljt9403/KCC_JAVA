package quiz.ch05;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {

		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scan = new Scanner (System.in);
		int sum = 0;
		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("| 1. 학생수| 2. 점수입력 | 3. 점수리스트| 4. 분석| 5. 종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택>");
			
			int selectNo=Integer.parseInt(scan.nextLine());
			
			if(selectNo==1) {
				System.out.print("학생수> ");
			studentNum = Integer.parseInt(scan.nextLine());
		
			}else if(selectNo==2) {
				scores=new int[studentNum];
				
				for(int i =0 ; i<studentNum;i++) {
					System.out.print("scores["+i+"]>");
					scores[i]=Integer.parseInt(scan.nextLine());
				}
				
			}else if(selectNo==3) {
				for(int i =0 ; i<studentNum;i++) {
					System.out.println("scores["+i+"]>"+scores[i]);
				}
			}else if(selectNo==4) {
				Arrays.sort(scores);
				System.out.println("최고 점수: "+scores[studentNum-1]);
				for(int i =0 ; i<studentNum;i++) {
					
					sum += scores[i];
				}
				double avg = (double)sum / studentNum;
				System.out.println("평균 점수:"+avg);
			
			}else if(selectNo==5) {
				run = false;
			}
		}
		
		System.out.println("프로그램 종료");
		
		scan.close();
	}

}
