package java0309;


public class Exam1 {

	public static void main(String[] args) {
		int x = 50;
		int y = 50;
		
		if(x < y) {
			System.out.println("x는 y보다 작습니다.");
			System.out.println("test1");
		}
		
		if(x < y)
			System.out.println("x는y와 같습니다.");
			System.out.println("test2");
			System.out.println("test3");
			
		if(x == y){
			System.out.println("x는 y와 같습니다.");
		}else if(x < y){
			System.out.println("x는 y보다 작습니다.");
		}else{
			System.out.println("x는 y보다 큽니다.");
		}

	}

}
