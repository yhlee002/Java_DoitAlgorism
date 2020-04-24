package chap03_Search;

import java.util.Scanner;

// Q1)실습 3-3의 search 메소드를 while문이 아닌 for문을 사용해 수정한 프로그램을 작성하세요.(p105_ref.java의 내용과 동일)
public class p115_Q1 {
	static int searchKey(int[] arr, int key) {
		int i ;
		for(i = 0; i < arr.length; i++) {
			if(arr[i] == key) { //a[i] == key 여도, i가 보초가 있는 인덱스라면 
				break;
			}
		}
		return i == arr.length - 1 ? 0 : i;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("배열의 요솟값 : ");
		int n = sc.nextInt();
		
		int[] arr = new int[n+1];
		
		for(int i = 0; i < arr.length - 1; i++) {
			System.out.println("arr["+i+"] : ");
			arr[i] = sc.nextInt();
		}
		
		System.out.println("검색할 key를 입력하세요.");
		int key = sc.nextInt();
		
		arr[n] = key;
		
		int result = searchKey(arr, key);
		
		if(result == 0) {
			System.out.println("검색결과X");
		}else {
			System.out.println("검색 결과 : a["+result+"]에 존재.");
		}
		sc.close();
	}
}
