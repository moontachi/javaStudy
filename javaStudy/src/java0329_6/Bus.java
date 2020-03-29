package java0329_6;

public class Bus extends Car {
	public void run() {
		super.run(); // super를 사용하면 자식의 클래스에서 부모의 메소드 사용이 가능하다.
		System.out.println("Bus의 run 메소드");
	}
}
