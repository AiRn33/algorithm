package algorithmStudy_0707;

public class FOUR_EX4_3_2 {

	private int max; 	// 큐의 용량
	private int front;  // 첫번째 요소 커서
	private int rear;	// 마지막 요소 커서
	private int num;	// 현재 데이터 수
	private int que[];  // 큐 본체
	
	// 실행 시 예외 : 스택이 비어있을 때
	public class EmptyInstackException extends RuntimeException{
		public EmptyInstackException() {	}
	}
		
	// 실행 시 예외 : 스택이 가득찼을 때
	public class OverflowInStackException extends RuntimeException{
		public OverflowInStackException() {	}
	}
	
	public FOUR_EX4_3_2(int capacity) {
		
		num = 0;
		max = capacity;
		front =  max - 1;
		rear = max - 1;

		try {
			que = new int[max];
		}catch(OutOfMemoryError e) {
			max = 0;
		}
		System.out.println("front : " + front);
		System.out.println("rear : " + rear);
	}
	
	// 인큐 데이터 추가
	public int enque(int x) throws OverflowInStackException{
		
		if(num >= max) {
			throw new OverflowInStackException();
		}
		
		que[rear--] = x;
		num++;
		if(rear == 0) {
			rear = max;
		}
		System.out.println("front : " + front);
		System.out.println("rear : " + rear);		
		return x;
	}
	
	
	// 디큐 데이터를 빼옴
		public int deque() throws EmptyInstackException{
			if(num <= 0) {
				throw new EmptyInstackException();
			}
			int x = que[front--];
			num--;
			if(front == 0){
				front = max;
			}
					
			return x;
		}
	
	// 큐에서 데이터를 피트 (프런트 데이터를 들여다 본다)
	public int peek() throws EmptyInstackException{
		if(num <= 0) {
			throw new EmptyInstackException();
		}
		return que[front];
	}
	
	// 큐에서 x를 검색하여 인덱스(찾지 못하면 -1)을 반환
	public int indexOf(int x) {
		for(int i = max; i > 0; i--) {
			int idx = (i + front) % max;
			if(que[idx] == x) {
				return idx;
			}
		}
		return -1;
	}
	
	// 큐를 비움
	public void clear() {
		num = front = rear = 0;
	}
	
	// 큐의 용량을 반환
	public int capacity() {
		return max;
	}
	
	// 큐에 쌓여 있는 데이터 수를 반환
	public int size() {
		return num;
	}
	
	// 큐가 비어 있는지 확인
	public boolean isEmpty() {
		return num <= 0;
	}
	
	// 큐가 가득 찼는지 확인
	 public boolean isFull() {
		 return num >= max;
	 }
	 
	 // 큐 안의 모든 데이터를 프런트 → 리어 순으로 출력
	 public void dump() {
		 if(num <= 0) {
			 System.out.println("큐가 비어 있습니다");
		 }
		 else {
			 for(int i = max; i > 0; i--) {
				 System.out.println(que[(i + front) % max] + " ");			 
			}
			System.out.println(); 
		 }
	 }
}
