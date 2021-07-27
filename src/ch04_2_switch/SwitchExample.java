package ch04_2_switch;

public class SwitchExample {
	public static void main(String[] args) {
//		int score = 85;
//		char grade;
//		
//		if (score > 90) {
//			grade = 'A';
//		} else if (score >= 80 && score < 90) {
//			grade = 'B';
//		} else if (score >= 70 && score < 90) {
//			grade = 'C';
//		} else if (score >= 60 && score < 70) {
//			grade = 'D';
//		} else {
//			grade = 'F';
//		}
//		System.out.println("your grade is " + grade); 
//		int score = 92;
//		char grade = 0;

		int month = 3;
		switch (month) {
		case 12: //case는 범위가 아닌 정확한 값을 넣어주어야 한다.
		case 1://범위를 넣으려면 그 범위에 돌아올때 실행문을 넣어주면 된다. 간단해~
		case 2:
			System.out.println("겨울");
			break; //break가 없으면 그냥 밑에꺼까지 쭉 실행하는거야
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
			break;
		}
	}
}
//break가 없어도 잘돌아간다. 어떻게 흘러가는지를 아는게 중요하다