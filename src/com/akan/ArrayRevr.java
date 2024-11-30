package com.akan;

public class ArrayRevr {
	static void reverseArray (int[]arr) {
	//reverse of array
		int size = arr.length;
        int first = 0;
        int last = size - 1;
        while(first < last)  {
        	int temp = arr[first];
        	arr[first] = arr[last];
        	arr[last]= temp;    
        first++;
        last--;   }
	}
	
	public static void main(String arg[]) {
		int arr []= {23,44,34,67,89,45,12};
		//reverseArray(arr);	
    	for(int i =arr.length-1; i>=0; i--)
    		System.out.println( " elements of array "+ arr[i]);  
	}
}
