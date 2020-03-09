package java0302;


public class Casting {

	public static void main(String[] args) {
	
	     double a = 1.1;
	     double b = 1;
	     double b2 = (double) 2;
	     System.out.println(a);
	     System.out.println(b);
	     System.out.println(b2);
	     
//	     int c = 1.1;
	     double d = 1.1;
	     int e = (int) 1.1; // �ս��� ����� ������ ���������� �ٲ������.
	     System.out.println(d);
	     System.out.println(e);
	     
	     // 1 to String  ������ ���ڷ�
	     String f = Integer.toString(1000);
	     System.out.println(f); // .getClass() <- ������ Ÿ�� Ȯ�� 
	     
	   
	     String g = Double.toString(100.14432423423423);
	     System.out.println(g);
	}

}
