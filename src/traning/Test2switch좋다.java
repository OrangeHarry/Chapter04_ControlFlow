package traning;

public class Test2switch좋다 {
	public static void main(String[] args) {
//        switch 문으로 바꾸기
//		int n = 24;
//		if (n >= 0 && n < 10) {
//			System.out.println(("0이상 10미만의 수"));
//		} else if (n >= 10 && n < 20) {
//			System.out.println("10이상 20미만의 수");
//		} else if (n >= 20 && n < 30) {
//			System.out.println("20이상 30미만의 수");
//		} else {
//			System.out.println("음수 or 30이상의 수");
//		}

		int n = (int) (Math.random() * 100); 
		System.out.println(n);
		int num = n / 10; // n이 몇십번대의 숫자라는걸 직관적으로 알려준다
		System.out.println(num);

		switch (num) {
		case 0:
			System.out.println("0이상 10 미만의 수");
			break;
		case 1:
			System.out.println("10이상 20미만의 수");
			break;
		case 2:
			System.out.println("20이상 30 미만의 수");
			break;
		default:
			System.out.println("30이상의 수");
		}
	}
}
