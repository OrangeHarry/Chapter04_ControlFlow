package ch04_3_for;

public class Ȯ�ι���5 {
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) { // ũ�� ���̱� ������ j <= i �� �� �����Ѵ�.(�ε�ȣ ���������� Ȯ��)!!
				System.out.print("*");
				if (j == i) {
					System.out.println();
				}
			}
		}
	}
}
