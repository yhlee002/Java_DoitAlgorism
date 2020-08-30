package chap02_array;

//Q11)서기 년월일을 필드로 갖는 클래스를 만들고 다음과 같이 생성자와 메서드를 정의하세요.
/*
 * 생성자(주어진 날짜로 설정)
 * constructor(int y, int m, int d)
 * n일 뒤의 날짜를 반환하는 메소드
 * method1(int n)
 * n일 앞의 날짜를 반환
 * method2(int n)
 */
public class p93_Q11 {
	int y;
	int m;
	int d;
	
	int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public p93_Q11(int y, int m, int d) {
		this.y = y;
		this.m = m;
		this.d = d;
	}
	
	public String afterN(int n) {
		int afterD = d + n;
		if(afterD >= days[m-1]) {
			m += 1;
			afterD -= days[m-1];
			if(m >= days.length) {
				y += 1;
			}
		}
		return n+"일 뒤의 날짜는 "+y+"년 "+m+"월 "+afterD+"일 입니다.";
	}
	
	public String beforeN(int n) {
		int beforeD = d - n;
		if(beforeD <= 0) {
			m -= 1;
			beforeD += days[m-2];
			if(m <= 0) {
				y -= 1;
			}
		}
		return n+"일 전의 날짜는 "+y+"년 "+m+"월 "+beforeD+"일 입니다.";
	}
	
	public static void main(String[] args) {
		p93_Q11 Qday = new p93_Q11(2020, 4, 19);
		System.out.println(Qday.afterN(5));
		System.out.println(Qday.beforeN(10));
	}
}
