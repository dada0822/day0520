package day0520;

public class ArrayCopy1 {

	public static void main(String[] args) {

		// for문을 이용하여 복사
		int[] number = {1, 2, 3, 4};
		int[] newNumber = new int[10]; // 공간만 만들어두기
		
		for (int i=0; i<number.length; i++) {
			newNumber[i] = number[i];
		}
		
		for (int i=0; i<newNumber.length; i++) {
			System.out.print(newNumber[i] + ", ");
		}
		
		System.out.println();
		System.out.println("-----------------------------");
		
		// 2. arraycopy 이용하기
		
		// System.arrayCopy(원본 배열, 원본 시작 인덱스, 새 배열, 새 배열에 붙여넣을 시작 인덱스, 복사할 개수)
		String[] oldStrArr = {"green", "java", "copy"};
		String[] newStrArr = new String[5];
		
		// old의 0번째부터 old의 개수만큼 new의 0번째부터 복사해서 붙여넣기해라
		System.arraycopy(oldStrArr, 0, newStrArr, 0, oldStrArr.length);

		for (int i=0; i<newStrArr.length; i++) {
			System.out.print(newStrArr[i] + ", ");
		}
		
		System.out.println();
		System.out.println("-----------------------------");
		
		char[] arr1 = {'1' ,'2', '3', '4', '5'};
		char[] arr2 = {'A', 'B', 'C', 'D', 'E'};
		
		
		System.arraycopy(arr1, 1, arr2, 2, 2);
		
		for (int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i] + ", ");
		}
	}

}
