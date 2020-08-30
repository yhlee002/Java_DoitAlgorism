package chap03_Search;
/*Q4) 다음과 같이 이진 검색의 과정을 자세히 출력하는 프로그램을 작성하세요.
 * 각 행의 맨 왼쪽에 현재 검색하고 있는 요소의 인덱스를 출력하고, 검색 범위의 
 * 맨 앞 요소에 <-, 맨 끝 요소에 ->, 현재 검색하고 있는 중앙 요소에 +를 출력하세요.
 * 
 *   | 0 1 2 3 4 5 6
 *  ----------------
 *   |<-    +     ->
 *  3|1 2 3 5 6 8 9
 *   |<-+->
 *  1|1 2 3 5 6 8 9
 *  2는 x[1]에 있습니다.
 */
public class p117_Q4 {
	
	public static void search(int[] a, int key) {
		System.out.printf("%4s", "|");
		for(int i = 0; i < a.length; i++) {
			System.out.printf("%4d", i);
		}
		System.out.println();
		
		for(int i = 0; i < 4*a.length + 4 + 2; i++) { // 한 문장 길이 : 25
			System.out.printf("%s", "-");
		}
		System.out.println();
		
		int pl = 0;
		int pr = a.length - 1;
		int pc;
		while(pl <= pr){
			pc  = (pl + pr)/2;
			
			System.out.printf("%4s", "|");
			//'%%'-> '%'출력(%자체를 출력하기 위해선 두번 써야한다.)
			System.out.printf(String.format("   %%%ds%%%ds%%%ds\n", pl*4 + 1, (pc - pl)*4 - 1, (pr - pc)*4), "<-", "+", "->");
			
			System.out.printf("%3d%s", pc, "|");
			for(int i = 0; i < a.length; i++) {
				 System.out.printf("%4d", a[i]);
			}
			System.out.println();
			
			
			
			if(a[pc] == key) {
				System.out.println(key+"는 a["+pc+"]에 있습니다.");
				break;
			}else if(a[pc] < key) {
				pl = pc + 1;
			}else if(a[pc] > key) {
				pr = pc - 1;
			}
			 
		}		
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 5, 6, 8, 9};
		int key = 2;
		
		search(arr, key);
	}
}
