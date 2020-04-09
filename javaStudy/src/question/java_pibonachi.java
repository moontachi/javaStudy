package question;

import java.util.Scanner;

public class java_pibonachi {
    //반복문을 사용한 피보나치 수열.
	public static long pibonachi(int number) {
		long i = 1;
		long j = 1;
		long sum = 0;
		if(number == 1) {
			return i;
		}else if(number == 2) {
			return j;
		}else {
			for(int k = 2; k < number; k++) {
				sum = i + j;
				i = j;
				j = sum;
			}
		}
		return sum;
	}
	// 재귀함수를 이용한 피보나치 수열
	public static int pibonachiTwo(int number) {
		if(number == 1) {
			return 1;
		}else if(number == 2) {
			return 1;
		}else {
			return pibonachiTwo(number - 1) + pibonachiTwo(number - 2);
			
		}
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("무작위 숫자를 입력하면 무작위숫자 위치의 피보나치 값이 나옵니다. 값을 입력하시오.");
		int n = 0;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		    
			System.out.println(n +"번째 피보나치 값은" + pibonachi(n)+ "입니다." + "반복문 사용");
			System.out.println(n +"번째 피보나치 값은" + pibonachiTwo(n)+ "입니다." + "재귀함수 사용");
	}

}
