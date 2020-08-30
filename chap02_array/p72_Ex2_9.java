package chap02_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//실습 2-9) 소수 구하기
//소수 : 1과 자기 자신 이외의 다른 정수로는 나누어떨어지지 않는 수
public class p72_Ex2_9 {
	
	static void Ex2_9() {
		int count = 0; //연산 수
		int i;
		int j;
		int sosuN = 0;
		
		for(i = 2; i <= 1000; i++) { //1~1000사이의 소수를 모두 출력하려고 한다.
			for(j = 2; j < i; j++) { //1~1000사이의 수를 나눈 값들(소수의 정의 참고)
				count++;
				
				if(i % j == 0) {
					break;
				}
			}
			if(j == i) { //내부 for문의 마지막까지 실행된 경우(i가 다른 정수로 나눠지지 않는 경우) 마지막까지 실행된 j는 후위연산자에 의해 i와 값이 같아지며 for문 탈출
				System.out.println(i);
				sosuN++;
			}	
		}
		System.out.println("[Ex2_9] 반복 횟수 : "+count);
		System.out.println("[Ex2_9] 소수의 개수 : "+sosuN);
	}
	
	//배열에 들어있는 자신보다 작은 소수로 나누어 나누어 떨어지지 않으면 소수임을 판단하는 프로그램
	static void Ex2_9_Ref01() {
		int n, i = 2;
		int count = 0; // Ex2_9를 수정하기 전 코드와 연산되는 수에서 차이가 있는지 보기 위한 변수
		
		
		int[] prime = new int[500]; //ArrayList로도 변경해보기
		int ptr = 0; //소수들을 담는 배열의 인덱스(후위 증가)
		prime[ptr++] = 2; //가장 작은 소수(첫 소수)
		
		//시작 : 배열의 인덱스 0 은 '2' - 3부터 판단
		for(n = 3; n <= 1000; n += 2) { //i는 3으로 시작해서 홀수만!(2로 나눌 필요 없음. 다만 배열에는 2가 들어가야 하므로 첫번째 원소로 2를 넣음)
			for(i = 1; i < ptr; i++) {
				count++;
				
				if(n % prime[i] == 0) {
					break;
				}
			}
			//배열의 원소들로 나누어떨어지지 않는 경우
			if(i == ptr) {
				prime[ptr] = n;
				ptr++;
			}
			
		}
		System.out.println("[Ex2_9_Ref01] 반복 횟수 : "+count);
		System.out.println("[Ex2_9_Ref01] 소수의 개수 : "+ptr);
		System.out.print("[Ex2_9_Ref01] 소수 배열의 원소 : ");
		System.out.println(Arrays.toString(prime));
	}
	
	//배열이 아닌 arrayList에 담기
	static void Ex2_9_Ref02() {
		int count = 0;
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(2);
		for(int n = 3; n <= 1000; n += 2) {
			int i;
			for(i = 1; i < arr.size(); i++) { //ArrayList의 사이즈가 1일때(실제 들어간 원소의 수가 1일때) 인덱스는 0(즉, 1 작음)
				count++;
				if(n % arr.get(i) == 0) {
					break;
				}
			}
			if(i == arr.size()) {
				arr.add(n);
			}
		}
		System.out.println("[Ex2_9_Ref02] 반복횟수 : "+count);
		System.out.println("[Ex2_9_Ref02] 소수의 개수 : "+arr.size());
		System.out.println("[Ex2_9_Ref02] arrayList의 원소 : "+arr);
	}
	//Integer에서 int형으로 바꿔 출력해야할때는 int형으로 값을 뺴오는 메소드 사용할 것.
	
	//입력 받은 수가 소수인지 판단하는 프로그램
	static void Ex2_9Inp(int num) {
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				System.out.println("입력하신 수 ("+num+")는 소수가 아닙니다.");
				break;
			}
		}
		System.out.println("입력하신 수 ("+num+")는 소수입니다.");
	}
	
	//실행 메소드
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Ex2_9();
		Ex2_9_Ref01();
		Ex2_9_Ref02();
		
		System.out.println("소수인지 판단할 수를 입력해주세요.");
		int num = sc.nextInt();
		Ex2_9Inp(num);
		
		sc.close();
	}	
}
