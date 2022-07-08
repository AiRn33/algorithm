package algorithmStudy_0707;

public class FOUR_EX4_1 {
	
	private int max;	// 스택 용량
	private int ptr;	// 스택 포인터
	private int ptr2;
	private int stk[];	// 스택 본체

	// 실행 시 예외 : 스택이 비어있을 때
	public class EmptyInstackException extends RuntimeException{
		public EmptyInstackException() {	}
	}
	
	// 실행 시 예외 : 스택이 가득찼을 때
	public class OverflowInStackException extends RuntimeException{
		public OverflowInStackException() {	}
	}
	
	// 생성자
	public FOUR_EX4_1(int capacity) {
		ptr = 0;
		max = capacity;
		ptr2 = (max-1);

		try {
			stk = new int[max]; // 스택 용량 만큼 스택 생성
		}catch(OutOfMemoryError e) {
			max = 0;	// 생성할 수 없을 때 배열 길이 0 부여
		}
	}
	
	// push 스택에 데이터 입력
	public int push(int x) throws OverflowInStackException{
		
		// 스택이 가득 찼을 때 오류 발생
		if(ptr >= max) {	
			throw new OverflowInStackException();
		}
		
		return stk[ptr++] = x;
	}
	
	// push 스택에 데이터 입력
	public int push2(int x) throws OverflowInStackException{
		
		// 스택이 가득 찼을 때 오류 발생
		if(ptr >= max) {	
			throw new OverflowInStackException();
		}
		return stk[ptr2--] = x;
	}
	
	// pop 스택에서 데이터를 꺼냄
	public int pop() throws EmptyInstackException{
		
		if(ptr <= 0) {
			throw new EmptyInstackException();
		}
		return stk[--ptr];
	}
	
	// pop 스택에서 데이터를 꺼냄
	public int pop2() throws EmptyInstackException{
		
		if(ptr <= 0) {
			throw new EmptyInstackException();
		}
		return stk[++ptr2];
	}
	
	// 가장 위의 데이터 확인		
	public int peek() throws EmptyInstackException{
		if(ptr <= 0) {
			throw new EmptyInstackException();
		}
		return stk[ptr - 1];
	}

	// 가장 위의 데이터 확인		
	public int peek2() throws EmptyInstackException{
		if(ptr <= 0) {
			throw new EmptyInstackException();
		}
		return stk[ptr2 + 1];
	}

	// 검색하는 메서드 indexOf
	public int indexOf(int x) {
		for(int i = ptr - 1; i >= 0; i--) {
			if(stk[i] == x) {
				return i;
			}
		}
		return -1;
	}
	
	// 검색하는 메서드 indexOf
	public int indexOf2(int x) {
		for(int i = ptr2 + 1; i <= max; i++) {
			if(stk[i] == x) {
				return i;
			}
		}
		return -1;
	}
	
	// 스택을 비움
	public void clear() {
		ptr = 0;
	}
	
	// 스택 용량 반환
	public int capacity() {
		return max;
	}
	
	// 스택에 쌓여 있는 데이터 수 반환
	public int size() {
		return ptr+(max-ptr2-1);
	}
	
	// 스택이 비어있는지 확인
	public boolean isEmpty() {
		return ptr <= 0;
	}

	// 스택이 가득 찼는지 확인
	public boolean isFull() {
		return ptr >= max;
	}

	// 스택 안의 모든 데이터를 바닥 에서 꼭대기 순서로 출력
	public void dump() {
		if(ptr <= 0 && ptr2 == max-1) {
			System.out.println("스택이 비었습니다");
		}else {
			for(int i = 0; i < ptr; i++) {
				System.out.print(stk[i] + " ");
				System.out.println();
			}
			
			if(ptr2 != max-1) {
				for(int i = ptr2+1; i < max; i++) {
					System.out.print(stk[i] + " ");
					System.out.println();
				}
			}
		}
	}
	
	
}

