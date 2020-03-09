package java0309_4;
import java.util.Scanner;
public class Exam_7 {

	public static void main(String[] args) {
	    
		Scanner scan = new Scanner(System.in);
		
		int value = 0;
		System.out.println("문제의 답을 구하시오 \n내년에 91년생은 몇살이 됩니까? ");
		do {
			value = scan.nextInt();
			System.out.println("입력하신 값  :"  +value);
			if(value !=31)
				System.out.println("틀렸습니다. 바보 김하늘");
		}while(value != 31);
		System.out.println("정답입니다.");
	}

}
