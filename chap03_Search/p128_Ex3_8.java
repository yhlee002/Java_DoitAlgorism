package chap03_Search;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class p128_Ex3_8 {
	
	//이름, 키, 시력을 담는 클래스 생성 - 생성자로 정보들을 받아 객체를 생성할 수 있고, 내부에 comparator 클래스 생성
	private static class PhyscData{
		String name;
		int height;
		double vision;
		final static Comparator<PhyscData> comp = new MyComparator();
		
		public PhyscData(String name, int height, double vision){
			this.name = name; this.height = height; this.vision = vision;
		}
		
		public String toString() {
			return name+"의 키는 "+height+", 시력은 "+vision+"입니다.";
		}
	}
	
	private static class MyComparator implements Comparator<PhyscData>{

		@Override
		public int compare(PhyscData o1, PhyscData o2) {
			if(o1.height > o2.height) {
				return 1;
			}else if(o1.height < o2.height) {
				return -1;
			}else {
				return 0;					
			}
		}
		
	}	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PhyscData[] arr = {
				new PhyscData("이나령", 162, 0.3),
				new PhyscData("유지훈", 168, 0.4),
				new PhyscData("김한결", 169, 0.8),
				new PhyscData("홍준기", 171, 1.5),
				new PhyscData("전서현", 173, 0.7),
				new PhyscData("이호연", 174, 1.2),
				new PhyscData("이수민", 175, 2.0),
		};
		
		System.out.println("검색할 키를 입력하세요.");
		int height = sc.nextInt();
		
		int idx = Arrays.binarySearch(arr, new PhyscData("", height, 0.0), PhyscData.comp);
		
		if(idx < 0) {
			System.out.println("찾고자하는 요소를 찾지 못했습니다.");
		}else {
			System.out.println("찾고자하는 요소는 arr["+idx+"]에 있습니다.");
			System.out.println("arr[idx] : "+arr[idx]);
		}
		
		sc.close();
	}
}
