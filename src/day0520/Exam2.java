package day0520;

import java.util.Arrays;

public class Exam2 {

	public static void main(String[] args) {
		
		/* 1부터 9 사이의 숫자들을 이용하여 
		 * 중복되지 않는 숫자로 이루어진 3자리 숫자를 만들어보시오.
		 * System.arrayCopy 이용 */
		
		// System.arrayCopy(원본 배열, 원본 시작 인덱스, 새 배열, 새 배열에 붙여넣을 시작 인덱스, 복사할 개수)

		
//		int[] num = new int[9];
//		int[] nNum = new int[3];
//		
//		for(int i=0; i<num.length; i++) {
//			num[i] = i+1;
//		}
//		
//		for (int i=0; i<num.length; i++) {
//			int r = (int)(Math.random()*num.length);
//			int tmp = num[i];
//			num[i] = num[r];
//			num[r] = tmp;
//		}
//		
//		System.arraycopy(num, 0, sNum, 0, 3);
//
//		for (int i=0; i<nNum.length; i++) {
//			System.out.print(nNum[i]);
//		}
		
		
		int[] ballArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] ball3 = new int[3];
		
		for (int i=0; i<ballArr.length; i++) {
			int j = (int)(Math.random()*ballArr.length);
			
			int tmp = 0;
			tmp = ballArr[i];
			ballArr[i] = ballArr[j];
			ballArr[j] = tmp;
		}
		
		System.out.println(Arrays.toString(ballArr));
		
		System.arraycopy(ballArr, 0, ball3, 0, 3);
		
//		System.out.println(Arrays.toString(ball3));
		
		for (int i=0; i<ball3.length; i++) {
			System.out.print(ball3[i]);
		}
	}

}
