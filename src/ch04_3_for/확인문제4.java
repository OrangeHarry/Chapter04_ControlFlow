package ch04_3_for;

public class Ȯ�ι���4 {
	public static void main(String[] args) {
		for (int x = 0; x <= 10; x++) {
//			System.out.println(x);
			for (int y = 0; y <= 10; y++) {
				if (4 * x + 5 * y == 60) {
					System.out.println(x + "," + y);
				}
			}
		}
	}
}
