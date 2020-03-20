package java0320_1;

public class Exam_2 {
	public static final String MALE="MALE";
	public static final String FEMALE="FEMALE";
	public static void main(String[] args) {
		String gender1;
		gender1 = Exam_2.MALE;
		gender1 = Exam_2.FEMALE;
		
		gender1 = "boy";
		
		Gender gender2;
		gender2 = Gender.MALE;
		gender2 = Gender.FEMALE;
		
		 System.out.println(Gender.FEMALE);
	}

}
enum Gender{
	MALE,FEMALE; //특정 값만 가져다 사용해야 한다면 열거형을 가져다 사용하는 것이 좋다.
}