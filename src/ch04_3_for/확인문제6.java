package ch04_3_for;

public class Ȯ�ι���6 {
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			for (int j = 4; j >= 1; j--) {
				if (i < j) {
					System.out.print(" "); //�̰� print�� ������ �߰��� ��ĭ�� ����� ���� ����.
				} else {
					System.out.printf("%s" , "*");
				}
			}
			System.out.println();
		}
	}
}
//for��ø���϶� i�� �� j�� ���̶�� �����ϸ� ���ϴ�
//