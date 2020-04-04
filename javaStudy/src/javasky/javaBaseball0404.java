package javasky;

import java.util.Scanner;

public class javaBaseball0404 {

	public static void main(String[] args) {
		 int[] qu = {4,8,6,3,1};
		 int n = 0;
		 System.out.println(qu.length + "자리만큼 숫자를 입력하세요.");
		 Scanner s = new Scanner(System.in);
		 
		 int ballCount = 0;
		 int sCount = 0 ;
			
		 while(sCount != qu.length){
			 
			 n = s.nextInt();
		
			 //num 배열안에 값 담기  , Math.pow 제곱 
			 int[] num = new int[qu.length];
			   for(int i = 0; i < qu.length; i++) {
				  num[i] = (int) (n / Math.pow(10, qu.length-i-1));
				  n = n % (int)Math.pow(10, qu.length-i-1);
			   }
//					num[0] = (n / 100);
//					n = n % 100;				
//					
//					num[1] = (n / 10);
//					n = n % 10;
//					
//					num[2] = (n / 1);
				ballCount = 0;
				sCount = 0 ;
				for(int i = 0; i < num.length; i++) {
					for(int j = 0; j < qu.length; j++) {
						
					  if(num[i] == qu[j]) {
						  if(i == j) {
							  sCount++;
						  }else {
							  ballCount++;
						  }
					  	}
					}
				}
				System.out.println(ballCount);
				System.out.println(sCount);
			 }
			 System.out.println("정답 입니다.");
		}

}
