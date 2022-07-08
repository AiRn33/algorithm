package algorithmStudy_0707;

import java.util.Scanner;

public class FOUR_EX4_1_MAIN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FOUR_EX4_1 s = new FOUR_EX4_1(64);
		
		while(true){
			System.out.println("현재 데이터 수 : " + s.size() + " / " + s.capacity());
			System.out.print("(1)푸시 (2)팝 (3)피크 (4)덤프 (5)검색 (0)종료 : ");
		
			int menu = sc.nextInt();
			
			// 종료 선택시 종료
			if(menu == 0) {
				break;
			}
			
			int x;
			switch(menu) {
			
			case 1:
				System.out.println("데이터 : ");
				x = sc.nextInt();
				try {
					s.push(x);
				}catch(FOUR_EX4_1.OverflowInStackException e) {
					System.out.println("스택이 가득 찼습니다");
				}
				break;
			case 2:
				try {
					x = s.pop();
					System.out.println("꺼내 올 데이터는 " + x + "입니다"); 
				}catch(FOUR_EX4_1.EmptyInstackException e) {
					System.out.println("스택이 비어있습니다");
				}
				break;
				
			case 3:
				try {
					x = s.peek();
					System.out.println("피크한 데이터는 " + x + "입니다");
				}catch(FOUR_EX4_1.EmptyInstackException e) {
					System.out.println("스택이 비어있습니다");
				}
				break;
				
			case 4:
				s.dump();
				break;
			
			case 5:
				System.out.print("검색할 데이터 입력  : ");
				x = sc.nextInt();
				int i =s.indexOf(x);
				System.out.println("검색한 데이터는 " + (i+1) + "번째에 있습니다");
				break;
			}
			
		}
		
		
	}
}
