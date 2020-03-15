package javasky;

public class array_0315_05 {

	public static void main(String[] args) {
		int arr[] = {12,41,52,64,63,21,94,67,91,59};
		int copy[] = new int[10];
		int max=0;
		int maxIndex = 0;
		
		 for(int i=0; i<10; i++) {
			 max=0;
			 maxIndex=0;
			 for(int j=0; j<10; j++ ) {
				 if( max < arr[j] ) {
					 max = arr[j];
					 maxIndex = j;
				 }
				 copy[i]=max;
			 }
			 arr[maxIndex] = 0;
		 }
		 
		 System.out.println("\n======================");
		  for(int i=0; i<10; i++) {
			  System.out.print(copy[i]+" ");
		  }
		 
		 
		 		
	}

}
