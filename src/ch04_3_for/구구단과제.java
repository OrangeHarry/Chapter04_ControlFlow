package ch04_3_for;

public class 구구단과제 {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			System.out.println("[" + i + "단]");
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d X %d = %d\n", i, j, i * j);
			}
			System.out.println();
		}
	}
}
