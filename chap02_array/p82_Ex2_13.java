package chap02_array;

import java.util.Scanner;

//실습 2-13) 해를 입력받고 윤년 판단하기 + 달을 입력받고 지난 일 수 구하기
public class p82_Ex2_13 {
	static Scanner sc = new Scanner(System.in);
	static int year, month, day;
	
	public static int Leap(){
		
		if(year % 4 == 0 && year % 100 != 0 && year % 400 == 0) {
//			System.out.println("입력하신 연도는 윤년입니다.");
			return 0;
		}
//		System.out.println("입력하신 연도는 평년입니다.");
		return 1;
	}
	
	public static void DayofYear(int year, int month, int day) {
		int[][] d = {
				{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
				{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
		}; //배열의 원소들을 입력할 수 있는 것은 초기화할 때만 가능
		
		int sum = 0;
		for(int i = 0; i < month - 1; i++) { //입력한 month의 인덱스 전까지 계산('<'때문)
			sum += d[Leap()][i];
		}
		
		sum += day;
		System.out.printf("%d년 %d월 %d일은 %d일째 일입니다.", year, month, day, sum);
		
	}
	
	public static void main(String[] args) {
		int rep;
		do{
			System.out.println("연도를 입력하세요.");
			year = sc.nextInt();
			
			System.out.println("달을 입력하세요.");
			month = sc.nextInt();
			
			System.out.println("일을 입력하세요.");
			day = sc.nextInt();
			
			DayofYear(year, month, day);
			
			System.out.println("다시 실행하시겠습니까?\n1.실행\t 2.종료");
			rep = sc.nextInt();
		}while(rep == 1);
		
	}
}
