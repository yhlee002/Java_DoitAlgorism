package chap03_Search;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 실습 3-4 )
 * 이진 검색(시작점 : pl, 종료시점 : pr(= n - 1), 중간값 : pc오름차순으로 입력하지 않으면(앞에 입력한 요소보다 작은 수를 입력하면)
 *  다시 입력하게끔 하는 기능을 없애고 입력한 뒤 자동으로 오름차순으로 정렬되도록 작성한 상태(sort사용)
 */

public class p111_Ex3_4{
	static int search(int[] arr, int key) {
		int n = arr.length;
		int pl = 0;
		int pr = n - 1;
		int pc;
		do {
			pc = (pr + pl)/2;
			
			if(key == arr[pc]) {
				return pc;
			}else if(key > arr[pc]) {
				pl = pc + 1;
				
			}else if(key < arr[pc]) {
				pr = arr[pc - 1];
			}
		}while(pl <= pr);
		
		return 0;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//배열 요솟수 입력받기
		System.out.println("배열의 요솟수를 입력하세요.");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		//배열 요소 입력받기
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr["+i+"] : ");
			arr[i] = sc.nextInt();
		}
		//배열 요소들을 오름차순으로 정렬하기
		Arrays.sort(arr);
		//배열 요소 확인용 출력문
		System.out.println(Arrays.toString(arr));
		
		//key입력받기
		System.out.println("검색할 key를 입력하세요.");
		int key = sc.nextInt();
		
		//검색 메소드 호출
		int searchResult = search(arr, key);
		if(searchResult == 0) {
			System.out.println("검색 결과가 존재하지 않습니다.");
		}else {
			System.out.println("검색 결과, key는 a["+searchResult+"]에 위치합니다.");
		}
		
		sc.close();
	}
}
