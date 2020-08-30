package chap01;

class Cal{
	//p.19 Q.1
	static int max4(int a, int b, int c, int d) {
		int max = a;
		
		max = max < b ? b : max;
		max = max < c ? c : max;
		max = max < d ? d : max;
		
		return max;
	}
	
	//p.19 Q.2
	static int min3(int a, int b, int c) {
		int min = a;
		min = min > b ? b : min;
		min = min > c ? c : min;
		
		return min;
	}
	
	//p.19 Q.3
	static int min4(int a, int b, int c, int d) {
		int min = a;
		min = min > b ? b : min;
		min = min > c ? c : min;
		min = min > d ? d : min;
		
		return min;
	}
}


public class p19 {
	public static void main(String[] args) {
		
		System.out.println(Cal.max4(1, 3, 2, 8));
		System.out.println(Cal.min3(5, 10, 2));
		System.out.println(Cal.min4(30, 23, 7, 15));
		
	}
}
