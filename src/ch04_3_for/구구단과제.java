package ch04_3_for;

public class �����ܰ��� {
	public static void main(String[] args) {
		for (int i = 2; i < 10; i++) {
			System.out.println("[" + i + "��]");
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d X %d = %d\n", i, j, i * j);
			}
			System.out.println();
		}
	}
}
//for(int i = 0; i < 100; i++) { �̰� for�� �⺻ ���̴ϱ� �ظ��ϸ� �ٲ������� �������!!!!(int i=0;���� ����!!)
//	
//}