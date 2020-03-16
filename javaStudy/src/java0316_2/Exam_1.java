package java0316_2;

public class Exam_1 {

	public static void main(String[] args) {
		int[] iarray = {10,20,30,40,50};
		
		for(int i=0; i< iarray.length; i++) {
			int value = iarray[i];
			System.out.println(value);
		}
		//for each -> for(타입 값을 받아줄 변수명 : 출력하고 싶은 자료구조) 문법 간결 / 값을 알아서 담아줌 
		for(int value:iarray) {
			System.out.println(value);
		}

	}

}
