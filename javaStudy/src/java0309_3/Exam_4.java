package java0309_3;
//switch문
public class Exam_4 {

	public static void main(String[] args) {
		//switch, case, default, break
		
		int value = 3;
		
		switch(value) {
		case 1:
			System.out.println("1"); 
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		default :
			System.out.println("그 외 다른숫자");
		} // break 없으면 해당케이스포함 뒤에것도 전부 출력
       String str = "a"; // java 7 이상부터 문자도 조건에 입력 가능
    		   switch(str) {
    		   case "a":
    			   System.out.println("a");
    			   break;
    		   case "b":
    			   System.out.println("b");
    		   }
	}
	

}
