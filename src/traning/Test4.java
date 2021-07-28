package traning;

public class Test4 {
	public static void main(String[] args) {
//		1000이하 자연수(0포함X)중에서 2의 배수이자 7의 배수인 수를 출력, (== 2와7의 최소공배수)
//		그 수들의 총합을 출력
//		while 문 사용

		int num = 1;
		int sum = 0;

		while (num <= 1000) {
//			num++; //여기에 위치해도 잘 된다.
			if ((num % 2) == 0 && (num % 7) == 0) {
				System.out.println(num);
				sum = sum + num; // sum += num;
			}
			num++;
		}
		System.out.println("총 합은 = " + sum);
	}
}
