package chap03_Search;

import java.util.ArrayList;
import java.util.Scanner;

//Q5) 이진검색을 하되, key와 일치하는 값이 존재하면 처음 일치한 값에서 하나씩 앞으로 가며 확인 
public class p117_Q5 {
	public static ArrayList<Integer> search(int[] arr, ArrayList<Integer> result, int key) {
		int pl = 0;
		int pr = arr.length - 1;
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		while(pl <= pr) {
			int pc = (pl+pr)/2;
			
			if(arr[pc] == key) {
				int i;
				a.add(pc);
				for(i = pc-1; i >= 0; i--) {
					if(arr[i] == key) {
						a.add(i);
					}
				}
				return a;
			}else if(arr[pc] < key) {
				pl = pc + 1;
			}else {
				pr = pc - 1;
			}
			
		}
		return null;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {1, 6, 3, 5, 6, 8, 9}; //오름차순으로 정렬되어있기 때문에 따로 Arrays.sort()사용하지 않는 것.
		System.out.println("찾으려는 key를 입력하세요.");
		int key = sc.nextInt();
		
		ArrayList<Integer> result = search(arr, new ArrayList<Integer>(), key);
		if(result != null) {
			
			System.out.println("key는 a의 인덱스"+result+"에 있습니다.");
		}else {
			System.out.println("찾으시는 값이 배열에 존재하지 않습니다.");
		}
		sc.close();
	}
}
