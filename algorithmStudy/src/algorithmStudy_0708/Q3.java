package algorithmStudy_0708;

import java.util.Scanner;

public class Q3 {
	static int gcdAraay(int a[]) {
		
		// 
		
		int max = 0;
		
		for(int i = 0; i < a.length; i++) {
			if(i == 0) {
				max = a[i];
			}else {
				if(a[i-1]<a[i]) {
					max = a[i];
				}
			}
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�Է� ���� �� �� �Է�");
		int num = sc.nextInt();
		int a[] = new int[num];
		
		for(int i = 0; i < num; i++) {
			System.out.println("������ �Է��ϼ���");
			a[i] = sc.nextInt();
		}
		
		System.out.println("�ִ� ������� " + gcdAraay(a) + "�Դϴ�");
				
	}
}
