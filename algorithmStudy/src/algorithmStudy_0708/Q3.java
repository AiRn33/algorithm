package algorithmStudy_0708;

import java.util.Scanner;

public class Q3 {
	static int gcdAraay(int a[]) {
		
		// 
		
		int max = 0;
		
		for(int i = 0; i < a.length; i++) {
			if(i == 0) {
				max = a[i];
			}else {
				if(a[i-1]<a[i]) {
					max = a[i];
				}
			}
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력 정수 갯 수 입력");
		int num = sc.nextInt();
		int a[] = new int[num];
		
		for(int i = 0; i < num; i++) {
			System.out.println("정수를 입력하세요");
			a[i] = sc.nextInt();
		}
		
		System.out.println("최대 공약수는 " + gcdAraay(a) + "입니다");
				
	}
}
