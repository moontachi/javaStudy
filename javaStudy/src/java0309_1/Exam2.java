package java0309_1;

public class Exam2 {

	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;
		
		System.out.println(b1 && b2); // &&<-두개다 맞아야 트루 출력
		System.out.println(b1 && b3);
		System.out.println(b1 || b2); // ||<-둘중 하나만 맞아도 트루 출력
		System.out.println(b1 || b3);
		System.out.println(b2 || b2);
		
		int score = 88;
		if(score <= 100 &&  score >= 70) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
		
		System.out.println(b2 ^ b2); // 서로반대 일때만 트루+펄스  / 펄스+트루 ->트루 출력
		System.out.println(b1 ^ b2);
		System.out.println(b2 ^ b3);
		System.out.println(!b1); // !<-연산자 반대로 출력 트루일때 펄스 ,펄스일때 트루
		System.out.println(!b2);

	}

}
