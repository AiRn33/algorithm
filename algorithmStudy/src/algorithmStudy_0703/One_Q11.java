package algorithmStudy_0703;

import java.util.Scanner;

public class One_Q11 {

	public static void main(String[] args) {
		System.out.println("���� ������ �Է����ּ���");
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		int i = 1;
		int result = 10;
		while(true) {
			
			if(a / 1 < result) {
				break;
			}
			i++;
			result *= 10;
		}
		
		System.out.println("�Է��� ������ �ڸ����� " + i + "�ڸ� �Դϴ�");
		
		
	}
}
