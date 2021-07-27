package ch04_3_for;

public class ForPrintFrom1To10Example {
	public static void main(String[] args) {
//		sum = 1+2+3+4+5;

		int sum = 0;

		int i = 1;
		while (i <= 100) {
			sum += i;
			i++;
		}
		System.out.println(i);
		
//		for (int i = 1; i <= 100; i++) {
//			sum += i;
////			sum = sum + i; 위에꺼랑 같은거
////			 반복문 안에선 if나 switch, for, while 등을 다 쓸 수 있다.(근데 잘 안쓰지 이렇게는)
//		}
//		System.out.println("1~100의 합 = " + sum);
//
//		for (int i = 1; i <= 10; i++) {
//			System.out.println(i);
//		}
	}
}
