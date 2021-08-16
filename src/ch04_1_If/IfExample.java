package ch04_1_If;

public class IfExample {
	public static void main(String[] args) {
		int score = 88;
		char grade;
		if (score > 90) {
			grade = 'A';
		} else {
			grade = 'B';
		}//오직 2가지 경우일때만 이렇게 쓴다
		System.out.println("your grade is " + grade);
//		char grade = (score > 90) ? 'A' : 'B'; 삼항연산자랑 같은말이네
	}
}
