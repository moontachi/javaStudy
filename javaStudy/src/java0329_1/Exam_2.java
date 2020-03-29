package java0329_1;

public class Exam_2 {
//생성자, 생성자 오버로딩
	public static void main(String[] args) {
		Exam_1 c1 = new Exam_1("람보르기니");
		Exam_1 c2 = new Exam_1("포르쉐");
		Exam_1 c3 = new Exam_1("bmw", 1234);
		Exam_1 c4 = new Exam_1();
		
		System.out.println(c1.name);
		System.out.println(c2.name);
		System.out.println(c3.name + c3.number);
		System.out.println(c4.name + c4.number);
		

	}

}
