package java0329_1;
//생성자 , this, 생성자 오버로딩
public class Exam_1 {
	//타입 필드명
	String name;
	int number;
	
	public Exam_1(String name) {
		this.name = name;
		//this <- 나의 구성 요소. 내필드 name 에다가 지금들어온 name을 넣어주세요.
		//객체 자신을 참조하는 키워드.
		//변수명은 직관적으로 설정.
	}
	
	public Exam_1() {
//		this.name = "이름없음";
//		this.number = 0;
		this("이름없음",0); // 자신의 생성자를 호출 public Exam_1(String name, int number)
	}
	
	public Exam_1(String name, int number) {
		this.name = name;
		this.number = number;
	}

}
