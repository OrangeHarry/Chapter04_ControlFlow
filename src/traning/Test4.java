package traning;

public class Test4 {
	public static void main(String[] args) {
//		1000���� �ڿ���(0����X)�߿��� 2�� ������� 7�� ����� ���� ���, (== 2��7�� �ּҰ����)
//		�� ������ ������ ���
//		while �� ���

		int num = 1;
		int sum = 0;

		while (num <= 1000) {
//			num++; //���⿡ ��ġ�ص� �� �ȴ�.
			if ((num % 2) == 0 && (num % 7) == 0) {
				System.out.println(num);
				sum = sum + num; // sum += num;
			}
			num++;
		}
		System.out.println("�� ���� = " + sum);
	}
}
