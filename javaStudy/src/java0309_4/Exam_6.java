package java0309_4;
import java.util.Scanner;
public class Exam_6 {

	public static void main(String[] args) {
		int value = 0;
		Scanner scan = new Scanner(System.in); // 어디론가 부터 값을 입력 받고 싶을 때 System.in<-키보드
		
		do {
			// 반복할 문장들에 이부분에 넣는다.
			value = scan.nextInt(); // 정수값 입력받아서 벨류에 입력
			System.out.println("입력받은 값 : "+value);
			
		}while(value != 10);
		
		System.out.println("반복종료");

	}

}
