package chap03_Search;

import java.util.Arrays;
import java.util.Scanner;

//실습 3-5 변형)배열의 요솟수와 요소를 입력받아 배열 생성 후 배열에 입력받은 key로 이진 검색 수행
//p121의 Q6
public class p120_Ex3_5_Q6 {
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
//		Q6)실습 3-5를 수정하여 검색에 실패하면 삽입 포인트의 값을 출력하는 프로그램 작성
		if(result < 0) {
			System.out.println("입력하신 값을 찾지 못했습니다.(삽입 포인트 : "+-(result+1)+")");
		}else {
			System.out.println(key+"는 a["+result+"]에 있습니다.");
		}
		sc.close();
	}
}
