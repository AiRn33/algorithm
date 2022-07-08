package algorithmStudy_0707;

import java.util.Scanner;

public class FOUR_EX4_3_MAIN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FOUR_EX4_3 s = new FOUR_EX4_3(64);// 64개를 인큐할 수 있는 큐
		
		while(true){
			System.out.println("현재 데이터 수 : " + s.size() + " / " + s.capacity());
			System.out.print("(1)푸시 (2)팝 (3)피크 (4)덤프 (5)검색 (0)종료 : ");
		
			int menu = sc.nextInt();
			if(menu == 0) break;
			
			int x;
			switch(menu) {
			
			case 1:	// 인큐
				System.out.println("데이터 : ");
				x = sc.nextInt();
				try {
					s.enque(x);
				}catch(FOUR_EX4_3.OverflowInStackException e) {
					System.out.println("큐가 가득 찼습니다");
				}
				break;
			
			case 2:  // 디큐
				try {
					x = s.deque();
				
				System.out.println("디큐한 데이터는 " + x + "입니다");
				
				
				}catch(FOUR_EX4_3.EmptyInstackException e) {
					System.out.println("큐가 비어있습니다");
				}
				break;
				
			case 3:
				try {
					x = s.peek();
					System.out.println("피크한 데이터는 " + x + "입니다");
				}catch(FOUR_EX4_3.EmptyInstackException e) {
					System.out.println("큐가 비어있습니다");
				}
				break;
				
			case 4:
				s.dump();
				break;
				
			case 5:
				System.out.print("검색할 데이터 입력 : ");
				x = sc.nextInt();
				int a = s.indexOf(x);
				System.out.println("입력한 데이터 " + x +"는 " + a + "번 쨰에 존재합니다");
				break;
			}
		}
	}
}
