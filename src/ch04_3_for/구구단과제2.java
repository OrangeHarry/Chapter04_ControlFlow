package ch04_3_for;

public class �����ܰ���2 {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			System.out.printf("[%d��]\t", i);
		}
		System.out.println();//�ٳ����� �����뵵
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("%dX%d=%d\t", j, i, j * i); //����� ���ٷ� ���� ����� �����ϴϱ� 1X2, 2X1, 3X1...�� �߸��� ���η� ���� ������ �װ� ������ ó�� ���̰� �ϱ�(�߸�)
			}
			System.out.println();
		}

	}
}
