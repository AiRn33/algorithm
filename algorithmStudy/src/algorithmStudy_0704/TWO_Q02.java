package algorithmStudy_0704;

import java.util.Scanner;

public class TWO_Q02 {

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
		
		reverse(x);
		
		
	}
	
	static void swap(int a[], int idx1, int idx2) {
		int t = a[idx1]; 
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void reverse(int a[]) {
		for(int i = 0; i < a.length/2; i++) {
			swap(a, i, a.length-i-1);
			System.out.println();
			System.out.println("x[" + i +"]�� x[" + (a.length-i-1) + "]�� ���� ��ȯ�մϴ�");
			for(int j = 0; j < a.length; j++){
				System.out.print(a[j] + " ");
			}
		}
	}
	
}
