package chap02_array;

import java.util.Arrays;

public class p64_Q4_Q5 {
	
	//Q4) 배열 b의 모든 요소를 배열 a에 복사하는 메소드 copy를 작성하세요.
	static void Q4(int[] a, int[] b) {
		for(int i = 0; i < b.length; i++) {
			a[i] = b[i];
		}
	}
	
	//Q5) 배열 b의 모든 요소를 배열  a에 역순으로 복사하는 메소드를 작성하세요.
	static void Q5(int[] a, int[] b) {
		for(int i = 0; i < b.length/2; i++) {
			int x = b[i];
			b[i] = b[b.length -i -1];
			b[b.length -i - 1] = x;
		}
		for(int i = 0; i < b.length; i++) {
			a[i] = b[i];
		}
	}
	
	public static void main(String[] args) {
		int[] arr1 = new int[5];
		int[] arr2 = new int[] {1, 2, 3, 4, 5};
		
		System.out.println("arr1 : "+Arrays.toString(arr1));
		System.out.println("arr2 : "+Arrays.toString(arr2));
		
		Q4(arr1, arr2);
		
		System.out.println("arr2를 arr1에 복제 후 arr1 : "+Arrays.toString(arr1));
		System.out.println("arr2를 arr1에 복제 후 arr2 : "+Arrays.toString(arr2));

		Q5(arr1, arr2);
		
		System.out.println("arr2를 역순으로 arr1에 대입 후 arr1 : "+Arrays.toString(arr1));
		System.out.println("arr2를 역순으로 arr1에 대입 후 arr2 : "+Arrays.toString(arr2));

	}
}
