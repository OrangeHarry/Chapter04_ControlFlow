package traning;

public class Test5 {
	public static void main(String[] args) {
//		자연수 1부터 시작.. 모든 홀수를 더해라.. 그 합이 언제(몇을 더했을 때) 1000을 넘어서는지??.. 그리고 1000을 넘어선 값은 얼마?? 출력
//		while문 사용

		int sum = 0;
		int num = 1;

		while (true) {
			// 홀수 조건
			if (num % 2 != 0) {
				sum = sum + num; // sum += num;
			}
			// 합>1000조건
			if (sum > 1000) {
				System.out.println(num + "을 더할 때 1000을 넘습니다.");
				System.out.println("1000을 넘어선 합의 값은 " + sum);
				break; // ***반복문을 빠져나가는 거야!!!
			}
			num++;
		}
	}
}

//		내 고민의 흔적...
//		while (true) {
//			num++;
//			System.out.println(num);
//			sum = sum + num;
//			if (sum > 1000) {
//				break;
//			}
//		}


