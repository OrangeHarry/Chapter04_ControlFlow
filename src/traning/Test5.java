package traning;

public class Test5 {
	public static void main(String[] args) {
//		�ڿ��� 1���� ����.. ��� Ȧ���� ���ض�.. �� ���� ����(���� ������ ��) 1000�� �Ѿ����??.. �׸��� 1000�� �Ѿ ���� ��?? ���
//		while�� ���

		int sum = 0;
		int num = 1;

		while (true) {
			// Ȧ�� ����
			if (num % 2 != 0) {
				sum = sum + num; // sum += num;
			}
			// ��>1000����
			if (sum > 1000) {
				System.out.println(num + "�� ���� �� 1000�� �ѽ��ϴ�.");
				System.out.println("1000�� �Ѿ ���� ���� " + sum);
				break; // ***�ݺ����� ���������� �ž�!!!
			}
			num++;
		}
	}
}

//		�� ����� ����...
//		while (true) {
//			num++;
//			System.out.println(num);
//			sum = sum + num;
//			if (sum > 1000) {
//				break;
//			}
//		}


