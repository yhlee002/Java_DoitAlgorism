package chap02_array;
import java.util.Scanner;
public class p60_Ex2_6 {
	//p.60 실습 2-6
	static void swap(int[] a, int x, int y) {
		int t = a[x];
		a[x] = a[y];
		a[y] = t;
	}
	
	public static void reverse(int[] a) {
		for(int i = 0; i < a.length/2; i++) {
			swap(a, i, a.length -1 - i);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("요솟수 : ");
		int num = sc.nextInt();
		
		int[] x = new int[num];
		
		for(int i = 0; i < x.length; i++) {
			System.out.println("x["+i+"] : ");
			x[i] = sc.nextInt();
		}
		
		reverse(x);
		
		System.out.println("요소를 역순으로 정렬했습니다.");
		for(int i = 0; i < num; i++) {
			System.out.println("x["+i+"] : "+x[i]);
		}
		sc.close();
	}
}
