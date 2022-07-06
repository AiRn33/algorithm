package algorithmStudy_0705;

public class TWO_EX2_7 {

	public static void main(String[] args) {
		
		int counter = 0; // ������ �������� Ƚ��
		int ptr = 0; 	// ã�� �Ҽ��� ����
		int prime[] = new int[500];		// �Ҽ��� �����ϴ� �迭
		
		prime[ptr++] = 2;	
		prime[ptr++] = 3;
		
		for(int n = 5; n <= 1000; n += 2) {
			System.out.println("n : " + n);
			boolean flag = false;	
			
			for(int i = 1; prime[i]*prime[i] <= n; i++) {
				
				System.out.println("i : " + i);
				System.out.println("prime[i] : " + prime[i]);
				
				counter += 2;

				if(n % prime[i] == 0) {
					flag = true;
					break;
				}
			}
			
			if(!flag) {
				prime[ptr++] = n;
				counter++;
			}
		}
		
		for(int i = 0; i < ptr; i++) {
			System.out.println(prime[i]);
			System.out.println("������ �������� ������ Ƚ�� : " + counter);
		}
	}
}
