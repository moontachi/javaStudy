package question;

public class java_factorial {
	//재귀 함수를 이용한 factorial 함수 
	public static int factorial(int number) {
		if(number == 1) {
			return 1;
		}else {
			return number * factorial(number - 1);
		}
	}
	
		
	//반복문을 이용한 factorial 함수
	public static int factorialTwo(int number) {
		int sum = 1;
		for(int i = 2; i <= number; i++) {
			sum *= i;
		}
		return sum;
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println(factorial(5) + " " + "재귀함수를 이용한 팩토리얼");
		System.out.println(factorialTwo(5) + " " + "반복문을 이용한 팩토리얼");
	}

}
