package javasky;

public class array_0315_04 {

	public static void main(String[] args) {
		int arr[] = {12,41,52,64,63,21,34,67,98,99};
//		int copy[] = new int[10];
//		int max=0;
		 for(int i=0; i<10; i++) {
			 for(int j=0; j<9; j++) {
				 if(arr[j] > arr[j+1]){
					 int temp=0;
					 temp = arr[j];
					 arr[j] = arr[j+1];
					 arr[j+1] = temp;
					 
					 
				 }
				  
				 
			 }
			
		 }
		 
		 for(int j=0; j<10; j++) {
			System.out.print(arr[j]+ " ");
			 
		 }
		 

	}

}
