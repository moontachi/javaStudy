package java0329_5;

public class Truck extends Car {
	public Truck() {
	    super("람보르기니"); //부모의 생성자를 가르킴. Truck의 생성자가 호출 될 때 자동으로 부모의 생성자도 호출.
	    
		System.out.println("Truck의 기본 생성자 입니다.");
	}
}
