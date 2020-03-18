package java0318_1;

public class Exam_3 {

	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = "hello"; //  hello라는 인스턴스가 상수에 저장 된다 str1/str2는 같은 인스턴스를 참조 하고 있다.
		
		String str3 =  new String("hello");
		String str4 =  new String("hello"); // new 인스턴스를 만들게되면 상수영역에 있는 것을 참조 하지 않는다.
											// 각각 다른 인스턴스를 만들어서 참조
		
		if(str1 == str2) {
			System.out.println("str1 과 str2는 같은 레퍼런스 입니다.");
		}
		
		
		
		if(str1 == str3) {
			System.out.println("str1 과 st"
					+ "r3는 같은 레퍼런스 입니다.");
		}else {
			System.out.println("str1 과 str3는 다른 레퍼런스 입니다.");
		}
		
		
		if(str3 == str4) {
			System.out.println("str3 과 str4는 같은 레퍼런스 입니다.");
		}else {
			System.out.println("str3 과 str4는 다른 레퍼런스 입니다.");
		}
		
		System.out.println(str1);
		
		System.out.println(str1.substring(3));// 세번째 부터 잘라서 보여주는 명령어
		
		System.out.println(str1); //String 한번 만들어진 내부의 값이 변하지 않는다.
		
		System.out.println(str3);
		
		System.out.println(str3.substring(2));
		
		if(str4.equals("Hello")) {
			System.out.println("str4는 hello와 같습니다.");
		} else {
			System.out.println("str4는 Hello와 다릅니다."); //.equals <-문자열이 같은지 확인 하는 명령어.
		}
	}

}
