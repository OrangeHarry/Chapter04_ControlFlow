package ch04_3_for;

public class ForSumFrom1To100Example {
	public static void main(String[] args) {
		int sum = 0;

		for (int i = 0; i <= 100; i++) {
			sum = sum + i;
//			sum += i;
		}
		System.out.println("1~100�� ���� = " + sum);
	}
}
