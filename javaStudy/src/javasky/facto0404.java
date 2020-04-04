package javasky;
//재귀 함수
public class facto0404 {

	public static void main(String[] args) {
//		int a = 6;
//		int sum = 1;
//		for(int i = 1; i < a+1; i++) {
//			sum *= i;
//		}
//		System.out.println(sum);
		
	
	
		System.out.println(pro(2));
	}
	
	public static int pro(int k) {
		if(k == 1) {
			return 1;
		}else{
			return k * pro(k-1);
		}
	}
}
