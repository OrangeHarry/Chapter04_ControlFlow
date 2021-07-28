package traning;

public class Test6 {
//	몫과 나머지를 출력하는 메소드를 만들고
//	실행하는 코드를 작성하시오
//	예) divOper(7,3);
//	콘솔출력 -> "목: 2, 나머지: 1"

	public static void diOper(int i, int j) {
		int result = i / j;
		int result2 = i % j;
//		System.out.println("목: " + result + ", 나머지: " + result2);
		System.out.printf("목: %d, 나머지: %d\n", result, result2);
	}

	public static void main(String[] args) {
		diOper(6, 2);

	}
}
//