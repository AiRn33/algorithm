package algorithmStudy_0703;

import java.util.Scanner;

public class One_Q08 {
 
	public static void main(String[] args) {
		System.out.println("����� ������ ����ؼ� ���� ���غ���");
		
		System.out.println("1���� n������ �� �� N �� �Է�");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		System.out.println("��� : 1 ~ " + num + " : " + (1+num)*(num/2));
	}
}
