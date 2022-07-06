package algorithmStudy_0705;

public class TWO_EX2_7 {

	public static void main(String[] args) {
		
		int counter = 0; // °ö¼À°ú ³ª´°¼ÀÀÇ È½¼ö
		int ptr = 0; 	// Ã£Àº ¼Ò¼öÀÇ °³¼ö
		int prime[] = new int[500];		// ¼Ò¼ö¸¦ ÀúÀåÇÏ´Â ¹è¿­
		
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
			System.out.println("°ö¼À°ú ³ª´°¼ÀÀ» ¼öÇàÇÑ È½¼ö : " + counter);
		}
	}
}
