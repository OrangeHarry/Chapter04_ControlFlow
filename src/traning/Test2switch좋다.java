package traning;

public class Test2switch���� {
	public static void main(String[] args) {
//        switch ������ �ٲٱ�
//		int n = 24;
//		if (n >= 0 && n < 10) {
//			System.out.println(("0�̻� 10�̸��� ��"));
//		} else if (n >= 10 && n < 20) {
//			System.out.println("10�̻� 20�̸��� ��");
//		} else if (n >= 20 && n < 30) {
//			System.out.println("20�̻� 30�̸��� ��");
//		} else {
//			System.out.println("���� or 30�̻��� ��");
//		}

		int n = (int) (Math.random() * 100); 
		System.out.println(n);
		int num = n / 10; // n�� ��ʹ����� ���ڶ�°� ���������� �˷��ش�
		System.out.println(num);

		switch (num) {
		case 0:
			System.out.println("0�̻� 10 �̸��� ��");
			break;
		case 1:
			System.out.println("10�̻� 20�̸��� ��");
			break;
		case 2:
			System.out.println("20�̻� 30 �̸��� ��");
			break;
		default:
			System.out.println("30�̻��� ��");
		}
	}
}
