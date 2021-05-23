package chap03_Search;

// 예제 3C-2) 자연 정렬이 가능한 클래스의 기본 형태

/**
 * 객체 배열에서의 이진 검색
 * 이진 검색이 가능하게 하기 위해선 자연 정렬이 가능한 경우와 자연 정렬이 불가능한 경우로 나눌 수 있음
 * <p>
 * 1) 자연 정렬로 정렬된 경우, 자연 정렬이 가능한 경우(int, long, String 등)
 * [검색] Array 클래스의 static int binarySearch(Object[] a, Object key)
 * Cf. Comparable<T> 인터페이스 구현해야함 - compareTo(T t1, T t2), equals(Object o) 메소드 오버라이딩 필요
 * <p>
 * 2) 자연 순서가 아닌 순서로 줄지어 있는 배열 혹은 자연 순서를 논리적으로 갖지 않는 클래스 배열의 경우
 * [검색] Array 클래스의 static <T> int binarySearch(T[] a, T key, Comparator<? super T> comparator)
 * Cf. comparator 객체를 직접 구현하기를 위해서는 Comparator<T> 인터페이스를 구현한 클래스를 정의하고 이 클래스의 객체 생성 필요
 * Cf. Comparator<T> 인터페이스를 구현한 클래스에는 compare(T t1, T t2) 메소드 구현 필요
 */
public class p125_Ex3C_2 implements Comparable<p125_Ex3C_2> {

    int n;

    @Override
    public int compareTo(p125_Ex3C_2 o) { // compareTo()을 통해 같은 타입끼리 비교할 때 비교할 속성(필드) 지정해야함
        if (this.n > o.n)
            return 1;
        else if (this.n < o.n)
            return -1;
        else
            return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        else
            return false;
    }

}
