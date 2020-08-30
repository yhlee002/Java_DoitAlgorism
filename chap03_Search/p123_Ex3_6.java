package chap03_Search;

import java.util.Arrays;
import java.util.Scanner;

/*실습 3-6) 자연 정렬로 정렬된 배열에서 검색하기
 * 자연 정렬 :  요소의 대소 관계를 비교하여 정렬(사람이 느끼기에 '자연스러운 정렬'로 자연수나 정수 배열에 적합)
 * 	ex) {텍스트1, 텍스트2, 텍스트3, 텍스트10, 텍스트200}
 * cf.문자열 정렬
 * 	ex) {텍스트1, 텍스트10, 텍스트2, 텍스트200, 텍스트3}
 * 
 * 자연정렬이 필요한 배열 : static int binaySearch(Object[] a, Object key)를 통해 자연 정렬이라는 방법으로 요소의 대소 비교
 * 자연 순서가 아닌 순서로 줄지어 있는 배열 또는 자연 순서를 논리적으로 갖지 않는 배열에서 검색할 때
 *  : static <T> int binarySearch(T[] a, T key, Comparator<? super T> c)
 * 
 */

public class p123_Ex3_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] x = {
				"abstract", "assert",
				"boolean", "break", "byte",
				"case", "catch", "char"
				//...이하 생략
		};
		System.out.println("원하는 키워드를 입력하세요.");
		String key = sc.next();
		
		int result = Arrays.binarySearch(x, key);
		
		if(result < 0) {
			System.out.println("찾으시는 키워드를 찾을 수 없습니다.(삽입 포인트 : "+-(result+1)+")");
		}else {
			System.out.println("찾으시는 키워드는 x["+result+"]에 있습니다.");
		}
		sc.close();
	}
}
