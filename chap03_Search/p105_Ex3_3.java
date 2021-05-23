package chap03_Search;

import java.util.Scanner;

//실습 3-3) p102의 실습 3-1 수정(보초법 : 배열의 마지막에 찾으려는 값을 '보초'로 넣고, 이에 달하면 종료)
public class p105_Ex3_3 {
	private static int searchKey(int[] a, int key) {
		for(int i = 0; i < a.length; i++) {
			if(a[i] == key)
				return i;
		}
		return 0; //의미 없음. 어차피 보초에서 검색될 것.
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("배열의 요솟수를 입력하세요.");
		int n = sc.nextInt();
		
		int[] a = new int [n+1];
		
		System.out.println("Key를 입력하세요.");
		int key = sc.nextInt();
		
		a[n] = key;
		
		for(int i = 0; i < a.length - 1; i++) { //a[a.length - 1]에는 보초가 들어가있기 때문.
			System.out.println("a["+i+"] : ");
			a[i] = sc.nextInt();
		}
		
		int result = searchKey(a, key);
		if(result == a.length-1)
			System.out.println("검색 결과를 찾을 수 없습니다.");
		else
			System.out.println("검색 결과, a["+result+"]에서 해당 값을 찾을 수 있습니다.");
		
		
		//입력받은 요솟수보다 1 큰 배열을 생성, 이후 searchKey메소드에서 리터되는 값이 배열.length-1(입력력값+1-1된 값)일 경우 '찾지 못함' 메시지
		sc.close();
	}
}
