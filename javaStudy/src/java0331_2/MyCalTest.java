package java0331_2;

public class MyCalTest {

	public static void main(String[] args) {
		Calculator cal = new MyCal();
		cal.plus(3, 4);
		int i = cal.exec(5, 6);
		System.out.println(i);
				
		int j = Calculator.exec2(2, 3);
		System.out.println(j);
	}

}
