package chap03_Search;

public class p130_Ex3C_3<T> {
	private T what;
	
	p130_Ex3C_3(T what) {
		this.what = what;
		
	}
	
	T getWhat() {
		return what;
	}
	
	public static void main(String[] args) {
		//다음과 같이 매개변수에 String을 넘길 수도 있고 Integer를 넘길 수도 있다.
		p130_Ex3C_3<String> ex1 = new p130_Ex3C_3<String>("ABC");
		System.out.println("ex1.what : "+ex1.getWhat()); //ABC
		p130_Ex3C_3<Integer> ex2 = new p130_Ex3C_3<Integer>(15);
		System.out.println("ex2.what : "+ex2.getWhat()); //15
	}
}
