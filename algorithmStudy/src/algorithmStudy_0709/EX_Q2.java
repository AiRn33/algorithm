package algorithmStudy_0709;

import java.util.Scanner;

public class EX_Q2 {


	// a[idx1]와 a[idx2]의 값을 바꿉니다
	static void swap(int a[], int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	// 버블 정렬
	static void bubbleSort(int a[], int n) {
			
		for(int i = 0; i < n - 1; i++) {
			
			int check = n + 1;
			String b= "  ";
			for(int j = 0; j < n-1; j++) {
				
				
				if(a[j] > a[j+1]) {

					swap(a, j, j+1);
					check = j;
				}

				for(int k = 0; k < n; k++) {
					if(check == k) {
						b = " + ";
						check = n + 1;
					}
					System.out.print(a[k] + b);
					b = "  ";
				}
				
				System.out.println();

			}
			
			System.out.println();
			
		}		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("버블 정렬(버전1)");
		System.out.print("요솟수 : ");
		int nx = sc.nextInt();
		int x[] = new int[nx];
		
		for(int i = 0; i < nx; i++) {
		
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}
		System.out.println("패스 1");
		for(int i = 0; i < nx; i++){
			
			System.out.print(x[i] + "  ");
		}
		System.out.println();
		bubbleSort(x, nx);
		
	}
}
