package method;

public class ControlFlow {
	public static void main(String[] args) {
//		"�����ε�" = �����ϴ�
//		
		System.out.println(add(2, 3));
	}

	public static int add(int i, int j) {
		return i + j;
	}

	private static void add(double d, double e) {// ����Ÿ���� ���� �Ŵ� void�� �޼ҵ�
		System.out.println(d + e);

	}
//	private static void add(int i, int j) { //�ڷ���(Ÿ��)�� ���� �Լ��� �������� ������ �׳� ���� �Լ��̴�. �������İ� �������!!  
//		System.out.println(i + j);
//	}
}
