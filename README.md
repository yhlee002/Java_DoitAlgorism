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
