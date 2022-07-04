package algorithmStudy_0703;

import java.util.Scanner;

public class One_Q10 {
	
	public static void main(String[] args) {
		
		System.out.println("두 정수 a, b를 입력하세요");
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a == b || b < a) {
			System.out.println("a보다 큰 값을 입력해주세요");
			System.out.println("b를 다시 입력해주세요");
			System.out.println("현재 a 값 : " + a);
			b = sc.nextInt();
		}
		
		System.out.println("b - a 의 값 : " + (b-a));
	}
}
