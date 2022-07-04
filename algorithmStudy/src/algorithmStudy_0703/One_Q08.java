package algorithmStudy_0703;

import java.util.Scanner;

public class One_Q08 {
 
	public static void main(String[] args) {
		System.out.println("가우디 덧셈을 사용해서 합을 구해보자");
		
		System.out.println("1부터 n까지의 합 중 N 값 입력");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		System.out.println("결과 : 1 ~ " + num + " : " + (1+num)*(num/2));
	}
}
