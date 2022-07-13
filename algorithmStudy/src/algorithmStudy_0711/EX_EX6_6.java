package algorithmStudy_0711;

import java.util.Scanner;

public class EX_EX6_6 {

	static void shellSort(int a[], int n) {
		// 8 1 4 2 7 6 3 5 
		// n == 8
		// h == 4 |  i = 4 | tmp = 7 | j = 0 / 8 | 성립 성립 | 스왑 
		int check = 0;
		
		for(int h = n / 2; h > 0; h /= 2) {
			
			System.out.println("a[" + check + "] : " + a[check]);
			for(int i = h; i < n; i++) {
				int j;
				int tmp = a[i];
			
				System.out.println("a[" + check + "] : " + a[check]);

				for(j = i - h; j >= 0 && a[j] > tmp; j -= h) {
					
					a[j + h] = a[j];
				}
				a[j + h] = tmp;
				
			}
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		System.out.println("셸 정렬(버전 1)");
		
		System.out.println("요솟 수 : ");
		
		int nx = sc.nextInt();
		int x[] = new int[nx];
		
		for(int i = 0; i < nx; i++) {
			System.out.println("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}
		
		shellSort(x, nx);
		
		System.out.println("오름차순으로 정렬했습니다");
		
		for(int i = 0; i < nx; i++) {
			System.out.println("x[" + i + "] : " + x[i]);
		}
		
	  
	}
}
