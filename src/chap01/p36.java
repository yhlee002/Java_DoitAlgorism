package chap01;

public class p36 {
	public static void main(String[] args) {
		System.out.println("----------- 곱셈표 -----------");
		for(int i = 1; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
//				System.out.print(j*i+" ");
				System.out.printf("%3d", j*i); 
				//%d(int형 데이터), - : 왼쪽 정렬, + : 오른쪽 정렬
				//ex) -3%d로 사용했다면 왼쪽 정렬됐을 것
			}
			System.out.println();
		}
		
	}
}
