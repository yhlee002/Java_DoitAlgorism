package chap02_array;

import java.util.Scanner;

//Q6
public class p70_Q6 {
	static int getIndex(int a, int r, char[] d) {
		
		int index = d.length -1;
		String str = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			d[index--] = str.charAt(a % r);
			a /= r;
			
		}while(a != 0);
		
		return index + 1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int index;
		int rr;
		char[] arr = new char[36];
		do {
			do {
				System.out.println("변환할 양의 정수를 입력하라.");
				num = sc.nextInt();
			}while(num < 0);
			
			System.out.println("기수를 입력하라.");
			int r = sc.nextInt();
			
			index = getIndex(num, r, arr);
			
			for(int i = index; i < arr.length; i++) {
				System.out.print(arr[i]);
			}
			System.out.println();
			System.out.println("계속하시겠습니까?\n1.계속한다.\t2.그만둔다.");
			rr = sc.nextInt();
		}while(rr == 1);
		sc.close();	
	}
}
