package javasky;

public class 몬스터 {

	public static void main(String[] args) {
		오버로드 오버로드1 = new 오버로드();
		오버로드 오버로드2 = new 오버로드();
	
		오버로드1.setTotal(150);
		
		오버로드1.setTotal(200);
		
		
		오버로드1.저글링_탑승(9);
		오버로드1.히드라_탑승(5);
		오버로드1.확인();
		
		드랍쉽 드랍쉽1 = new 드랍쉽();
		드랍쉽1.마린_탑승(9);
		드랍쉽1.벌쳐_탑승(5);
		드랍쉽1.확인();
		System.out.println(드랍쉽1.getTotal());
		
	}

}
