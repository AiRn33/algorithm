package algorithmStudy_0703;

import java.util.Scanner;

public class One_Q16 {
	
	public static void main(String[] args) {
		
		System.out.println("피라미드를 쌓아 봅시다");
		System.out.println("몇 층 피라미드를 건설하시겠습니까??");
		System.out.print("층 수 입력 : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println("------------------------");
		
		spira(n);
	}
	
	public static void spira(int n) {
		
		for(int i = 1; i <= n; i++) { // 3 2 1
			for(int k = i; k < n; k++) { // k = 0 / n = 3 0 1 2
				System.out.print(" ");
			}
			for(int j = 0; j < (i-1)*2+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
