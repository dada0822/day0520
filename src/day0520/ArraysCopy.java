package day0520;

import java.util.Arrays;

public class ArraysCopy {

	public static void main(String[] args) {

		// 배열 복사
		// copyOf() : 배열 전체를 복사
		// copyOfRange() : 배열의 일부를 복사해서 새로운 배열을 만들어서 반환
		
		int[] arrCopy = {0, 1, 2, 3, 4};
		int[] arrCopy2 = Arrays.copyOf(arrCopy, arrCopy.length);
		int[] arrCopy3 = Arrays.copyOf(arrCopy, 3); // 3개를 복사 , 값을 지정해서 일부만 복사 가능!
		int[] arrCopy4 = Arrays.copyOf(arrCopy, 7);
		// 2번 인덱스부터 4번 인덱스 미만! 
		int[] arrCopy5 = Arrays.copyOfRange(arrCopy, 2, 4);
		int[] arrCopy6 = Arrays.copyOfRange(arrCopy, 0, 8);
		
		System.out.println("arrCopy : " + Arrays.toString(arrCopy));
		System.out.println("arrCopy2 : " + Arrays.toString(arrCopy2));
		System.out.println("arrCopy3 : " + Arrays.toString(arrCopy3));
		System.out.println("arrCopy4 : " + Arrays.toString(arrCopy4));
		System.out.println("arrCopy5 : " + Arrays.toString(arrCopy5));
		System.out.println("arrCopy6 : " + Arrays.toString(arrCopy6));
		
		
		// 배열의 정렬
		int[] arrSort = {5,6,1,9,8};
		
		System.out.println(Arrays.toString(arrSort));
		Arrays.sort(arrSort); // 정렬
		System.out.println(Arrays.toString(arrSort));
	}

}
