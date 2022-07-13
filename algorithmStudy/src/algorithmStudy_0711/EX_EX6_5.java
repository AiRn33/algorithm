package algorithmStudy_0711;

import java.util.Scanner;

public class EX_EX6_5 {

	static void insertionSort(int a[], int n) {
		
		
	
		for(int i = 1; i < n; i++) {
			
			int j;
			int tmp = a[i];
			
			for(j = i; j > 0 && a[j-1] > tmp; j--) {	
				a[j] = a[j-1];
			}
			a[j] = tmp;
				
		}
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ܼ� ���� ����");
		System.out.println("��ڼ� : ");
		
		int nx = sc.nextInt();
		int x[] = new int[nx];
		
		for(int i = 0; i < nx; i++) {
			
			System.out.println("x[" + i + "]:");
			x[i] = sc.nextInt();
		}
		
		insertionSort(x,nx);
		
		System.out.println("���� �������� �����߽��ϴ�");
		
		 for(int i = 0; i < nx; i++) {
			 System.out.println("x[" + i + "]= " + x[i]);
		 }
	}
}