package day0520;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {

		String[][] type = {
							{"boolean", "1"},
							{"char", "2"},
							{"byte", "1"},
							{"short", "2"},
							{"int", "4"},
							{"long", "8"},
							{"float", "4"},
							{"double", "8"}
		};

		Scanner s = new Scanner(System.in);
		
		int count = 0;
		
		for(int i=0; i<10; i++) {
		
			int c = (int)(Math.random()*type.length);
			
//			System.out.print("Q"+ i+1 + ". " + type[c][0] + "의 길이는? ");
			System.out.printf("Q%d. %s의 길이는? ", i+1, type[c][0]);	
			
//			int answer = s.nextInt();
			String tmp = s.next();
			
//			answer == Integer.parseInt(type[n][1])
			if (tmp.equals(type[c][1])) {
				System.out.printf("정답입니다.%n%n");
				count++;
			} else {
				System.out.println("틀렸습니다. 정답은 " + type[c][1] + "입니다.");
			}
		}
		
		System.out.println("정답 횟수 : " + count);
		
		// \n 줄바꿈 printf에서만 먹히는 줄바꿈 %n(다른 곳에선 안 먹힘)
		
		s.close();

	}

}
