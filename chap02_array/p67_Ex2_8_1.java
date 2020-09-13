package chap02_array;

import java.util.Scanner;

//실습 2-8[A] : 수와 기수를 입력하면 해당 수를 해당 기수 형태로 변환하여 배열에 넣기
public class p67_Ex2_8_1 {
	//어떤 수가 주어졌을때 몫이 0이 될때까지(0이 아닌 동안) 기수로 나누고  각 자리를 배열의 자리에 넣음
	
	static int Ex2_8(int x, int y, char[] arr) { //배열을 선언만 했는데도 바디에서 사용 가능!!!(매개변수에 쓸 때에만 가능)
		String  str = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int i = 0;
		while(x != 0) { //x%y가 0이 될때 까지 반복
			arr[i] = (str.charAt(x%y)); //각 자리를 뒤에서 부터 저장해야 함
			x /= y; //x는 y로 나누어져 점점 작아진다.
			i++;
		}
		return i; //i-1는 는 마지막에 1증가한 뒤 종료되어 실제 자리수보다 1많기 때문에 1을 빼줌. 이 수는 곧 자리수(main 메소드의 jarisoo 변수의 값으로 들어감)이다.
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int jarisoo;
		char[] a = new char[32]; //배열의 몇자리를 차지할지는 모르지만 여유잡은 것이 32
		
		System.out.println("10진수인 정수를 입력하시오.");
		int x = sc.nextInt();
		System.out.println("기수를 입력하시오.");
		int y = sc.nextInt();
		jarisoo = Ex2_8(x, y, a); //Ex2_8(300, 16, a)는 10진수 300을 16진수로 변환할때 차지하는 자리수를 리턴
		for(int i = jarisoo - 1; i >= 0; i--) { //배열의 인덱스는 0부터 자리수-1까지로 나타남.
			System.out.print(a[i]);
		}
		System.out.println();
		
		sc.close();
	}
}
