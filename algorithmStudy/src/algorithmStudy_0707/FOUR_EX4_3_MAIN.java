package algorithmStudy_0707;

import java.util.Scanner;

public class FOUR_EX4_3_MAIN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FOUR_EX4_3 s = new FOUR_EX4_3(64);// 64���� ��ť�� �� �ִ� ť
		
		while(true){
			System.out.println("���� ������ �� : " + s.size() + " / " + s.capacity());
			System.out.print("(1)Ǫ�� (2)�� (3)��ũ (4)���� (5)�˻� (0)���� : ");
		
			int menu = sc.nextInt();
			if(menu == 0) break;
			
			int x;
			switch(menu) {
			
			case 1:	// ��ť
				System.out.println("������ : ");
				x = sc.nextInt();
				try {
					s.enque(x);
				}catch(FOUR_EX4_3.OverflowInStackException e) {
					System.out.println("ť�� ���� á���ϴ�");
				}
				break;
			
			case 2:  // ��ť
				try {
					x = s.deque();
				
				System.out.println("��ť�� �����ʹ� " + x + "�Դϴ�");
				
				
				}catch(FOUR_EX4_3.EmptyInstackException e) {
					System.out.println("ť�� ����ֽ��ϴ�");
				}
				break;
				
			case 3:
				try {
					x = s.peek();
					System.out.println("��ũ�� �����ʹ� " + x + "�Դϴ�");
				}catch(FOUR_EX4_3.EmptyInstackException e) {
					System.out.println("ť�� ����ֽ��ϴ�");
				}
				break;
				
			case 4:
				s.dump();
				break;
				
			case 5:
				System.out.print("�˻��� ������ �Է� : ");
				x = sc.nextInt();
				int a = s.indexOf(x);
				System.out.println("�Է��� ������ " + x +"�� " + a + "�� ���� �����մϴ�");
				break;
			}
		}
	}
}
