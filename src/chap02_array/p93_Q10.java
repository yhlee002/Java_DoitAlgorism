package chap02_array;

//Q10)시력 분포를 사람 수 만큼 *를 반복하여 나타내세요.
public class p93_Q10 extends p91_Ex2_14{
	static void distVision(PhysData[] datas, int[] dist) {
		for(int i = 0; i < datas.length; i++) {
			if(datas[i].vision >= 0.0 && datas[i].vision < 2.1) {
				dist[(int)(datas[i].vision*10)]++;
			}
		}
	}
	
	public static void main(String[] args) {
		PhysData[] datas = {
				new PhysData("박혁규", 162, 0.3),
				new PhysData("함진아", 173, 0.7),
				new PhysData("최윤미", 175, 2.0),
				new PhysData("홍연의", 171, 1.5),
				new PhysData("이수진", 168, 0.4), 
				new PhysData("김영준", 174, 1.2),
				new PhysData("박용규", 169, 0.8),
		};
		System.out.println("■    건강 정보    ■");
		System.out.printf("%3s %4s %4s","이름", "키", "시력\n");
		for(PhysData phys : datas) {
			System.out.printf("%3s %4d %5.1f\n",phys.name, phys.height, phys.vision);
		}
		System.out.println("==================");
		System.out.printf("[평균키] : %3.1fcm\n",avgHeight(datas));
		System.out.println("[시력 분포]");
		
		int[] dist = new int[21];
		distVision(datas, dist);

		for(int i = 0; i < dist.length; i++) {
			System.out.print(i/10.0 +" ~ : ");
			for(int j = 0; j < dist[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
