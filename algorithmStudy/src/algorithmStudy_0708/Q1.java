package algorithmStudy_0708;

import java.util.Scanner;

public class Q1 {

static int factorial(int n) {
		
		int a = 1;
		
		for(int i = n; i > 0; i--) {
			a *= i;
		}
		
		if(n > 0)
			return a;
		else
			return 1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ��� : ");
		int x = sc.nextInt();
		
		System.out.println(x + "�� ���丮���� " + factorial(x) + "�Դϴ�");
	}
}
