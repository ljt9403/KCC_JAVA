package test.testPage;

import java.util.Scanner;

public class ArrayManager {

	public static void main(String[] args) {
		// 배열 생성, 이 예제는 정수값만 저장하는 배열을 생성
		int [] array = new int[10];
		
		//배열의 참조할 인덱스 | 초기값을 -1로 잡는다 | 0으로 잡을 경우 1번 인덱스를 가리키기 때문
		int index = -1;
		
		//배열에 저장된 데이터의 개수를 저장할 변수, 초기값은 0
		int count = 0;
		
		// 배열의 데이터를 입력, 수정, 삭제, 조회(전체 조회 | 들어있는 개수만큼만)하는 메뉴를 작성하고 입력받음
		// 메뉴 : 1.입력 | 2.수정 | 3.삭제 | 4.조회 | 5.삽입 | 0.종료
		// 1 -> 입력할 데이터
		// 2 -> 수정할 인덱스와 데이터\
		// 3 -> 삭제할 인덱스
		// 4 -> 저장된 데이터 출력
		// 5 -> 삽입할 인덱스와 데이터
	
		Scanner scan = new Scanner(System.in);
		System.out.println("\t             배열 관리 프로그램");
		while(true) {
			System.out.println("-----------------------------------------");
			System.out.println("1.입력 | 2.수정 | 3.삭제 | 4.조회 | 5.삽입 | 0.종료");
			System.out.println("-----------------------------------------");
			System.out.print("메뉴 -> ");
			int menu = scan.nextInt();
			
			switch(menu) {
			case 1:
				System.out.print("배열에 입력할 데이터 -> ");
				int inputData = scan.nextInt();
				array[count] = inputData;
				count++;
				break;
			case 2:
				System.out.println("수정할 데이터의 인텍스와 새 값 입력(예: 2 30)");
				index = scan.nextInt();
						int updataData = scan.nextInt();
				array[index] = updataData;
				break;
			case 3:
				for(int i = 0; i<count;i++) {
					System.out.print("array["+i+"]="+array[i]+"\t");
					if (i == 4) {
						System.out.println();
					}
				}
				System.out.println();
				System.out.println("삭제할 데이터의 인덱스 선택->");
				index = scan.nextInt();
				for(int i = index; i<count-1;i++ ) {
					array[i]=array[i+1];
				}
				
				count--;
				break;
			case 4:
				
				System.out.println("데이터 출력 중....");
				for(int i = 0; i<count;i++) {
					System.out.print("array["+i+"]="+array[i]+"\t");
					if (i == 4) {
						System.out.println();
					}
				}
				System.out.println();
				break;
			case 5:
				boolean result = true;
				while(result) {
				System.out.println("삽입할 위치와 데이터 입력(예: 2 30): ");
				index = scan.nextInt();
				int insertData= scan.nextInt();
				if (index!=0&&array[index-1]==0  ) {
					System.out.println(index-1+"번부터 채워주세요.");
					
					

				}else {
				
				for(int i = count; i>index;i--) {
					
					array[i]=array[i-1];
					
				}
				array[index]=insertData;
				count++;
				result = false;	
				}
							
				
				}
				
				break;
				
				
			case 0:
				scan.close();
				System.out.println("프로그램 종료");
				System.exit(0);
				
			} //end switch
			
		} //end while
	
	} //end main

} //end class
