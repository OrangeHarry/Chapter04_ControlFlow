package ch04_3_for;

public class 확인문제2 {
	public static void main(String[] args) {

		int sum3 = 0;

		for (int i = 0; i <= 100; i++) {
			if (i % 3 == 0) {
				sum3 = sum3 + i;
			}
		}
		System.out.println(sum3);
	}
}
