package chap03_Search;

import java.util.Arrays;
import java.util.Scanner;

//선형 검색 : 배열에서 유일하게 순서대로 검색하는 방법
//실습 3-1)요솟수가 n인 배열 a에서 key와 같은 요소를 선형 검색하는 프로그램 작성
public class p102_Ex3_1 {

	//배열 a, key를 매개변수로 받아 a내에서 key와 같은 값을 찾고 그 값의 인덱스를 리턴.(없을 경우 다른 상수)
	static int searchKey(int[] a, int key) {
		
		//p103 실습 3-2로 일부 수정한 부분(while문 대신 for문을 이용해 보다 간단히 구현)
		for(int i = 0; i < a.length; i++) {
			if(a[i] == key)
				return i;
		}
		return 0;
		
//		int i = 0;
//		while(true) {
//			if(i == a.length) { //i가 증가하여 a의 인덱스를 벗어나는 것을 방지.
//				return 0;
//			}
//			if(a[i] == key) {
//				return i;
//			}
//			i++;
//		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("배열의 요솟수를 입력하세요.");
		int n = sc.nextInt();
		
		int[] a = new int[n];
		
		for(int i = 0; i < a.length; i++) {
			System.out.println("a["+i+"]의 값을 입력하세요.");
			a[i] = sc.nextInt();
		}
		System.out.println("배열 a : "+Arrays.toString(a));
		
		System.out.println("Key를 입력하세요.");
		int key = sc.nextInt();
		
		//배열 a에서 key를 검색하는 프로그램 호출
		int result = searchKey(a, key); //한번만 실행되도록.
		if(result != 0) {
			System.out.println("key인 "+key+"를 통해 검색한 결과, a["+result+"]에서 해당 값을 찾을 수 있습니다.");
		}else {
			System.out.println("배열 a에서는 해당 key를 찾을 수 없습니다.");
		}
		
		sc.close();
	}

}
