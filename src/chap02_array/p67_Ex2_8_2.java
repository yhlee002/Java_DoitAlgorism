package chap02_array;

import java.util.Scanner;

public class p67_Ex2_8_2 {
	static int getJarisoo(int x, int y, char[] a) {
		int i = 0;
		int jarisoo;
		String index = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		do {
			a[i++] = index.charAt(x % y);
			x /= y; //i가 3일때 x == 0 성립(종료 조건) -> 이때 나온 나머지가 배열의 가장 마지막 자리에 들어감
		}while(x != 0);
		
		jarisoo = i-1; // i는 후위증가기 때문에 실제 인덱스보다 +1되어져 나옴.(실제 인덱스 : 0~2) 
		
		return jarisoo;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x; //변환할 십진수
		int y; //변환하는 기준이 되는 기수
		int jarisoo; //자리수
		int retry;
		char[] arr = new char[32];
		do {
			do {
				System.out.println("양의 정수를 입력하세요.");
				x = sc.nextInt();
			}while(x < 0);
			
			System.out.println("기수를 입력하세요.");
			y = sc.nextInt();
			
			jarisoo = getJarisoo(x, y, arr);
			
			for(int i = jarisoo; i >= 0; i--) {
				System.out.print(arr[i]);
			}
			
			System.out.println("\n프로그램 작동을 계속 하시겠습니까?\n1.동의\t2.반대");
			retry = sc.nextInt();
		}while(retry == 1);
		
		sc.close();
	}
}


