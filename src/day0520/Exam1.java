package day0520;

import java.util.Arrays;

public class Exam1 {

	public static void main(String[] args) {
		
		/* 로또 번호 추출하기(6) 
		 * 1~45 랜덤
		 * 1번 : 아까 뽑았던 위치면 다시 Math.random() 돌리기
		 * 2번 : 배열 자체의 위치를 섞어서 6개만 가져오기 */
		
//		int[] ball = new int[45];
//		int[] lotto = new int[6];
//		
//		for (int i=0; i<ball.length; i++) {
//			ball[i] = i+1;
//		}
//		
//		for (int i=0; i<lotto.length; i++) {
//			int n = (int)(Math.random()*ball.length);
//			int temp = ball[i];
//			ball[i] = ball[n];
//			ball[n] = temp;
//		}
//		
//		lotto = Arrays.copyOf(ball, 6);
//		System.out.println(Arrays.toString(lotto));

		
		// 강사님
		int[] ball = new int[45];
		
		for(int i=0; i<ball.length; i++) {
			ball[i] = i+1;
		}
		
		int j = 0;
		int tmp = 0;
		for (int i=0; i<6; i++) {
			j = (int)(Math.random()*45);
			tmp = ball[i];
			ball[i] = ball[j];
			ball[j] = tmp;
		}
		
		System.out.println(Arrays.toString(ball));
		
		for (int i=0; i<6; i++) {
			System.out.printf("ball[%d] : %d\n", i, ball[i]);
		}
		
		System.out.println(ball[19]);
	}

}
