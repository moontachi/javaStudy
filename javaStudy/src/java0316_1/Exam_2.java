package java0316_1;

public class Exam_2 {

	public static void main(String[] args) {
		//2차원 배열
		int[][] array1 = new int[3][4];
		array1[0][1] = 10;
		
		int[][] array2 = new int[3][];
		array2[0] = new int[1];
		array2[0][0] = 10;
		
		int[][] array3 = {{1},{1,2},{1,2,3}};
		
		System.out.println(array3[0][0]);
		System.out.println(array3[1][1]);
		System.out.println(array3[1][0]);
		System.out.println(array3[2][2]);
	}

}
