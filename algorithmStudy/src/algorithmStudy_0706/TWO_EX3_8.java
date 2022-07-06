package algorithmStudy_0706;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class TWO_EX3_8 {

	// VO Ŭ����
	static class PhyscData{
		private String name;
		private int height;
		private double vision;
		
		// ������
		public PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
		
		// ���ڿ� ��ȯ �޼��� ToString
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
			new PhyscData("���", 162, 0.3),
			new PhyscData("������", 173, 0.5),
			new PhyscData("���Ѱ�", 169, 1.5),
			new PhyscData("������", 175, 0.8),
			new PhyscData("Ȳ����", 172, 1.8),
			new PhyscData("������", 151, 1.3),
		};
		
		System.out.println("�� cm�� ����� ã�� �ֳ���?");
		int height = sc.nextInt();
		int idx = Arrays.binarySearch(
				x, 
				new PhyscData("",height,0.0), 
				PhyscData.HEIGHT_ORDER
			);
		
		if(idx < 0) {
			System.out.println("��Ұ� �����ϴ�");
		}else {
			System.out.println("x[" + idx + "]�� �ֽ��ϴ�");
			System.out.println("ã�� ������ : " + x[idx]);
		}
	}
}