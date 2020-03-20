package java0320_1;

public class Exam_1 {
	int globalScope = 10;
	static int staticVal = 7;
	
	
	
	public void scopeTest(int value) {
		int localScope = 20;
		
		System.out.println(globalScope);
		System.out.println(localScope);
		System.out.println(value);
	}
	
	public void scopeTest2(int value2) {
		System.out.println(globalScope);
//		System.out.println(localScope);
//		System.out.println(value);
		System.out.println(value2);
	}
	
	
	public static void main(String[] args) {
//		System.out.println(globalScope);
//		System.out.println(localScope);
//		System.out.println(value);
		System.out.println(staticVal);
		
		Exam_1 v1 = new Exam_1();
		System.out.println(v1.globalScope);
		Exam_1 v2 = new Exam_1();
		v1.globalScope =300;
		v2.globalScope =20;
		System.out.println(v1.globalScope);
		System.out.println(v2.globalScope);
		v1.staticVal = 50;
		v2.staticVal = 200;
		System.out.println(v1.staticVal);
		System.out.println(v2.staticVal); // 값을 저장 가능한 공간이 한개
		System.out.println(Exam_1.staticVal);
	}

}
