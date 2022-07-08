package algorithmStudy_0707;

import java.util.Scanner;

public class FOUR_EX4_1_MAIN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FOUR_EX4_1 s = new FOUR_EX4_1(64);
		
		while(true){
			System.out.println("���� ������ �� : " + s.size() + " / " + s.capacity());
			System.out.print("(1)Ǫ�� (2)�� (3)��ũ (4)���� (5)�˻� (0)���� : ");
		
			int menu = sc.nextInt();
			
			// ���� ���ý� ����
			if(menu == 0) {
				break;
			}
			
			int x;
			switch(menu) {
			
			case 1:
				System.out.println("������ : ");
				x = sc.nextInt();
				try {
					s.push(x);
				}catch(FOUR_EX4_1.OverflowInStackException e) {
					System.out.println("������ ���� á���ϴ�");
				}
				break;
			case 2:
				try {
					x = s.pop();
					System.out.println("���� �� �����ʹ� " + x + "�Դϴ�"); 
				}catch(FOUR_EX4_1.EmptyInstackException e) {
					System.out.println("������ ����ֽ��ϴ�");
				}
				break;
				
			case 3:
				try {
					x = s.peek();
					System.out.println("��ũ�� �����ʹ� " + x + "�Դϴ�");
				}catch(FOUR_EX4_1.EmptyInstackException e) {
					System.out.println("������ ����ֽ��ϴ�");
				}
				break;
				
			case 4:
				s.dump();
				break;
			
			case 5:
				System.out.print("�˻��� ������ �Է�  : ");
				x = sc.nextInt();
				int i =s.indexOf(x);
				System.out.println("�˻��� �����ʹ� " + (i+1) + "��°�� �ֽ��ϴ�");
				break;
			}
			
		}
		
		
	}
}
