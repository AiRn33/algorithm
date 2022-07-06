package algorithmStudy_0706;

import java.util.Scanner;

public class TWO_Q2 {

	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = sc.nextInt();
		int x[] = new int[num];
		
		System.out.print("오름차순 입력");
		
		System.out.println("x[0] : ");
	
		x[0] = sc.nextInt();
		
		for(int i = 1; i < num; i++) {
				System.out.println("x[" + i + "] : ");
				x[i] = sc.nextInt();	
		}
		
		System.out.print("검색할 값 : ");
			
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
				System.out.println(ky + "는 x[" + i + "]에 있습니다");
				break;
				
			}
						
			
			
		}
		
	}
}
	
