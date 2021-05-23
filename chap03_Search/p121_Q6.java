package chap03_Search;

import java.util.Arrays;
import java.util.Scanner;

//Q6)실습 3-5를 수정하여 검색에 실패하면 삽입 포인트의 값을 출력하는 프로그램 작성(실습 3-5 변형)
public class p121_Q6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("배열의 요솟수를 입력하세요.");
		int[] arr = new int[sc.nextInt()];
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr["+i+"] : ");
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("검색할 값(key)을 입력하세요.");
		int key = sc.nextInt();
		
		System.out.println("[binarySearch 결과]");
		int result = Arrays.binarySearch(arr, key);
//
		if(result < 0) {
			System.out.println("입력하신 값을 찾지 못했습니다.(삽입 포인트(인덱스) : "+-(result+1)+")");
			// binarySearch가 반환한 값 -> x = -(idx+1)
			// idx(삽입 인덱스) = -x-1
		}else {
			System.out.println(key+"는 a["+result+"]에 있습니다.");
		}
		sc.close();
	}
}
