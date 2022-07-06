package algorithmStudy_0706;

import java.util.Scanner;

public class TWO_Q3 {

	static int seqSearch(int a[], int n, int key, int idxs[]) {
		
		int j = 0;

		for(int i = 0; i < n; i++) {
			if(a[i] == key) {
				idxs[j++] = i;
			}
		}
		if(j != 0) {
			return j;
		}
			
		return -1;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = sc.nextInt();
		int x[] = new int[num];
		int idxs[] = new int[num];
		
		System.out.print("오름차순 입력");
		
		System.out.println("x[0] : ");
	
		x[0] = sc.nextInt();
		
		for(int i = 1; i < num; i++) {
			
				System.out.println("x[" + i + "] : ");
				x[i] = sc.nextInt();
				
		}
			System.out.print("검색할 값 : ");
			
			int ky = sc.nextInt();
			
			int idx = seqSearch(x, num, ky,idxs);
			
			if(idx == -1) {
				System.out.println("그값이 없습니다");
			}else{
				System.out.println(idx + " 만큼 존재합니다");
			}
		
		System.out.print("{ ");
		for(int i = 0; i < idx; i++) {
			System.out.print(idxs[i] + " ");
		}
		System.out.println("}");
	}
}
