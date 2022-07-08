package algorithmStudy_0707;

public class FOUR_EX4_1 {
	
	private int max;	// ���� �뷮
	private int ptr;	// ���� ������
	private int ptr2;
	private int stk[];	// ���� ��ü

	// ���� �� ���� : ������ ������� ��
	public class EmptyInstackException extends RuntimeException{
		public EmptyInstackException() {	}
	}
	
	// ���� �� ���� : ������ ����á�� ��
	public class OverflowInStackException extends RuntimeException{
		public OverflowInStackException() {	}
	}
	
	// ������
	public FOUR_EX4_1(int capacity) {
		ptr = 0;
		max = capacity;
		ptr2 = (max-1);

		try {
			stk = new int[max]; // ���� �뷮 ��ŭ ���� ����
		}catch(OutOfMemoryError e) {
			max = 0;	// ������ �� ���� �� �迭 ���� 0 �ο�
		}
	}
	
	// push ���ÿ� ������ �Է�
	public int push(int x) throws OverflowInStackException{
		
		// ������ ���� á�� �� ���� �߻�
		if(ptr >= max) {	
			throw new OverflowInStackException();
		}
		
		return stk[ptr++] = x;
	}
	
	// push ���ÿ� ������ �Է�
	public int push2(int x) throws OverflowInStackException{
		
		// ������ ���� á�� �� ���� �߻�
		if(ptr >= max) {	
			throw new OverflowInStackException();
		}
		return stk[ptr2--] = x;
	}
	
	// pop ���ÿ��� �����͸� ����
	public int pop() throws EmptyInstackException{
		
		if(ptr <= 0) {
			throw new EmptyInstackException();
		}
		return stk[--ptr];
	}
	
	// pop ���ÿ��� �����͸� ����
	public int pop2() throws EmptyInstackException{
		
		if(ptr <= 0) {
			throw new EmptyInstackException();
		}
		return stk[++ptr2];
	}
	
	// ���� ���� ������ Ȯ��		
	public int peek() throws EmptyInstackException{
		if(ptr <= 0) {
			throw new EmptyInstackException();
		}
		return stk[ptr - 1];
	}

	// ���� ���� ������ Ȯ��		
	public int peek2() throws EmptyInstackException{
		if(ptr <= 0) {
			throw new EmptyInstackException();
		}
		return stk[ptr2 + 1];
	}

	// �˻��ϴ� �޼��� indexOf
	public int indexOf(int x) {
		for(int i = ptr - 1; i >= 0; i--) {
			if(stk[i] == x) {
				return i;
			}
		}
		return -1;
	}
	
	// �˻��ϴ� �޼��� indexOf
	public int indexOf2(int x) {
		for(int i = ptr2 + 1; i <= max; i++) {
			if(stk[i] == x) {
				return i;
			}
		}
		return -1;
	}
	
	// ������ ���
	public void clear() {
		ptr = 0;
	}
	
	// ���� �뷮 ��ȯ
	public int capacity() {
		return max;
	}
	
	// ���ÿ� �׿� �ִ� ������ �� ��ȯ
	public int size() {
		return ptr+(max-ptr2-1);
	}
	
	// ������ ����ִ��� Ȯ��
	public boolean isEmpty() {
		return ptr <= 0;
	}

	// ������ ���� á���� Ȯ��
	public boolean isFull() {
		return ptr >= max;
	}

	// ���� ���� ��� �����͸� �ٴ� ���� ����� ������ ���
	public void dump() {
		if(ptr <= 0 && ptr2 == max-1) {
			System.out.println("������ ������ϴ�");
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

