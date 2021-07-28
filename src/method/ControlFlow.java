package method;

public class ControlFlow {
	public static void main(String[] args) {
//		"오버로딩" = 과적하다
//		
		System.out.println(add(2, 3));
	}

	public static int add(int i, int j) {
		return i + j;
	}

	private static void add(double d, double e) {// 리턴타입이 없는 거는 void형 메소드
		System.out.println(d + e);

	}
//	private static void add(int i, int j) { //자료형(타입)이 같은 함수는 변수까지 같으면 그냥 같은 함수이다. 리턴형식과 관계없이!!  
//		System.out.println(i + j);
//	}
}
