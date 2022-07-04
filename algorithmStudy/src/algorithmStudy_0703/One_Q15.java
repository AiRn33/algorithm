package algorithmStudy_0703;

import java.util.Scanner;

public class One_Q15 {

	public static void main(String[] args) {
		
		System.out.println("몇 줄의 직각 이등변 삼각형을 출력할까요 ??");
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
//		triangleLB(n);
//		System.out.println();
//		triangleLU(n);
//		System.out.println();
//		triangleRB(n);
		System.out.println();
		triangleRU(n);
	}
	
	public static void triangleLB(int n) {
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public static void triangleLU(int n) {
		for(int i = n; i > 0; i--) {
			for(int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void triangleRB(int n) {
		for(int i = n; i > 0; i--) {
			for(int j = n; j > 0; j--) {
				if(i < j)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void triangleRU(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(i < n-j-1)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}
}
