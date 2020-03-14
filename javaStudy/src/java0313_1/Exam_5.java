package java0313_1;

public class Exam_5 {

	public static void main(String[] args) {
			for(int i=4; i>=1; i--) {
				for(int j=4; j>=i; j--) {
					System.out.print("1");
				}
				for(int k=1; k<=i*2-1; k++) {
					System.out.print("*");
				}
				System.out.println();
			}
			for(int a=1; a<=3; a++) {
				for(int b=3; b>=a; b--) {
					System.out.print("1");
				}
				for(int c=0; c<=a*2; c++) {
					System.out.print("*");
				}
				
				System.out.println();
			}

	}

}
