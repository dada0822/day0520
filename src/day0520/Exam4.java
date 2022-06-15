package day0520;

import java.util.Scanner;

public class Exam4 {

	public static void main(String[] args) {
		
		/* 극장 예약 시스템
		 * 좌석번호는 1부터 10번까지의 좌석이 있습니다.
		 * 사용자가 원하는 좌석번호를 선택하면
		 * 선택된 좌석은 1로 표시를 하고
		 * 만약 동일한 좌석을 선택하면 
		 * '이미 선택된 좌석입니다'라고 표시
		 * -1을 입력하면 종료합니다. */
		
//		Scanner s = new Scanner(System.in);
//	
//		int[] num = new int[10];
//		int[] sNum = new int[10];
//		
//		for (int i=0; i<num.length; i++) {
//			num[i] = i+1;
//		}
//		
//		while(true) {
//			System.out.println("----------------------------------");
//			
//			for(int i=0; i<num.length; i++) {
//				System.out.print(num[i] + "  ");
//			}
//			
//			System.out.println();
//			System.out.println("----------------------------------");
//			
//			for (int i=0; i<sNum.length; i++) {
//				System.out.print(sNum[i] + "  ");
//			}
//			
//			System.out.println();
//			System.out.println("----------------------------------");
//			
//			System.out.print("원하시는 좌석번호를 입력하세요(종료는 -1) : ");
//			int n = s.nextInt();
//			
//			if (n==-1) {
//				System.out.println("프로그램 종료");
//				break;
//			}
//			
//			if (sNum[n-1] == 0) {
//				sNum[n-1] = 1;
//				System.out.println("예약되었습니다.\n");
//			} else {
//				System.out.println("이미 선택된 좌석입니다.");
//			}
//		}
//		s.close();
		
		
		final int SIZE = 10;
		int[] seats = new int[SIZE];
		Scanner s = new Scanner(System.in);
		
		while (true) {
			System.out.println("----------------------------------");
			for(int i=0; i<SIZE; i++) {
				System.out.print((i+1) + "  ");
			}
			
			System.out.println("\n----------------------------------");
			
			for(int i=0; i<SIZE; i++) {
				System.out.print(seats[i] + "  ");
			}
			System.out.println("\n----------------------------------");
			
			System.out.print("원하시는 좌석번호를 입력하세요(종료는 -1) : ");
			
			int num = s.nextInt();
			
			if (num == -1) {
				System.out.println("종료되었습니다.");
				break;
			}
			
			if (seats[num-1] == 0) {
				seats[num-1] = 1;
				System.out.println("예약되었습니다.\n");
			} else {
				System.out.println("이미 예약된 좌석입니다.");
			}
			
		}
		
		s.close();
	}

}
