package algorithmStudy_0708;

public class EX_Q5_7 {

	static int pos[] = new int[8];
	
	// �� ���� ���� ��ġ�� ����մϴ�
	static void print() {
		for(int i = 0; i < 8; i++) {
			System.out.printf("%2d", pos[i]);
		}
		System.out.println();
	}
	
	
	// i ���� ���� �����ϴ�
	static void set(int i) {
		for(int j = 0; j < 1; j++) {
			pos[i] = j;
			if(i == 7) {
				print();
			}else {
				set(i+1);
			}
		}
	}
	
	public static void main(String[] args) {
		set(0);
	}
	
}
