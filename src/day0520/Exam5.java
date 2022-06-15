package day0520;

import java.util.Scanner;

public class Exam5 {

	public static void main(String[] args) {
		
		final int SIZE = 10;
		int x = 0, y = 0;
		
		char[][] board = new char[SIZE][SIZE]; // 사용자가 입력하는 창 (제목? 포함)
		
		byte[][] shipBoard = {
				{0, 1, 0, 0, 0, 0, 0, 1, 0},
				{0, 0, 1, 0, 1, 0, 1, 0, 0},
				{0, 0, 0, 0, 0, 0, 0, 1, 0},
				{0, 0, 1, 0, 0, 0, 1, 0, 1},
				{1, 1, 0, 0, 0, 1, 0, 0, 0},
				{0, 0, 0, 0, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 1, 0, 0, 0, 1},
				{0, 0, 1, 0, 0, 0, 0, 0, 0},
				{0, 1, 0, 0, 0, 0, 1, 0, 1},	
		}; // 정답 
		
		// 숫자를 문자로 변환 : 숫자 + 문자  1 + '0' > 문자 1
		for (int i=1; i<SIZE; i++) {
			board[0][i] = board[i][0] = (char)(i+'0'); // 제목 123456789
		}
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.print("좌표를 입력하세요(종료는 00) > ");
			
			String input = scan.nextLine();
			
			if (input.length() == 2) {
				x = input.charAt(0) - '0'; 
				y = input.charAt(1) - '0';
				
				if(x == 0 & y == 0) {
					break;
				}
			}
			
			if (input.length() != 2 || x <= 0 || x >= SIZE || y <= 0 || y >= SIZE) {
				System.out.println("잘못 입력된 값입니다. 다시 입력하세요");
				continue;
			}
			
			if (shipBoard[x-1][y-1] == 1) {
				board[x][y] = 'O';
			} else {
				board[x][y] = 'X';
			}
			
			for (int i=0; i<SIZE; i++) {
				System.out.println(board[i]);
			}
			
			System.out.println();
		}
		scan.close();
	}

}
