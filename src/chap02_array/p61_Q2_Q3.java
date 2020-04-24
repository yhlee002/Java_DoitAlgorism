package chap02_array;

import java.util.Arrays;

public class p61_Q2_Q3 {
	
	//Q2
	public static int[] Q2(int[] a) {
		for(int i = 0; i < a.length/2; i++) { //배열의 요솟수/2가 아닌 배열의 요솟수만큼 실행하면 원상복귀
			int x = a[i];
			a[i] = a[a.length -1 -i];
			a[a.length -1 -i] = x;
		}
		return a;
	}
	
	
	//Q3
	public static int Q3(int[] a) {
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	
	//실행 메소드
	public static void main(String[] args) {
		int[] Arr = new int[10];
		for(int i = 0; i < Arr.length; i++) {
			Arr[i] = i+1;
		}
		
		System.out.println("Arr : "+Arrays.toString(Arr));

		Q2(Arr);
		System.out.println("Arr 역순정렬 : "+Arrays.toString(Arr));
		
		System.out.println("Arr 요소 총합 : "+Q3(Arr));
	}
}
