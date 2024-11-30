package com.akan;

public class MinMaxArr {
	
       public static void main(String [] arg) {
    	    int arr[] = {23,44,34,12,45};
    	    int max = arr[0]; 
    	     for(int i= 1; i< arr.length; i++) {
    	             if(arr[i] > max){
    	            	 max = arr[i];  }
    	            }
    	     System.out.println( " value " + max);
    	     }
       
//       for(int i= 1; i< arr.length; i++) {
//           if(arr[i] < min){
//          	 min = arr[i];  }
//          }
//   System.out.println( " value " + min);
//   }
       }

