package java0309_2;

public class Exam3 {

	public static void main(String[] args) {
		int b1 = (5 < 4) ? 50 : 40;  // 삼항연산자 ( ) <-괄호안이 참이라면  a :  b; a값출력, 아니면 b출력
		
		System.out.println(b1);
		
		int b2 = 0;
		if(5 > 4) {
			b2 = 50;
		}else {
			b2 = 40;
		}
		
		System.out.println(b2);
		
	}

}
