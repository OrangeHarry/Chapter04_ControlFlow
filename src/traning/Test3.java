package traning;

public class Test3 {
	public static void main(String[] args) {
//		while(), do~while(); ���
//		1~100 ����ϰ� �Ųٷ� 100~1���� ����ϴ� ������ ������

		int num = 1;
		while (num <= 100) {
			System.out.println(num++); // num++ == num += +1?? ������??;
//			num++;
//			if (num == 101) {   //���� �ʿ䰡 ����
//				break;
//			}
		}
		System.out.println();
		do {
			System.out.println(--num);
//			System.out.println(num--); num-- �� �ڿ� �پ��ִ°Ŵϱ� ��� ������ ���� �Ŀ� ó���� �Ǽ� 101�� ������ �Ǵ°Ŵ� 
//			System.out.println(num - 1);
//			num--;
		} while (num > 1);

	}
}
