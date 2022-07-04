package algorithmStudy_0704;

import java.util.Scanner;

public class TWO_Q07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int no; // ��ȯ�ϴ� ����
		int cd; // ���
		int dno; // ��ȯ ���� �ڸ� ��
		int retry; // �ٽ� �� ��
		char cno[] = new char[32]; // ��ȯ �� �� �ڸ��� ���ڸ� �־�δ� ������ �迭

		do {

			do {
				System.out.print("��ȯ �ϴ� ���� �ƴ� ���� : ");
				no = sc.nextInt();
			} while (no < 0);

			do {
				System.out.print("� ������ ��ȯ�ұ��? (2~36) : ");
				cd = sc.nextInt();
			} while (cd < 2 || cd > 36);

			dno = cardConvR(no, cd, cno);

			System.out.print(cd + "�����δ� ");

			for (int i = dno - 1; i >= 0; i--) {
				System.out.print(cno[i]);
			}
			System.out.print("�Դϴ�..");

			System.out.println("�ѹ� �� �ұ��  /  1.�� , 2.�ƴϿ�");
			retry = sc.nextInt();

		} while (retry == 1);
	}

	static int cardConvR(int no, int cd, char cno[]) {

		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println("2 |     " + no);
		System.out.println("  +------------");
		do {
			int num = no% cd;

			System.out.println("2 |     " + no/2 +"..."+ num);
			System.out.println("  +------------");
			cno[digits++] = dchar.charAt(no % cd);
			no /= cd;
		} while (no != 0);


		return digits;
	}
}
