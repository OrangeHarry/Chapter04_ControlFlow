package traning;

public class Test7 {
//	두 수의 '차(-)의 절대값'을 계산하여 출력하는 메소드를 작성
//	실행코드 작성
//  메소드 이름 : abs
	public static void main(String[] args) {
		abs(8, 3);
		abs(2, 6);
		abs(3, 3);
	}

	public static void abs(int i, int j) {
		if (i >= j) {
//			int result = i - j;
//			System.out.println("두 수의 차의 절대값은 " + result);
			System.out.println("두 수의 차의 절대값은 " + (i - j));
		} else {
			int result = j - i;
			System.out.println("두 수의 차의 절대값은 " + result);
		}
	}
}
