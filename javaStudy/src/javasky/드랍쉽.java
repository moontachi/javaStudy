package javasky;

public class 드랍쉽 extends 탈것 {
//extends [상속 확장] 탈것의 개념 을 드랍쉽으로 상속
	public void 마린_탑승(int x) {
		int 탑승후인원 = x + now;
		str = "마린";
		this.탑승후(탑승후인원);
	}

	public void 벌쳐_탑승(int x) {
		int 탑승후인원 = (x * 2) + now;
		str = "벌쳐";
		탑승후(탑승후인원);
	}

	public void 탑승후(int total) {

		if (this.getTotal() >= total) {
			now = total;
			System.out.println("현재 탑승칸수" + now);
		} else {
			if (str.equals("마린")) {
				System.out.println("마린은 8마리를 초과하여 탈 수 없습니다.");
			} else if (str.equals("벌쳐")) {
				System.out.println("벌쳐는 4마리를 초과하여 탈 수 없습니다.");
			} else {
				System.out.println("잘 못 된 값 입니다.");
			}

		}

	}
}