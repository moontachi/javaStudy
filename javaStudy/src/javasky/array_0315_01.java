package javasky;

public class array_0315_01 {

	public static void main(String[] args) {
		int arr[] = {12,41,52,64,63,21,34,67,98,99};
		int copy[] = new int[10];
	     for(int i=0; i<10; i++) {
	    	 System.out.print(arr[i]+" ");
	    	 //arr 출력
	    	 
	     }
	     System.out.println();
//	     copy[0] = arr[9];
//	     copy[1] = arr[8];
//	     copy[2] = arr[7];'
//	     copy[3] = arr[6];
//	     copy[4] = arr[5];
//	     copy[5] = arr[4];
//	     copy[6] = arr[3];
//	     copy[7] = arr[2];
//	     copy[8] = arr[1];
//	     copy[9] = arr[0];
	     //copy 입력
	     for(int j=0; j<10; j++){
	    	 copy[j] = arr[9-j];
	     }
	     
	     
	     //copy 출력
	     for(int j=0; j<10; j++){
	    	 System.out.print(copy[j]+" ");
	     }
	     System.out.println();
	     for(int k=0; k<10; k++) {
	    	 System.out.print(arr[9-k]+" ");
	     }
	     
	}

}
