package java0331_2;

public class MyCal implements Calculator {

	@Override
	public int plus(int i, int j) {
		return i + j;
	}

	@Override
	public int multiple(int i, int j) {
		return i * j;
	}

}
