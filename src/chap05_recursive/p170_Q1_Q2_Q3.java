package chap05_recursive;

public class p170_Q1_Q2_Q3 {
	//Q1)재귀 메소드 호출을 사용하지 않고 실습 5-1의 factorial메소드 작성
	static int Q1_factorial(int x) {
		int fac = 1;
		int i = 0;
		do {
				fac *= (x - i);
				i++;
		}while(i != x);
		
		return fac;
	}
	
	//Q2) 재귀 메소드 호출을 사용하지 않고 실습 5-2의 gcd메소드 작성
	static int Q2_gcd(int x, int y) {
		if(x < y) {
			int t = x; x = y; y = t;
		}
		int a = 0;
		do {
			a = x;
			x = y;
			y = a % y;
		}while(y != 0);
		
		return x;
	}
	
	//Q3) 배열 a의 모든 요소의 최대공약수를 구하는 메소드 작성(static int gcdArray(int[] a)
	public static int Q3_gcdArray(int[] arr, int start, int num) {
		if(num == 1)
			return arr[start];
		else if(num == 2) 
			return Q2_gcd(arr[start], arr[start+1]);
		else
			return Q2_gcd(arr[start], Q3_gcdArray(arr, start+1, num - 1));
		//첫번째 요소와 두번째 요소~ 마지막 요소 간의 최대공약수 둘 간의 최대공약수
	}
	
	public static void main(String[] args) {
		
		System.out.println(Q1_factorial(6)); //720
		System.out.println(Q1_factorial(5)); //120
		System.out.println(Q1_factorial(12)); //479001600
		
		System.out.println(Q2_gcd(12, 30)); //6
		System.out.println(Q2_gcd(12, 40)); //4
		
		int[] arr1 = {16, 12, 36, 20, 40}; //4
		int[] arr2 = {54, 36, 27}; //9
		System.out.println("arr1 요소들의 최대공약수 : "+Q3_gcdArray(arr1, 0, arr1.length));
		System.out.println("arr2 요소들의 최대공약수 : "+Q3_gcdArray(arr2, 0, arr2.length));
	}
}
