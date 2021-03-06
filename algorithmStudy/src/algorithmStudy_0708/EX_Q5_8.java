package algorithmStudy_0708;

public class EX_Q5_8 {

	static int pos[] = new int[8];
	static boolean flag[] = new boolean[8];
	
	// 각 열의 퀸의 위치를 출력합니다
	static void print() {
		for(int i = 0; i < 8; i++) {
			System.out.printf("%2d", pos[i]);
		}
		System.out.println();
	}
	
	
	// i 열에 퀸을 놓습니다
	static void set(int i) {
		for(int j = 0; j < 8; j++) {
			pos[i] = j;
			if(i == 7) {
				print();
			}else {
				flag[j] = true;
				set(i+1);
				flag[j] = false;
			}
		}
	}
	
	public static void main(String[] args) {
		set(0);
	}
	
}
