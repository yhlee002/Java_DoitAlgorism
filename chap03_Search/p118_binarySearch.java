package chap03_Search;

import java.util.Arrays;

/*
 * Arrays.binarySearch() : 배열에 대해 키값을 이진 검색하는 메소드
 * 검색에 성공한 경우 key와 일치하는 요소의 인덱스를 반환(일치하는 요소가 여러 개일 경우 무작위 인덱스 반환)
 * 검색에 실패한 경우 삽입 포인트(검색을 위해 지정한 key보다 큰 요소 중 첫 번째 요소)가 x일때 '-x-1'을 반환
 * cf. 배열의 모든 요소가 key보다 작을 경우 배열의 길이를 삽입포인트로 정함
 * (key까지 포함해 오름차순으로 정렬할 경우 key의 인덱스는 배열의 가장 마지막 인덱스+1( = 배열의 길이))
 */
public class p118_binarySearch {
	public static void main(String[] args) {
		//예시(p.119 - 120)
		int[] arr = {5, 7, 15, 28, 29, 31, 39, 58, 68, 70};
		System.out.println("arr = "+Arrays.toString(arr));
		System.out.println("arr.length : "+arr.length);
		System.out.println("39를 검색 : "+Arrays.binarySearch(arr, 39));
		System.out.println("30을 검색 : "+Arrays.binarySearch(arr, 30));
		System.out.println("95를 검색 : "+Arrays.binarySearch(arr, 95));
	}
}
