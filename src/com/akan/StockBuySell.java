package com.akan;

public class StockBuySell {
	
	public static void main(String args[]) {
	
	int ar[] = {12,13,8,10,24,5};
	int size = ar.length;
    int res=0;
	
	for(int i =0; i<size-1; i++) {
		for(int j=i+1; j<size; j++) {
			// res = Math.max(res, ar[j]-ar[i]);
		    int diff = ar[j]-ar[i];
		    System.out.println( i +" "+ j +" "+ar[j] +"-"+ ar[i] +"="+ diff       + " "+ res);
		                if(res>diff){
		                    res =res;
		                }else{
		                    res = diff;
		                }
		}
	}
    
         System.out.println( " getting max profit "+ res);
	}
}
