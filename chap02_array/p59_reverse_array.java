package chap02_array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class p59_reverse_array {
	//난수만큼의 크기를 가진 배열을 생성한 뒤 배열을 역순으로 나열하기
	
	public static void reverseArr(int[] intArr) {
		for(int i = 0; i < intArr.length/2; i++) {
			int x;
			x = intArr[i];
			intArr[i] = intArr[intArr.length - (i+1)];
			intArr[intArr.length - (i+1)] = x;
		}
	}
	
	public static void main (String[] args) {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("배열의 크기를 지정해주세요.");
		int N = sc.nextInt();
		
		int[] intArr = new int[N];
		
		for(int i = 0; i < intArr.length; i++) {
			intArr[i] = ran.nextInt(20);
		}
		
		System.out.println(Arrays.toString(intArr));
		
		reverseArr(intArr);
		
		System.out.println(Arrays.toString(intArr));
		
		sc.close();
	}
}
