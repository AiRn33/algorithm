package algorithmStudy_0703;

import java.util.Scanner;

public class One_Q14 {

	public static void main(String[] args) {
		
		System.out.println("�簢���� ����մϴ�");
		System.out.println("�� �� : ");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
