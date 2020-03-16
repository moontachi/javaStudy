package java0316_1;

public class Exam_1 {

	public static void main(String[] args) {
		int [] iarray = new int[100];
		iarray[1] = 1;
		iarray[2] = 2;
		
		for(int i=0; i<iarray.length; i++) {
			iarray[i] = i+1;
		} // 배열안에 1~100까지 선언 
		
		
		int sum=0;
		for(int i=0; i<iarray.length; i++) {
			sum = sum + iarray[i];
		} // i값이 array.length 갯수 보다 작을떄까지 sum + iarray[i]값을 출력
		
		System.out.println(sum);
	}

}
