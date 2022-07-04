package algorithmStudy_0703;

import java.util.Scanner;

public class One_Q17 {

	public static void main(String[] args) {
		System.out.println("¸î Ãþ °Ç¹°À» ½×À¸½Ã°Ú¾î¿ä??");
		System.out.println("Ãþ¼ö ÀÔ·Â : " );
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		npira(num);
	}
	
	public static void npira(int n) {
		
		for(int i = 1; i <= n; i++) { // 3 2 1
			for(int k = i; k < n; k++) { // k = 0 / n = 3 0 1 2
				System.out.print(" ");
			}
			for(int j = 0; j < (i-1)*2+1; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
}
