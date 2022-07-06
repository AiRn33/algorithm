package algorithmStudy_0706;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class TWO_EX3_8 {

	// VO 클래스
	static class PhyscData{
		private String name;
		private int height;
		private double vision;
		
		// 생성자
		public PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
		
		// 문자열 반환 메서드 ToString
		public String toString() {
			return name + " " + height + " " + vision;	 
	 	}
		
		public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();
		
		private static class HeightOrderComparator implements Comparator<PhyscData>{
			public int compare(PhyscData d1, PhyscData d2) {
				return (d1.height > d2.height) ? 1 : 
						(d1.height < d2.height) ? -1 : 0;
			}
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		PhyscData x[] = {
			new PhyscData("김상복", 162, 0.3),
			new PhyscData("유지훈", 173, 0.5),
			new PhyscData("김한결", 169, 1.5),
			new PhyscData("전서현", 175, 0.8),
			new PhyscData("황성윤", 172, 1.8),
			new PhyscData("이지수", 151, 1.3),
		};
		
		System.out.println("몇 cm인 사람을 찾고 있나요?");
		int height = sc.nextInt();
		int idx = Arrays.binarySearch(
				x, 
				new PhyscData("",height,0.0), 
				PhyscData.HEIGHT_ORDER
			);
		
		if(idx < 0) {
			System.out.println("요소가 없습니다");
		}else {
			System.out.println("x[" + idx + "]에 있습니다");
			System.out.println("찾은 데이터 : " + x[idx]);
		}
	}
}
