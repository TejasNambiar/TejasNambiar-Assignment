package assignment1;

import java.util.Arrays;

public class LinearSearch {

	static int[] bubbleSort(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){
        	 for(int j=1; j < (n-i); j++){
        		 if(arr[j-1] > arr[j]){
        			 //swap elements  
                     temp = arr[j-1];  
                     arr[j-1] = arr[j];  
                     arr[j] = temp;
                 }              
             }  
         }
         return arr;
    }  
	
	public static void main(String[] args) {
		int[] numbers = {1,5,12,14,78,19,23,86,47};
		int search = 19;
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]==search)
				System.out.println("Found");
		}
		numbers = bubbleSort(numbers);
		System.out.println("Sorted Array: "+Arrays.toString(numbers));
	}

}
