package java0329_2;

public class BusExam {

	public static void main(String[] args) {
		Bus bus = new Bus();
		bus.run();
		bus.ppangppang();
		
		
		Car car = new Car();
		car.run();
//		car.ppangppang(); <-부모클래스는 자식이 가지고 있는 것을 사용 할 수 없다.
	}

}
