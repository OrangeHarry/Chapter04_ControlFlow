package ch04_3_for;

public class ContinueExample {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) { // Ȧ��
				continue; // �ݻ��Ѵٴ� �ǹ̤����� Ȧ���϶��� �������� �����(continue) �ٽ� ���ǽ����� ���ư�
			}
			System.out.println(i);
		}
	}
}
//continue�� ���Ͱ� �ʿ��Ҷ� ����ϸ� �� ����.