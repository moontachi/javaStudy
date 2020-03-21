package javasky;

public class 탈것 {
	private int total = 8;
	int now = 0;
	String str = null; // 초기화
	
	public void 확인() {
		System.out.println("==========================");
		System.out.println("현재 탑승인원"+now);
		
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
}


