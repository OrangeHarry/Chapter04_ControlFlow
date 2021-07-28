package traning;

public class Test3 {
	public static void main(String[] args) {
//		while(), do~while(); 사용
//		1~100 출력하고 거꾸로 100~1까지 출력하는 구문을 만들자

		int num = 1;
		while (num <= 100) {
			System.out.println(num++); // num++ == num += +1?? 뭐였지??;
//			num++;
//			if (num == 101) {   //딱히 필요가 없어
//				break;
//			}
		}
		System.out.println();
		do {
			System.out.println(--num);
//			System.out.println(num--); num-- 가 뒤에 붙어있는거니깐 모든 연산이 끝난 후에 처리가 되서 101이 찍히게 되는거다 
//			System.out.println(num - 1);
//			num--;
		} while (num > 1);

	}
}
