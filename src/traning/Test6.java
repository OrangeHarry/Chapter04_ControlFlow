package traning;

public class Test6 {
//	��� �������� ����ϴ� �޼ҵ带 �����
//	�����ϴ� �ڵ带 �ۼ��Ͻÿ�
//	��) divOper(7,3);
//	�ܼ���� -> "��: 2, ������: 1"

	public static void diOper(int i, int j) {
		int result = i / j;
		int result2 = i % j;
//		System.out.println("��: " + result + ", ������: " + result2);
		System.out.printf("��: %d, ������: %d\n", result, result2);
	}

	public static void main(String[] args) {
		diOper(6, 2);

	}
}
//