package chap03_Search;

/* Q2)다음과 같이 선형 검색의 스캐닝 과정을 상세하게 출력하는 프로그램을 작성하세요. 이때 각 행의 
 * 맨 왼쪽에 현재 검색하는 요소의 인덱스를 출력하고, 현재 검색하고 있는 요소 위에 별표 기호 '*'를 출력하세요.
 * 
 *   | 0 1 2 3 4 5 6
 * --+---------------
 *  | *
 * 0| 6 4 3 2 1 9 8
 *  |   *
 * 1| 6 4 3 2 1 9 8
 *  |     *
 * 2| 6 4 3 2 1 9 8
 * 3은 x[2]에 있습니다.
 * (위 : %2s씩 인덱스, 왼쪽 : 2줄에 한번씩 '인덱스+행'과 '* 이동(space bar 2칸씩)' 작성
 */
public class p115_Q2 {
	private static void scan(int[] arr, int key) {
		int i = 0;
		String str = "";
		System.out.printf("%3s", "|");
		for(i = 0; i < 7; i++) {
			System.out.printf("%2d", i);
		}
		System.out.println();
		for(i = 0; i < 17; i++) {
			System.out.printf("%s", "-");
		}
		System.out.println();
		i = 0;
		while(i < 7) {
			
			System.out.print("  |");
			System.out.print(str+"*\n");
			str += "  ";
			System.out.print(i+" |");
			for(int j = 0; j < arr.length; j++) {
				System.out.print(arr[j]+" ");
			}
			System.out.println();
			if(arr[i] == key) {
				System.out.println(key+"는 a["+i+"]에 있습니다.");
				break;
			}
			i++;
		}
		
	}
	
	
	public static void main(String[] args) {
		int[] arr = {6, 4, 3, 2, 1, 9, 8};
		int key = 3;
		scan(arr, key);
		
	}
}
