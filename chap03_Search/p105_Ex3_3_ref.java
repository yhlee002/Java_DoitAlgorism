package chap03_Search;

import java.util.Scanner;

//교재의 정답(보다 나은 코드) : 검색 메소드에서 보초값이 검색될 경우 다른 상수가 반환되도록 구현.
public class p105_Ex3_3_ref {
	private static int searchKey(int[] a, int key) {
		int i = 0;
		for(i = 0; i < a.length; i++) {
			if(a[i] == key)
				break; //i값이 해당 인덱스에서 더이상 증가하지 않고 멈춤
		}
		return i == a.length - 1 ? 0 : i; //보초가 검색된 것이면 0을 반환
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("배열의 요솟수를 입력하세요.");
		int n = sc.nextInt();
		
		int[] a = new int[n+1];
		
		System.out.println("Key를 입력하세요.");
		int key = sc.nextInt();
		
		a[n] = key;
		
		for(int i = 0; i < a.length - 1; i++) {
			System.out.println("a["+i+"] : ");
			a[i] = sc.nextInt();
		}
		
		int result = searchKey(a, key);
		
		if(key == 0) 
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println("검색하신 "+key+"는 a["+result+"]에 있습니다.");
		
		
		sc.close();
	}
}
