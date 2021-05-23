package chap03_Search;

import java.util.Scanner;

/*Q3) 요솟수가 n인 배열 a에서 key와 일치하는 모든 요소의 인덱스를 배열 idx의 
 * 맨 앞부터 순서대로 저장하고, 일치한 요솟수를 반환하는 메소드를 작성하세요. 
 * ex) 요솟수가 8인 배열 a의 요소가 {1, 9, 2, 9, 4, 6, 7, 9}이고, key가 9면 
 * 배열 idx에 {1, 3, 7}을 저장하고 3을 반환합니다.
 * static searchIdx(int[] a, int n, int key, int[] idx)
 */
public class p117_Q3 {
	private static int search(int[] a, int n, int key, int[] idx) {
		int j = 0;
		int cnt = 0;
		
		for(int i = 0; i < n; i++) {
			if(a[i] == key) {
				idx[j++] = i;
				cnt++;
			}
		}
		return cnt; //return j로도 가능할듯
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("배열의 요솟수를 입력하세요.");
		int n = sc.nextInt();
		
		int[] a = new int[n];
		int[] idx = new int[50];
		
		System.out.println("key를 입력하세요.");
		int key = sc.nextInt();
		
		for(int i = 0; i < a.length; i++) {
			System.out.println("a["+i+"] : ");
			a[i] = sc.nextInt();
		}
		
		System.out.println("일치한 요솟수 : "+search(a, n, key, idx));
		
		sc.close();
	}
}
