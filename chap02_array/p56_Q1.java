package chap02_array;

import java.util.Arrays;
import java.util.Random;

//Q1) 실습 2-5 수정(키뿐만 아니라 사람의 수도 난수로 설정하기)
public class p56_Q1 {
	
	public static int getMax(int[] a) {
		int max = a[0];
		for(int i = 1; i < a.length; i++) {
			if(max < a[i]) {
				max = a[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		Random ran = new Random();
		int personN = ran.nextInt(11); //임의로 정한 제한값
		
		int[] tallArr = new int[personN];
		for(int i = 0; i < tallArr.length; i++) {
			tallArr[i] = 100 + ran.nextInt(91);
		}
		
		System.out.println(Arrays.toString(tallArr));
		System.out.println(getMax(tallArr));
		
	}
}
