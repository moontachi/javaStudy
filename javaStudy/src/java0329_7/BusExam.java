package java0329_7;

public class BusExam {

	public static void main(String[] args) {
		Car c = new Bus();
		c.run();
//		c.ppangpppang(); <- Car(부모)타입으로 Bus(자식)을 가리킬 수 있지만, 이 경우 Car(부모)가 가지고 있는 내용만 사용 가능.
		Bus bus = (Bus)c; // 클래스 형변환
		bus.run();
		bus.ppangppang();
	}

}
