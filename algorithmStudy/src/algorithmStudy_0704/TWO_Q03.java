package algorithmStudy_0704;

import java.util.Scanner;

public class TWO_Q03 {
	
	public static void main(String[] args) {
		System.out.print("��� �� �Է� : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int x[] = new int[num];
		
		for(int i = 0; i < x.length; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}
		
		System.out.println("���� ��ڼ��� ��");
		for(int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
		
		System.out.println("��ڼ����� �� �հ�");
		
		System.out.println(sumOf(x));
	
	}
	
	static int sumOf(int a[]){
		
		int sum = 0;
		
		for(int i = 0; i < a.length; i++) {
			sum+= a[i];
		}
		
		return sum;
	}
}
