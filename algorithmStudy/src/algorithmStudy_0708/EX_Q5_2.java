package algorithmStudy_0708;

import java.util.Scanner;

public class EX_Q5_2 {
	
	// ���� x, y�� �ִ������� ���Ͽ� ��ȯ�մϴ�
	static int gcd(int x, int y) {
		
		if(y == 0) {
			return x;
		}else {
			return gcd(y, x % y);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�� ������ �ִ� ������� ���մϴ�");
		
		System.out.println("������ �Է��ϼ���");
		int x = sc.nextInt();
		System.out.println("������ �Է��ϼ���");
		int y = sc.nextInt();
		
		System.out.println("�ִ� ������� " + gcd(x, y) + "�Դϴ�");
				
	}
	
}
