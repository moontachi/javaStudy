package java0331_2;
//java8 이후 default 키워드 사용하여 메소드 구현 가능.
public interface Calculator {
	public int plus(int i, int j);
	public int multiple(int i, int j);
	
	default int exec(int i, int j) {
		return i + j;
	}
	
	public static int exec2(int i, int j) {
		return i * j;
	}
}
