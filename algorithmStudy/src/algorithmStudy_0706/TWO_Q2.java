package algorithmStudy_0706;

import java.util.Scanner;

public class TWO_Q2 {

	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��ڼ� : ");
		int num = sc.nextInt();
		int x[] = new int[num];
		
		System.out.print("�������� �Է�");
		
		System.out.println("x[0] : ");
	
		x[0] = sc.nextInt();
		
		for(int i = 1; i < num; i++) {
				System.out.println("x[" + i + "] : ");
				x[i] = sc.nextInt();	
		}
		
		System.out.print("�˻��� �� : ");
			
		int ky = sc.nextInt();
		String bar = "---";
		String ur = " ";
		System.out.print(" | ");
		for(int i = 0; i < num; i++) {
				System.out.print(i + " ");
			if(i == num-1) {
				System.out.println();
				System.out.print("-+");
				for(int j = 0; j < i; j++) {
					System.out.print(bar);
				}
				System.out.println();
			}
		}
		
		
		for(int i = 0; i < num; i++){
			
			for(int j = 1; j < num+2; j++) {
				if(j==1){
					System.out.print(" | ");
					for(int k = 0; k < num; k++) {
						if(k == i) {
							System.out.print("* ");
						}else {
							System.out.print(ur);
						}
					}
					System.out.println();
					System.out.print(i + "| ");
				}else {
					System.out.print(x[j-2] + " ");
				}
			}
			System.out.println();	
			
			if(x[i] == ky) {
				System.out.println(ky + "�� x[" + i + "]�� �ֽ��ϴ�");
				break;
				
			}
						
			
			
		}
		
	}
}
	
