package chap02_array;

import java.util.Arrays;

//실습 2-11) 소수 구하기 2
public class p78_Ex2_11 {
	
	static void Ex2_11() {
		int count = 0;
		int n = 0;
		int[] arr = new int[500];
		arr[n++] = 2; //arr[0] = 2
		arr[n++] = 3; //arr[1] = 3
		
		for(int i = 5; i <=1000; i += 2) {
			boolean flag = false;
			for(int j = 1; Math.pow(arr[j], 2) <= i; j++) {//for문 시작시 n의 값은 2			
				
				count += 2;
				
				if(i % arr[j] == 0) {
					flag = true;
					break;
				}
			}
			if(!flag) {
				arr[n++] = i;
				count++;
			}
		}
		System.out.println("[Ex2_11] 반복 횟수 : "+count);
		System.out.println("[Ex2_11] 소수의 개수 : "+(n)); //소수의 수 : 원래는 '인덱스 + 1'이나, 후위증가인 n이 1 증가된 채로 끝나므로 1을 더해주지 않음
		System.out.println("[Ex2_11] 배열의 원소 : "+Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		Ex2_11();
	}
}
