package traning;

public class Test7 {
//	�� ���� '��(-)�� ���밪'�� ����Ͽ� ����ϴ� �޼ҵ带 �ۼ�
//	�����ڵ� �ۼ�
//  �޼ҵ� �̸� : abs
	public static void main(String[] args) {
		abs(8, 3);
		abs(2, 6);
		abs(3, 3);
	}

	public static void abs(int i, int j) {
		if (i >= j) {
//			int result = i - j;
//			System.out.println("�� ���� ���� ���밪�� " + result);
			System.out.println("�� ���� ���� ���밪�� " + (i - j));
		} else {
			int result = j - i;
			System.out.println("�� ���� ���� ���밪�� " + result);
		}
	}
}
