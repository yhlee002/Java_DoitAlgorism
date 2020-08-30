package chap01;

import java.util.Scanner;

public class p22 {
	//Q4. 세 값의 대소 관계 13종류의 모든 조합에 대해 중앙값을 구하여 출력하는 프로그램을 작성하세요.(p21예제와 같음)
	public static void main(String[] args) {
		//Q4실행)
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println(p21Ex.median(a, b, c));
		
		//Q5실행)
		System.out.println(med3(5, 14, 1));
		
		//실습 1-3 실행)
		int d = sc.nextInt();
		judgeSign(d);
		
		sc.close();
		
	}
	
	//Q5. 중앙값을 구하는 메서드는 다음과 같이 작성할 수도 있으나 위에 사용된 메서드보다 효율이 떨어진다. 그 이유는?
	public static int med3(int a, int b, int c) {
		if((a<=b && c<=a) ||(b<=a && a<=c)) { //a가 중앙값인 경우
			return a;
		}else if((a<=b && b<= c)||(c<=b && b<=a)){ //b가 중앙값인 경우
			return b;
		}
		return c;
	}
	
	//실습 1-3 : 입력한 정수값의 부호(음수, 0, 양수)를 판단하여 출력하는 프로그램
	public static void judgeSign(int d) {
		if(d>0) {
			System.out.println("이 수는 양수입니다.");
		}else if(d<0) {
			System.out.println("이 수는 음수입니다.");
		}else {
			System.out.println("이 수는 0입니다.");
		}
	}
}
