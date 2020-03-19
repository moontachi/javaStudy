package java0319_1;

public class Exam_1 {
	//public 리턴 타입  메소드명 (매개변수 등){//구현}
	
	public void method1() {
		System.out.println("m1이 실행됨");
	}
	
	public void method2(int x) {
		System.out.println(x + "를 이용한 m2 실행");
	}
	
	public int method3() {
		System.out.println("m3 실행");
		return 10;
	}
	
	public void method4(int x, int y) {
		System.out.println(x + y + "m4 실행");
	}
	
	public int method5(int y) {
		System.out.println(y + "m5실행");
		return y*2;
	}

}
