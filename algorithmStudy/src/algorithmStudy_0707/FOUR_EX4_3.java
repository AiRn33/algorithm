package algorithmStudy_0707;

public class FOUR_EX4_3 {

	private int max; 	// ť�� �뷮
	private int front;  // ù��° ��� Ŀ��
	private int rear;	// ������ ��� Ŀ��
	private int num;	// ���� ������ ��
	private int que[];  // ť ��ü
	
	// ���� �� ���� : ������ ������� ��
	public class EmptyInstackException extends RuntimeException{
		public EmptyInstackException() {	}
	}
		
	// ���� �� ���� : ������ ����á�� ��
	public class OverflowInStackException extends RuntimeException{
		public OverflowInStackException() {	}
	}
	
	public FOUR_EX4_3(int capacity) {
		
		num = front = rear = 0;
		max = capacity;
		try {
			que = new int[max];
		}catch(OutOfMemoryError e) {
			max = 0;
		}
	}
	
	// ��ť ������ �߰�
	public int enque(int x) throws OverflowInStackException{
		
		if(num >= max) {
			throw new OverflowInStackException();
		}
		
		que[rear++] = x;
		num++;
		if(rear == max) {
			rear = 0;
		}
		return x;
	}
	
	
	// ��ť �����͸� ����
	public int deque() throws EmptyInstackException{
		if(num <= 0) {
			throw new EmptyInstackException();
		}
		int x = que[front++];
		num--;
		if(front == max);{
			front = 0;
		}
		return x;
	}
	
	// ť���� �����͸� ��Ʈ (����Ʈ �����͸� �鿩�� ����)
	public int peek() throws EmptyInstackException{
		if(num <= 0) {
			throw new EmptyInstackException();
		}
		return que[front];
	}
	
	// ť���� x�� �˻��Ͽ� �ε���(ã�� ���ϸ� -1)�� ��ȯ
	public int indexOf(int x) {
		for(int i = 0; i < num; i++) {
			int idx = (i + front) % max;
			if(que[idx] == x) {
				return idx;
			}
		}
		return -1;
	}
	
	// ť�� ���
	public void clear() {
		num = front = rear = 0;
	}
	
	// ť�� �뷮�� ��ȯ
	public int capacity() {
		return max;
	}
	
	// ť�� �׿� �ִ� ������ ���� ��ȯ
	public int size() {
		return num;
	}
	
	// ť�� ��� �ִ��� Ȯ��
	public boolean isEmpty() {
		return num <= 0;
	}
	
	// ť�� ���� á���� Ȯ��
	 public boolean isFull() {
		 return num >= max;
	 }
	 
	 // ť ���� ��� �����͸� ����Ʈ �� ���� ������ ���
	 public void dump() {
		 if(num <= 0) {
			 System.out.println("ť�� ��� �ֽ��ϴ�");
		 }
		 else {
			 for(int i = 0; i < num; i++) {
				 System.out.println(que[(i + front) % max] + " ");			 
			}
			System.out.println(); 
		 }
	 }
}
