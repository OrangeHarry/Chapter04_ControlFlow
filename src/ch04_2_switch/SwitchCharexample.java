package ch04_2_switch;

public class SwitchCharexample {
	public static void main(String[] args) {
		char grade = 'b';

		switch (grade) {
		case 'A':
		case 'a':
			System.out.println("우수 회원입니다.");
			break;
		case 'B':
		case 'b':
			System.out.println("일반 회원입니다.");
			break;
		default:
			System.out.println("손님 입니다.");
//			어차피 마지막이라서 굳이 break;를 작성할 필요가 없다
		}
	}
}
