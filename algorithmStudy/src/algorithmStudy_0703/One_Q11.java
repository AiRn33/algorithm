package algorithmStudy_0703;

import java.util.Scanner;

public class One_Q11 {

	public static void main(String[] args) {
		System.out.println("양의 정수를 입력해주세요");
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		int i = 1;
		int result = 10;
		while(true) {
			
			if(a / 1 < result) {
				break;
			}
			i++;
			result *= 10;
		}
		
		System.out.println("입력한 정수의 자리수는 " + i + "자리 입니다");
		
		
	}
}
