package day0520;

import java.util.Arrays;

public class Exam3 {

	public static void main(String[] args) {
		
		/* 길이가 10인 배열을 만들어 0부터 9까지의 임의의 값으로 초기화
		 * 배열에 저장된 숫자가 각각 몇 번씩 나오는지 출력 */
		
		int[] numArr = new int[10];
		int[] counter = new int[10];
		
		for (int i=0; i<numArr.length; i++) {
			numArr[i] = (int)(Math.random()*numArr.length);
			System.out.print(numArr[i]);
		}
		
		System.out.println();
		
		for (int i=0; i<numArr.length; i++) {
			counter[numArr[i]]++;
		}
		
		for (int i=0; i<numArr.length; i++) {
			System.out.println(i + "의 개수 : " +counter[i]);
		}
		
		
	}

}
