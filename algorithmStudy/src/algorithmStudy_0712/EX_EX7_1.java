package algorithmStudy_0712;

public class EX_EX7_1 {

	private int max;
	private int num;
	private int set[];
	
	// 생성자
	public EX_EX7_1(int capacity) {

		num = 0;
		max = capacity;
		
		try {
			set = new int[max];
		}catch(OutOfMemoryError e) {
			max = 0;
		}
	}
	
	// 집합의 최대 개수
	public int capacity() {
		
		return max;
	}
	
	// 집합의 요소 개수
	public int size() {
		
		return num;
	}
	
	// 집합에서  n을 검색 (index 반환)
	public int indexOf(int n) {
		for(int i = 0; i < num; i++) {
			if(set[i] == n) {
				return i;
			}
		}
		return -1;
	}
	
	// 집합에 n이 있는지 확인
	public boolean contains(int n) {
		return (indexOf(n) != -1) ? true : false;
	}
	
	// 집합에 n을 추가
	public boolean add(int n) {
		if(num >= max || contains(n) == true) {
			return false;
		}else {
			set[num++] = n;
			return true;
		}
	}
	
	// 집합에서 n을 삭제합니다
	public boolean remove(int n) {
		int idx;
		
		if(num <= 0 || (idx = indexOf(n)) == -1) {
			return false;
		}else {
			set[idx] = set[--num];
			return true;
		}
	}
	
	// 집합 s에 복사합니다
	public void copyTo(EX_EX7_1 s) {
		int n = (s.max < num) ? s.max : num; // 복사할 요소 개수
		for(int i = 0; i < n; i++) {
			s.set[i] = set[i];
		}
		s.num = n;
	}
	
	// 집합 s를 복사합니다
	public void copyFrom(EX_EX7_1 s) {
		int n = ( max < s.num) ? max : s.num;
		for(int i = 0; i < n; i++) {
			set[i] = s.set[i];
		}
		num = n;
	}
	
	// 집합 s와 같은지를 확인합니다
	public boolean equalTo(EX_EX7_1 s) {
		
		if(num != s.num) { // 요소 개수가 같지 않으면 집합 요소도 같지 않다
			return false;
		}
		
		for(int i = 0; i < num; i++) {
			int j = 0;
			for(; j < s.num; j++) {
				if(set[i] == s.set[j]) {
					break;
				}
			}
			if(j == s.num) {
				return false;
			}
		}
		
		return true;
	}
	
	// 집합 s1과 s2의 합집합을 복사합니다
	public void unionOf(EX_EX7_1 s1, EX_EX7_1 s2) {
		copyFrom(s1);
		for(int i = 0; i < s2.num; i++) {
			add(s2.set[i]);
		}
	}
	
	// { a b c } 형식의 문자열로 표현을 바꿉니다
	public String toString() {
		
		StringBuffer temp = new StringBuffer("{");
		for(int i = 0; i < num; i++) {
			temp.append(set[i] + " ");
		}
		temp.append("}");
		
		return temp.toString();
	}
	
	public static void main(String[] args) {
		
		EX_EX7_1 s1 = new EX_EX7_1(20);
		EX_EX7_1 s2 = new EX_EX7_1(20);
		EX_EX7_1 s3 = new EX_EX7_1(20);
		
		s1.add(10);
		s1.add(15);
		s1.add(20);
		s1.add(25); // {10, 15, 20, 25}
		
		s1.copyTo(s2);
		s2.add(12); // {10, 15, 20, 25, 12}
		s2.remove(25); // {10, 15, 20, 12}
		
		s3.copyFrom(s2);
		
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
		System.out.println("s3 = " + s3);
		
		System.out.println("집합 s1에 25는 " + (s1.contains(25) ? "포함됩니다" : "포함되지 않습니다"));
		System.out.println("집합 s2에 25는 " + (s2.contains(25) ? "포함됩니다" : "포함되지 않습니다"));
		System.out.println("집합 s3에 25는 " + (s3.contains(25) ? "포함됩니다" : "포함되지 않습니다"));
		
		s3.unionOf(s1, s2);
		
		System.out.println("집합 s1 과 s2의 합집합은 " + s3 + "입니다");
	}
}
