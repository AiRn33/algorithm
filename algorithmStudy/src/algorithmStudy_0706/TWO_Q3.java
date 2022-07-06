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
		
		System.out.print("��ڼ� : ");
		int num = sc.nextInt();
		int x[] = new int[num];
		int idxs[] = new int[num];
		
		System.out.print("�������� �Է�");
		
		System.out.println("x[0] : ");
	
		x[0] = sc.nextInt();
		
		for(int i = 1; i < num; i++) {
			
				System.out.println("x[" + i + "] : ");
				x[i] = sc.nextInt();
				
		}
			System.out.print("�˻��� �� : ");
			
			int ky = sc.nextInt();
			
			int idx = seqSearch(x, num, ky,idxs);
			
			if(idx == -1) {
				System.out.println("�װ��� �����ϴ�");
			}else{
				System.out.println(idx + " ��ŭ �����մϴ�");
			}
		
		System.out.print("{ ");
		for(int i = 0; i < idx; i++) {
			System.out.print(idxs[i] + " ");
		}
		System.out.println("}");
	}
}
