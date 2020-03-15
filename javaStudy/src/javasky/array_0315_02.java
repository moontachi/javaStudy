package javasky;

public class array_0315_02 {

	public static void main(String[] args) {
		int arr[] = {12,41,52,64,63,21,34,67,98,99};
		int copy[] = new int[10];
		int max=0;
		 for(int i=0; i<10; i++) {
			 System.out.print(arr[i]+" ");
			 
		 }
		 System.out.println();
		 for(int j=9; j>=0; j--) {
			 copy[j] = arr[9-j];
			 System.out.print(copy[j]+" ");
			 
		 }
		 
	}

}
