package algorithmStudy_0704;

import java.util.Scanner;

public class TWO_Q05 {

	public static void main(String[] args) {

		System.out.println("A 배열 길이 : ");

		Scanner sc = new Scanner(System.in);
		int a[] = new int[sc.nextInt()];

		System.out.println("B 배열 길이 : ");
		int b[] = new int[sc.nextInt()];

		System.out.println("배열 B 값 입력 : ");
		for (int i = 0; i < b.length; i++) {
			b[i] = sc.nextInt();
		}

		copy(a, b);
	}

	static void copy(int a[], int b[]) {

		for (int i = 0; i < a.length; i++) {
			if (a.length != b.length) {
				System.out.println("a와 b 배열의 길이가 다릅니다");
				break;
			}
			a[a.length - i - 1] = b[i];
		}

		System.out.println("A 배열 값 출력");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println("B 배열 값 출력");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
	}
}
