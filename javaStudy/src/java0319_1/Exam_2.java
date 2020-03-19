package java0319_1;

public class Exam_2 {

	public static void main(String[] args) {
		Exam_1 exam = new Exam_1();
		exam.method1();
		exam.method2(30);
		exam.method3();
		int value = exam.method3();
		System.out.println("m3이 리턴한 값" + value);
		exam.method4(5, 10);
		int value2 = exam.method5(50);
		System.out.println("m5가 리턴한 값" + value2);
		

	}

}
