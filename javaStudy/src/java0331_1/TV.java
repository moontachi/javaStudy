package java0331_1;
//인터페이스
//추상클래스는 상태나 기능을 공유 할수 있다.abstract가 하나라도 있으면 추상 클래스. 추상클래스에서 메소드 구현 가능.
//인터페이스는 상태 또는 기능을 제공하는 역할만 한다. 구현 없이 형태만 제공. 구현은 상속받는 클래스에서 해야함.
public interface TV {
	public int MIN_VOLUME = 0;
	public int MAX_VOLUME = 100;
	
	
	
	public void turnOn();
	public void turnOff();
	public void changeVolume(int volume);
	public void changeChannel(int channel);
}
