package javasky;

public class 오버로드 extends 탈것{
    
	public void 저글링_탑승(int x) {
		     int 탑승후인원 = x+now;
		      str = "저글링";
		    this.탑승후(탑승후인원);
		    //this 자기 자신을 부를 때 
	}
	
	
	public void 히드라_탑승(int x) {
		int 탑승후인원 = (x*2)+now;
		str = "히드라";
	    탑승후(탑승후인원);
	}
	
	
	
	
	public void 탑승후 (int total) {
		
	    if( this.getTotal() >= total  ) {
	   	 now = total;
	   	 System.out.println("현재 탑승칸수"+ now);
	    }else {
	   	 if(str.equals("저글링")) {
	   		 System.out.println("저글링은 8마리를 초과하여 탈 수 없습니다.");
	   	 }else if(str.equals("히드라")) {
	   		 System.out.println("히드라는 4마리를 초과하여 탈 수 없습니다.");
	   	 }else {
	   		 System.out.println("잘 못 된 값 입니다.");
	   	 }
	   	 
	   	 
    	}
	    
	}
	public void 확인() {
		System.out.println("==========================");
		System.out.println("오버로드의 현재 탑승인원"+now);
		
	}
}
