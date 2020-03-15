package javasky;

public class array_0315_03 {

	public static void main(String[] args) {
		int arr[] = {12,41,52,64,63,21,94,67,91,59};
//		int copy[] = new int[10];
		int max=0;
		int min=10000;
		 for(int i=0; i<10; i++) {
			 System.out.print(arr[i]+" ");
			 
			 if( max<=arr[i] ) {
				 max=arr[i];
			 }
			 
			 
			 
			 if(min>=arr[i]) {
				 min=arr[i];
			 }
		 }
		 
		   
			System.out.println("\n"+max); 
			System.out.println(min);
		
		 

	}

}
