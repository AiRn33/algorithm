package algorithmStudy_0708;

import java.util.Scanner;

public class Q2 {

	// ���� x, y�� �ִ������� ���Ͽ� ��ȯ�մϴ�
		static int gcd(int x, int y) {
			
			int check = 0;
			int num = 0;
			
			if(y == 0) {
				return x;
			}else {
				if(x > y) {
					num = x / 2;
				}else {
					num = y / 2;
				}
				int a[] = new int[num];
				int b[] = new int[num];
				for(int i = 1; i <= x; i++) {
					if(x % i == 0) {
						a[check] = i;
						check++;
					}
				}
				check = 0;
				
				for(int i = 1; i <= y; i++) {
					if(y % i == 0) {
						b[check] = i;
						check++;
					}
				}
				
				
				for(int i = 0; i < num; i++) {
				
					for(int j = 0; j < num; j++) {
						
						if(b[j] == 0 || a[i] == 0) {
							break;
						}
						
						System.out.println("a[" + i + "] : " + a[i]);
						System.out.println("b[" + j + "] : " + b[j]);
						
						if(a[i] == b[j]) {
							check = a[i];
							System.out.println("check : " + check);
						}
						
					}
				}
				
			}
			
			return check;
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
