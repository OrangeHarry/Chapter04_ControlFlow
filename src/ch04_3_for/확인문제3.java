package ch04_3_for;

public class Ȯ�ι���3 {
	public static void main(String[] args) {
//		int num1 = (int) (Math.random() * 6) + 1;
//		int num2 = (int) (Math.random() * 6) + 1;
//		System.out.println(num1);
//		System.out.println(num2);

		while (true) {
			int num1 = (int) (Math.random() * 6) + 1;
			int num2 = (int) (Math.random() * 6) + 1;
			System.out.println(num1 + num2);
			if (num1 + num2 == 5) {
				break;
			}
		}
	}
}
