package algorithmStudy_0703;

public class One_Q12 {

	public static void main(String[] args) {
		
		System.out.println("µå°¡ÀÚ~~");
		
		for(int i = 0; i < 10; i++) {
			
			if(i == 0) {
				System.out.print("  |");
			}else if(i > 0) {
				System.out.print(i + " |");
			}
			
			for(int j = 1; j < 10; j++) {
				
				if(i == 0) 
					System.out.print(j + "  ");
				else
					System.out.print(i*j + " ");
			}
			
			if(i == 0) {
				System.out.println();
				System.out.print("--+-----------------");
			}
			System.out.println();
		}
	}
	
}
