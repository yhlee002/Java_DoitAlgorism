package chap02_array;

import java.util.Scanner;

//Q8) 변수 i와 days 없이 구현.(while문 사용)
public class p83_Q8 {
	
	public static int Leap(int year) {
		if(year % 4 == 0 && year % 100 != 0 && year % 400 == 0) {
			return 0;
		}
		return 1;
	}
	public static void Q8(int year, int month, int day) {
		int sum = 0;
		int[][] days = {
				{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
				{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
		};
		
		for(int j = 0; j < month -1; j++) {
			sum += days[Leap(year)][j];
		}
		sum += day;
		
		System.out.printf("입력하신 날짜 %d년 %d월 %d일은 당 해의 %d일째 날 입니다.", year, month, day, sum);	
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int replay = 1;
		do{
			System.out.println("연도 : ");
			int year = sc.nextInt();
			System.out.println("월 : ");
			int month = sc.nextInt();
			System.out.println("일 : ");
			int day = sc.nextInt();
			
			Q8(year, month, day);
			
			System.out.println("계속하시겠습니까? \n 0.계속한다.\t1.종료한다.");
			replay = sc.nextInt();
		}while(replay == 0);
		
		sc.close();
	}
}
