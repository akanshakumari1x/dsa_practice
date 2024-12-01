package com.akan;

public class Duplicate {

	public static void main(String []ar) {
		
		int arr[] = {1,4,5,7,4,5,8};
		int size = arr.length;
		
		for(int i=0; i< size; i++) {	
			for(int j = i+1; j<size ; j++) {
				 if(arr[i]==arr[j]) {
					 System.out.println(" duplicate elements found " + arr[i] );	 
				 }
			}
		}
		
	}
}
