package chap03_Search;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//Q7) 시력에 대한 내림차순 정렬의 신체검사 데이터에서 특정 시력을 가진 사람을 검색하는 프로그램 작성

class PhyscData{ //개인의 정보를 담는 클래스
	
	String name; //이름
	int height; //키
	double vision; //시력
	
	public PhyscData(String name, int height, double vision) { //생성자
		this.name = name; this.height = height; this.vision = vision;
	}
	
	public String toString() { //출력했을때 객체의 정보가 출력되도록 오버라이딩
		return name+"의 키는 "+height+", 시력은 "+vision+"입니다.";
	}
}

class MyComparator implements Comparator<PhyscData>{
	
	@Override
	public int compare(PhyscData o1, PhyscData o2) {
		System.out.println(o1.vision+", "+o2.vision);
		if(o1.vision < o2.vision) //정답의 코드에서는 이와 같이 오름차순 정렬을 작성(이유????)
			return 1;
		else if(o1.vision > o2.vision) 
			return -1; 
		return 0;					
		
	}
	
}	

public class p129_Q7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PhyscData[] arr = {
				new PhyscData("이나령", 162, 0.3),
				new PhyscData("유지훈", 168, 0.4),
				new PhyscData("전서현", 173, 0.7),
				new PhyscData("김한결", 169, 0.8),
				new PhyscData("이호연", 174, 1.2),
				new PhyscData("홍준기", 171, 1.5),
				new PhyscData("이수민", 175, 2.0)
		};
		
		System.out.println("검색할 시력를 입력하세요.");
		double vis = sc.nextDouble();
		
		Comparator<PhyscData> myComps = new MyComparator();
		
		int idx = Arrays.binarySearch(arr, new PhyscData("", 0, vis), myComps);
		System.out.println(idx);
		
		if(idx < 0) { //내림차순으로 변경할 경우 arr[0]인 요소를 찾으면 인덱스인 0이 아닌 -1이들어감
			System.out.println("찾고자하는 요소를 찾지 못했습니다.");
		}else {
			System.out.println("찾고자하는 요소는 arr["+idx+"]에 있습니다.");
			System.out.println("arr[idx] : "+arr[idx]);
		}
		
		sc.close();
	}
}
