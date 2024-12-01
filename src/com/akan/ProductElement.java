package com.akan;

import java.util.ArrayList;
import java.util.List;

public class ProductElement {
	
	public static void main(String []arg) {
		
		int  arr[] = {2,4,5,6,8,9};
		int size = arr.length;
		int temp [] = new int [arr.length];
		List l = new ArrayList();
		
		for(int i =0;i<= size-1; i++) {
		    int	res =1;
			 for(int j =0; j<size; j++) {
				  if(i!=j) {
					  res= arr[j]*res;
					  System.out.println( "j= " + j + " res = "+res);  }
			     }
			 temp[i] = res;
			 // l.add(res);	  
		}
		for(int i =0;i<temp.length; i++) {
			
			System.out.print(  " " + temp[i]);
		}
		
	}

}
