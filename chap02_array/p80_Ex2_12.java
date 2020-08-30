package chap02_array;

//실습 2-12) 2차원 배열 (원소 출력부분 자체 수정)
public class p80_Ex2_12 {
	public static void main(String[] args) {
		int[][] x = new int[2][4];
		x[0][1] = 37;
		x[0][3] = 54;
		x[1][2] = 65;
		
		/*
		 * 0 37 0 54
		 * 0 0 65 0
		 */
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 4; j++) {
					System.out.printf("%4d", x[i][j]);
			}
			System.out.println();
		}
	}
}
