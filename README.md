# Java_DoitAlgorism

<img src="https://user-images.githubusercontent.com/60289743/95406279-fb1fcc00-0954-11eb-8779-6c54be33ffdd.jpg" width="220">

## Chapter 01.Basic
+ 최댓값, 최소값 출력(Q1, Q2, Q3)
+ 중앙값 출력(Q4)
+ 입력된 값의 부호(음수, 0, 양수)를 판단하여 출력(Ex 1-3)
+ 입력받은 값이 n이면 "1+2+...+n = 총합"의 형태로 출력(Q7)
+ 가우스의 덧셈(n부터 m까지의 합은 '(n+m)*((m-n+1)/2)'로 구할 수 있다.) (Q8)
+ 정수 a, b를 포함하여 그 사이의 모든 정수의 합을 구해 반환(Q9)
+ 두 변수 a, b에 정수를 입력하고 b-a를 출력(b <= a일 경우  'a보다 큰 값을 입력하세요!' 반복)(Q10)
+ 양의 정수를 입력하고 자릿수를 출력(Q11)
+ 곱셈표의 위와 왼쪽에 곱하는 수 출력(Q12)
+ 곱셈이 아니라 덧셈을 출력(Q13)
+ 입력한 수를 한 변으로 하는 정사각형을 * 기호로 출력(Q14)
+ 직각 이등변 삼각형을 출력(Q15)
+ n단의 피라미드를 출력(Q16)
+ 아래를 향한 n단의 숫자 피라미드를 출력(Q17)
 
## Chapter 02.Array
+ 사람수와 키를 난수로 설정해 수만큼 키를 출력(Q1)
+ 배열을 역순정렬(Q2)
+ 배열의 요소들의 총합을 출력(Q3)
+ 두 배열 비교(Ex 2-7)
+ 배열 b의 모든 요소를 배열 a에 복사(Q4)
+ 배열 b의 모든 요소를 배열  a에 역순으로 복사(Q5)
+ 수와 기수를 입력하면 해당 수를 해당 기수 형태로 변환하여 배열에 저장(Ex 2-8)
+ 수와 기수를 입력하면 열의 앞쪽에 아랫자리가 아닌 윗자리 저장(=해당 수를 해당 기수 형태로 변환하여 배열에 저장 2)(Q6)
+ 소수 구하기(Ex 2-9)
+ 소수 구하기 2(Ex 2-11)
+ 2차원 배열(Ex 2-12)
+ 해를 입력받고 윤년 판단하기 + 달을 입력받고 지난 일 수 구하기(Ex 2-13)
+ 년/월/일을 입력받아 해당 해의 몇일째 날인지 출력(Q8)
+ 년/월/일을 입력받아 해당 해의 남은 일수 출력
+ 건강정보 출력하기(내장된 데이터 출력) *시력 분포 출력 파트 유의(Ex 2-14)
+ 건강정보 출력하기 2 + 시력 분포를 사람 수만큼 '*'를 출력하여 나타내기(Q10)
+ 서기 년월일을 필드로 갖는 클래스를 만들고 n일 뒤의 날짜와 n일 앞의 날짜를 출력(Q11)

