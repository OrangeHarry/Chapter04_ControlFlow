package ch04_3_for;

public class �����ܰ���2 {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			System.out.print("[" + i + "��]\t"); //�ƿ� �ϳ��� ���� ���� ����
		}
		System.out.println();
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j <= 9; j++) { // i�� 1�̰� j�� �ٲ�鼭 ��µǸ� 1x2, 2X1�� ���η� ��µǴϱ� �������� �����°�ó�� ���δ�(�ణ �߸ŷ� ����� �����̳�)
				System.out.printf("%dX%d=%d\t", j, i, j * i);
			}
			System.out.println(); // �갡 �־�� ������ ���� ��������
		}
	}
}
