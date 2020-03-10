package java0310_1;

public class Exam_1 {

	public static void main(String[] args) {
		int total = 0;
		for(int i = 1; i <=100; i++) {  // for(초기화식; 조건식; 증감식)
//			if(i % 2 != 0) {
//				continue;
//			}
			total = total + i;
			if(i == 50) {
				break;
			}
		}
        System.out.println(total);
	}

}