## Chapter 03.Search
+ 요솟수와 값을 입력받은 배열에서 입력받은 key와 같은 요소를 선형 검색(해당 배열에서의 인덱스 출력)(Ex 3-1)
+ 예제 3-1 수정(보초법 사용 cf.보초법 : 배열의 마지막에 찾으려는 값을 '보초'로 넣고, 이에 달하면 종료)(Ex 3-3)
+ 이진 검색(배열이 오름차순으로 정렬된 상태에서 중앙값보다 클 경우 중앙값보다 큰 수의 범위에서 찾고, 보다 작을 경우 중앙값보다 작은 수의 범위에서 탐색(Ex 3-4)
+ 예제 3-3의 탐색 메소드를 while문이 아닌 for문을 사용해 수정(Q1)
+ 선형 검색의 스캐닝 과정을 상세하게 출력(Q2)
+ 요솟수와 값을 입력받은 배열에서 입력받은 key와 일치하는 모든 요소의 인덱스를 배열 idx의 맨 앞부터 순서대로 저장하고, 일치한 요솟수를 반환(Q3)
+ 이진 검색의 과정을 자세히 출력하는 프로그램 작성(Q4)
+ 이진검색을 하되, key와 일치하는 값이 존재하면 처음 일치한 값에서 하나씩 앞으로 가며 확인(Q5)
+ Arrays의 binarySearch 메소드
  > Arrays.binarySearch() : 배열에 대해 키값을 이진 검색하는 메소드   
  > - 사용 예시
  > ``` Java
  > int[] arr = {5, 7, 15, 28, 29, 31, 39, 58, 68, 70};
  > System.out.println("arr = "+Arrays.toString(arr));
  > System.out.println("arr.length : "+arr.length);
  > System.out.println("39를 검색 : "+Arrays.binarySearch(arr, 39));
  > System.out.println("30을 검색 : "+Arrays.binarySearch(arr, 30));
  > System.out.println("95를 검색 : "+Arrays.binarySearch(arr, 95));
  > ```
  > - 실행 결과
  > ```
  > arr = [5, 7, 15, 28, 29, 31, 39, 58, 68, 70]
  > arr.length : 10
  > 39를 검색 : 6
  > 30을 검색 : -6
  > 95를 검색 : -11
  > ```
  > - 검색에 성공한 경우 key와 일치하는 요소의 인덱스를 반환(일치하는 요소가 여러 개일 경우 무작위 인덱스 반환)   
  > - 검색에 실패한 경우 삽입 포인트(검색을 위해 지정한 key보다 큰 요소 중 첫 번째 요소)가 x일때 '-x-1'을 반환   
  > cf. 배열의 모든 요소가 key보다 작을 경우 배열의 길이를 삽입포인트로 정함   
  > (key까지 포함해 오름차순으로 정렬할 경우 key의 인덱스는 배열의 가장 마지막 인덱스+1( = 배열의 길이))
+ 배열의 요솟수와 요소를 입력받아 배열 생성 후 배열에 입력받은 key로 이진 검색 수행(Ex 3-5 변형)
+ 실습 3-5를 수정하여 검색에 실패하면 삽입 포인트의 값을 출력(Q6)
+ 자연 정렬로 정렬된 배열에서 검색하기(Ex 3-6)
  > 자연 정렬 :  요소의 대소 관계를 비교하여 정렬(사람이 느끼기에 '자연스러운 정렬'로 자연수나 정수 배열에 적합)
  > - 자연정렬이 필요한 배열   
  > : static int binarySearch(Object[] a, Object key)를 통해 자연 정렬 방식으로 요소의 대소 비교   
  > - 자연 순서가 아닌 순서로 줄지어 있는 배열 또는 자연 순서를 논리적으로 갖지 않는 배열에서 검색할 때   
  > : static <T> int binarySearch(T[] a, T key, Comparator<? super T> c)   
+ 객체 비교(Comparator 사용)(Ex 3-8)
  > - 데이터를 담는 역할을 하는 PhyscData 클래스 생성, 내부에 Comparator을 구현한 MyComparator 객체 생성   
  > - PhyscData 타입 인스턴스 속의 MyComparator 인스턴스를 Arrays.binarySearch()의 인자로 전달   
  > cf. Arrays.binarySearch(T[] a, T key, Comparator<? super T> c)
  > ``` Java
  > static class PhyscData{
	>   String name;
	>   int height;
	>   double vision;
	>   final static Comparator<PhyscData> comp = new MyComparator();
  >   // ... 생성자, getter, setter 생략
  > }
  > static class MyComparator implements Comparator<PhyscData>{
  > 
	> 	@Override
	> 	public int compare(PhyscData o1, PhyscData o2) {
	> 		if(o1.height > o2.height) {
	> 			return 1;
	> 		}else if(o1.height < o2.height) {
	> 			return -1;
	> 		}else {
	> 			return 0;					
	> 		}
	> 	}
	> }
  > public static void main(String[] args){
  >   // ...
  >   int idx = Arrays.binarySearch(arr, new PhyscData("", height, 0.0), PhyscData.comp);
  >   // ...
  > }
  > ```
+ 시력에 대한 내림차순 정렬의 신체검사 데이터에서 특정 시력을 가진 사람을 검색(Q7)
+ Generic 클래스 인스턴스 생성(Ex 3C-3)

## Chapter 04.Queue
+ 큐 구현(Q4)
	 - 데이터를 꺼내는 쪽 : 프런트(front), 데이터를 넣는 쪽 : 리어(rear)
	 - 리어는 마지막 데이터의 인덱스 + 1
+ 링버퍼로 큐 구현(Ex 4-3)
+ 링버퍼로 큐 구현 2(Ex 4-4)
+ 큐에서 임의의 데이터를 검색, 해당되는 데이터를 찾을 경우 데이터의 큐에서의 순서를 반환(Q5)
+ Generic Queue 생성(Q6)
+ Deque 생성(Q7)
	> Deque["deck", "덱", "데크"]   
	> : 양방향 대기열(deque/double ended queue)으로 시작과 끝 지점에서 양쪽으로 데이터를 인큐/디큐하는 자료구조
+ 링버퍼를 활용한 큐(정수입력은 무한히 가능하나 배열에 저장되는 데이터는 가장 마지막의 n개 데이터)(Ex 4C-1)

## Chapter 05.Recursive
+ 자연수의 팩토리열 구하기(Ex 5-1)
+ 두 정수의 최대공약수(Ex 5-2)
+ 팩토리얼, 최대공약수 프로그램을 비재귀방식으로 구현(Q1, Q2)
+ 배열 모든 요소의 최대공약수(Q3)
+ 상향식/하향식 재귀(Q4)
+ 재귀함수(Ex5-3)의 재귀 제거(Ex 5-5)
+ 재귀함수의 재귀 제거(Q5)
+ 하노이의 탑(Ex5-6) 
+ 하노이의 탑 문제를 문자열로 기둥 이름(A, B, C)이 출력되도록 수정(Q6)
+ 하노이의 탑 문제의 재귀 제거(Q7) - 미작성
+ 8X8 체스판에 각 열에 1개의 퀸 배치(Ex 5-7)
+ 8X8 체스판에 각 열, 행에 1개의 퀸 배치(8룩(Rook)문제)(Ex 5-8)
+ 8퀸 문제(8X8 체스판에 각 열, 행, 대각선으로 서로 공격할 수 없도록 퀸 배치)(Ex 5-9)
+ 8퀸 문제(Ex 5-9)의 print 메소드 수정(Q8)
+ 8퀸 문제를 비재귀적으로 구현(Q9) - 미완

##Chapter 06.Sort
### 버블 정렬(Bubble Sort)
 이웃한 두 요소의 대소 관계를 비교해 교환하기를 반복하여 정렬하는 알고리즘

[특징]
> 1. 멀리 있는 값이 아닌 바로 옆의 값을 비교, 교환하기 때문에 안정적인(stable) 정렬
> 2. 요솟수가 n개인 배열에서의 비교 횟수는 (n-1)*(n-2)*...*1 = (n-1)(n-2)/2
> 3. 크게 n-1번 순회하며 좌측 혹은 우측의 숫자 두개씩 비교하며 교환하는 방식.
>   1. cf. 이 때, 이 순회한 횟수가 k번이라면, k개의 값의 위치가 고정된다.
+ 버블 정렬 프로그램 작성 및 개선(Ex6-1, Ex6-2, Ex6-3)
+ 버블 정렬의 비교, 교환 과정을 자세히 출력하는 프로그램 작성(Q2, Q3, Q4)
+ 양방향 버블 정렬(Q5)
> 양방향 버블 정렬(bidirection bubble sort; cocktail sort, shaker sort)
> 
>  : 홀수 번째 패스에는 가장 작은 요소를 맨 앞으로 옮기고, 짝수 번째 패스에는 가장 큰 수를 맨 뒤로 옮김
> 
> ex) 다음 배열은 홀수 번째의 패스는 가장 작은 요소를 맨 앞으로 옮기고, 짝수 번째 패스는 가장 큰 요소를 맨 뒤로 옮기는 방식을 사용하는 것이 더 적은 횟수로 정렬할 수 있다.
> ``` Java
> int[] arr = {9, 1, 3 , 4, 6, 7, 8}

### 단순 선택 정렬
 가장 작은 요소부터 선택해 알맞은 위치로 옮겨서 순서대로 정렬하는 알고리즘(Ex6-4)
> 1. 아직 정렬하지 않은 부분에서 가장 작은 키의 값을 선택
> 2. 가장 작은 값 요소와 아직 정렬하지 않은 부분의 첫 번째 요소를 교환


### 단순 삽입 정렬
 선택한 요소를 그보다 더 앞쪽의 알맞은 위치에 삽입하는 작업을 반복하여 정렬하는 알고리즘(Ex6-5)
> 정렬되지 않은 부분의 첫 번째 요소를 정렬된 열의 '알맞은 위치에 삽입'하는 작업을 반복
> 이 때 '삽입'이란, 이웃한 요소가 선택한 요소보다 크면 그 값(이웃한 값)을 대입하고 앞으로 인덱스를 이동해나가는 작업을
> 반복하다가 선택한 값보다 작은 요소를 만나면 더 이상 검사할 필요가 없으므로 해당 위치에 선택한 값을 삽입하는 것을 의미


### 셸 정렬
  단순 삽입 정렬의 장점을 이용하고 단점을 보완한 알고리즘(Ex6-6, Ex6-7, Q9)
>cf. 단순 삽입 정렬의 장점 : 정렬을 수행하고자 하는 배열이 이미 정렬을 마쳤거나 마친 상태에 가까울 경우 매우 빠르게 정렬이 완료됨
> 
>cf. 단순 삽입 정렬의 단점 : 이동해야 하는 인덱스와 현재 인덱스의 위치가 많이 떨어져있으면 삽입(이동) 횟수가 많아짐


### 퀵 정렬
  피벗(중앙 인덱스의 값)을 기준으로 그룹을 나누어 좌 우의 인덱스를 교환하는 방식을 반복하여 정렬하는 알고리즘(Ex6-9)
  cf. 코드 개선 과정 : Ex6-8 -> Ex6-9 -> Ex6-10

### 힙 정렬
  부모 노드가 항상 자식 노드들보다 크거나 같은 이진 트리로 정렬하는 방식

##Chapter 10.tree
### 이진 트리(Binary Tree)
  부모 노드가 왼쪽 자식 노드와 오른쪽 자식 노드를 가지며 최대 2개까지의 자식을 가지는 트리 구조(Ex10-1)
  
### 완전 이진 트리(Complete Binary Tree)
  루트부터 노드가 채워져있으면서 같은 레벨에서는 왼쪽에서 오른쪽으로 노드가 채워져있는 트리
