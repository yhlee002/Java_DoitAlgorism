package chap02_array;

import java.util.Scanner;

public class p83_Q9 {
	static int year, month, day;
	//Q9) y년 m월 d일의 그 해 남은 일 수(12월 31일이면 0, 12월 30일이면 1)를 구하는 메소드를 작성.
	public static int Leap(int year) {
		if(year % 4 == 0 && year % 100 != 0 && year % 400 == 0) {
			return 0;
		}
		return 1;
	}
	
	public static void Q9(int year, int month, int day) {
		
		int[][] days = {
				{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
				{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
		};
		int sum = 0;
		for(int i = month; i < days[Leap(year)].length; i++) {
			sum += days[Leap(year)][i]; //Leap을 year을 매개변수로 받는 클래스로 변화시켜보기
		}
		
		int elseD = days[Leap(year)][month-1] - day;
		System.out.printf("남은 일 : %d", (sum + elseD));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int replay;
		do {
			System.out.println("연도  : ");
			int year = sc.nextInt();
			System.out.println("월 : ");
			int month = sc.nextInt();
			System.out.println("일 : ");
			int day = sc.nextInt();
			
			Q9(year, month, day);
			
			System.out.println("계속하시겠습니까?\n1.계속한다.\t2.종료한다.");
			replay = sc.nextInt();
		}while(replay == 1);
		
		sc.close();
	}
}
