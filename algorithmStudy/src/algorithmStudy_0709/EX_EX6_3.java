package algorithmStudy_0709;

import java.util.Scanner;

public class EX_EX6_3 {

	// a[idx1]�� a[idx2]�� ���� �ٲߴϴ�
	static void swap(int a[], int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
		
	static void bubbleSort(int a[], int n) {
		
		int k = 0;

		while(k < n - 1) {
			
			int last = n - 1;
			
			for(int j = n - 1; j > k; j--) {
			
				if(a[j-1] > a[j]){
					
					swap(a, j - 1, j);
					last = j;
				}
				
			}
			
			k = last;
		}
		
	}
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� ����(����1)");
		System.out.print("��ڼ� : ");
		int nx = sc.nextInt();
		int x[] = new int[nx];
		
		for(int i = 0; i < nx; i++) {
		
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}
		
		bubbleSort(x, nx);
		
		System.out.println("������������ �����߽��ϴ�");
		for(int i = 0; i < nx; i++) {
			
			System.out.println("x[" + i +"] = " + x[i]);
		}
	}
}