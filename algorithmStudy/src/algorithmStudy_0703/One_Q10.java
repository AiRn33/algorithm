package algorithmStudy_0703;

import java.util.Scanner;

public class One_Q10 {
	
	public static void main(String[] args) {
		
		System.out.println("�� ���� a, b�� �Է��ϼ���");
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a == b || b < a) {
			System.out.println("a���� ū ���� �Է����ּ���");
			System.out.println("b�� �ٽ� �Է����ּ���");
			System.out.println("���� a �� : " + a);
			b = sc.nextInt();
		}
		
		System.out.println("b - a �� �� : " + (b-a));
	}
}
