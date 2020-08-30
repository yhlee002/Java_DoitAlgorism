package chap02_array;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class p62_Ex2_7 {
	//실습 2-7(두 배열 비교하기)
	public static boolean equals(int[] a, int[] b) {
		if(a.length != b.length) {
			return false;
		}
		for(int i = 0; i < a.length; i++) {
			if(a[i] != b[i]){
				return false;
			}
		}
		return true; //위의 사항들에 모두 해당되지 않는다면 true 리턴
	}
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("배열 a의 요솟수 : ");
		int aNum =sc.nextInt();
		
		int[] a = new int[aNum];
		
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("int[] a = "+Arrays.toString(a));
		
		System.out.println("배열 b의 요솟수 : ");
		int bNum = sc.nextInt();
		
		int[] b = new int[bNum];
		
		for(int i = 0; i < b.length; i++) {
			b[i] = sc.nextInt();
		}
		
		System.out.println("int[] b = "+Arrays.toString(b));
		
		System.out.println(equals(a, b));
		
		sc.close();
	}
}
