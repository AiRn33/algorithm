package algorithmStudy_0703;

import java.util.Scanner;

public class One_Q09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�� ������ �Է����ּ���");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a > b) {
			a = a^b;
			b = a^b;
			a = a^b;
		}
		
		System.out.println(a + " ~ " + b +" ������ �������� �� : " + sumof(a,b));
	}
	
	public static int sumof(int a, int b) {
		
		int result = 0;
		
		int i = a;
		while(i <= b) {
			result += i;
			i++;
		}
		
		return result;
	}
}
