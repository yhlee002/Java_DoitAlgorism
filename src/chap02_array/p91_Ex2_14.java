package chap02_array;

public class p91_Ex2_14 {
	//내장 클래스(static 메소드인 main에서 참조할 수 있도록 static class로 생성)
	static class PhysData{
		String name;
		int height;
		double vision;
		
		public PhysData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
	}
	
	//평균 키 메소드
	static double avgHeight(PhysData[] datas) {
		double sum = 0.0;
		for(int i = 0; i < datas.length; i++) {
			sum += datas[i].height;
		}
		return sum/datas.length;
	}
	
	//시력 분포 메소드(배열을 20개의 값을 받도록 해서 각 값은 특정 범위의 시력을 가진 사람이 있을때마다 1씩 증가하도록 함)
	static void distVision(PhysData[] datas, int[] dist) { //분포(distribution)
		for(int i = 0; i < datas.length; i++) {
			if(datas[i].vision >= 0.0 && datas[i].vision < 2.1) {
				dist[(int)(datas[i].vision*10)]++;
			}
		}
	}
	
	//실행 메소드
	public static void main(String[] args) {
		//1)PhysData[] datas에 각 사람들의 건강 정보 넣고 출력하기
		PhysData[] datas = {
				new PhysData("박혁규", 162, 0.3),
				new PhysData("함진아", 173, 0.7),
				new PhysData("최윤미", 175, 2.0),
				new PhysData("홍연의", 171, 1.5),
				new PhysData("이수진", 168, 0.4),
				new PhysData("김영준", 174, 1.2),
				new PhysData("박용규", 169, 0.8),
		};
		System.out.println("■    건강 정보   ■");
		System.out.printf("%2s, %4s %4s\n", "이름", "키", "시력");
		for(PhysData phys : datas) {
			System.out.printf("%3s %4d %5.1f\n", phys.name, phys.height, phys.vision);
		}
		System.out.println("=================");
		
		
		
		//2)평균키 메소드 호출하기
		System.out.printf("[평균 키] : %3.1fcm\n",avgHeight(datas));
		//3)시력 분포 메소드를 통해 리턴되는 배열을 특정 변수에 매칭 시키고, 이 변수의 값을 하나씩 열며 printf를 통해 틀에 맞춰출력
		int[] dist = new int[21];
		distVision(datas, dist);
		System.out.println("[시력 분포]");
		for(int i = 0; i < dist.length; i+=3) {
			System.out.printf("%.1f~ : %d\t%.1f~ : %d\t%.1f~ : %d\n", i/10.0, dist[i], (i+1)/10.0, dist[i+1], (i+2)/10.0, dist[i+2]);
		}
		
		
	}
}
