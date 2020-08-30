package chap01;
//중앙값 구하기

import java.util.Scanner;

class p21Ex {
	static int med;
	public static int median(int a, int b, int c) {
		med = a;
		if(a<=b) {
			if(b<=c) { //a<=b<=c
				med = b;
			}else if(c<=a) { //c<=a<=b
				med = a;
			}else { //c가 a와 b의 중앙값인 경우
				med = c;
			}
		}else { //b<a
			if(c<b) { //c<b<a
				med = b;
			}else if(a<c){ //b<a<c
				med = a;
			}else { //c가 a와 b의 중앙값인 경우
				med = c;
			}
		}
		
		return med;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("a값 입력");
		int a = sc.nextInt();
		System.out.println("b값 입력");
		int b = sc.nextInt();
		System.out.println("b값 입력");
		int c = sc.nextInt();
		
		System.out.println("중간값 : "+median(a, b, c));
		
		sc.close();
	}
}
