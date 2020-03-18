package java0318_1;

public class Exam_1 {

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car();
				//클래스선언,필드
		c1.name = "소방차";
		c1.number = 1234;
		
		c2.name = "구급차";
		c2.number = 1111;
		
		System.out.println(c1.name);
		System.out.println(c1.number);
		
		System.out.println(c2.name);
		System.out.println(c2.number);
	}

}
