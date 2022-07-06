package algorithmStudy_0705;

import java.util.Scanner;

import algorithmStudy_0705.TWO_EX2_14.PhyscData;

public class TWO_Q10 {

static final int VMAX = 21;
	
	static class PhyscData{
		String name;
		int height;
		double vision;
	
	
		PhyscData(String name, int height, double vision){
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
	}
	
	// Ű ���
	static double aveHeight(PhyscData dat[]) {
		
		double sum = 0;
		
		for(int i = 0; i < dat.length; i++) {
			sum +=  dat[i].height;
		}
		
		return sum / dat.length;
	}
	
	// �÷� ���� 
	static void distVision(PhyscData dat[], int dist[]) {
		int i = 0;
		
		dist[i] = 0;
		
		for(i = 0; i < dat.length; i++){
			
			if(dat[i].vision >= 0.0 && dat[i].vision <= VMAX / 10.0) {
				dist[(int)(dat[i].vision * 10)]++;
			}
		}
	}
	
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
			
			PhyscData x[] = {
					new PhyscData("������", 162, 1.8),
					new PhyscData("���", 178, 1.4),
					new PhyscData("�ֿϱ�", 175, 1.2),
					new PhyscData("Ȳ����", 174, 0.4),
					new PhyscData("������", 180, 0.4),
					new PhyscData("������", 172, 0.4),
					new PhyscData("�赿��", 185, 0.4),
			};
		
			int vdist[] = new int[VMAX];
			
			System.out.println("-- ��ü�˻� ����Ʈ --");
			System.out.println("�̸�    -  Ű   -  �÷�");
			System.out.println("----------------");
			
			for(int i = 0; i < x.length; i++) {
				System.out.printf("%-8s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);
			}
			
			System.out.printf("\n��� Ű : %5.1fcm\n", aveHeight(x));

			distVision(x, vdist);
			
			System.out.println("\n �÷� ����");
			for(int i = 0; i < VMAX; i++) {
				System.out.printf("%3.1f ~ : ", i / 10.0);

				for(int j = 0; j < vdist[i]; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
}
