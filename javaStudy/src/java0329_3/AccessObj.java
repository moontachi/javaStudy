package java0329_3;
//접근제한자 
public class AccessObj {
	public int p = 3; // public : 모든 접근을 허용, 가장 넓은 의미.
	protected int p2 = 4; // protected : 같은 패키지인 경우 접근 허용, 다른 패키지라도 상속을 받은 경우 접근 허용.
	int p3 = 2; // default 접근지정자 : 아무것도 쓰지 않은 경우 자기 자신과 같은 패키지 내에서 접근 허용.
	private int p4 = 5; // private : 자기 자신만 접근 가능
	
}
