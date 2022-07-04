package algorithmStudy_0703;

import java.util.Scanner;

public class One_Q14 {

	public static void main(String[] args) {
		
		System.out.println("사각형을 출력합니다");
		System.out.println("단 수 : ");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
