package com.akan;
import java.util.*;
public class MovesZero {
	
	public static void main(String [] arg) {
	int arr [] = {2,5,6,0,8,0,9};
	
	int size = arr.length;
	int temp [] = new int[size];
	int j = 0;
	
	for(int i=0;i< size;i++) {
			if(arr[i]!= 0) {
				temp[j++] = arr[i];	
				System.out.println(" ok "+ arr[i]);
				}
			}
	for(int ar : temp) {
		System.out.println(ar); }
	}
	
}
