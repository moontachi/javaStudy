package java0309_4;

public class Exam_5 {
	
	public static void main(String[] args) {
//		int i = 0;
//		
//		while(i<10) {
//			System.out.println(i);
//			i++; // i=i+1
//		}
		
		int total = 0;
		int i = 1;
		while(i<=100) {
			total = total + i;
			i++;
			
		}
		
		System.out.println(total);
		
		int a = 0;
		while(a<100) {
			if(a % 3 <= 0)
				System.out.println(a);
			a++;
		}
		

	
	}

}
