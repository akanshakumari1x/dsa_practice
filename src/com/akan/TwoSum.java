package com.akan;

public class TwoSum {
	
	static boolean targetSum(int arr[],int target) {
		int size= arr.length;
		for(int i = 0;i<=size;i++) {
			 for(int j =i+1; j< size; j++) {
				if(target == arr[i]+ arr[j]) {
					return true; }
			}
		}
		return false; }
	
	public static void main(String ar[]) {
		int target = 20;
		int arr [] = {3,6,5,4,11,5};
		 if(targetSum(arr,target)){
			 System.out.println( " found the target " );}
		 else { System.out.println( " not found ");}
	}
	
	//second method 
	
	static boolean checkSum(int arr[], int target) {

    int size = arr.length;
	int left = arr[0];
	int right = arr.length-1;
	int sum =0;
	while(left <right) {
		sum = arr[left] + arr[right];
			 if(sum==target ) {
				return true;}
			 else if (sum< target ) {
				 left++;}
				 else
					 right--;	}
	return false;
}
//	public static void main(String ar[]) {
//		int arr [] = {2,4,6,7,8,10};
//		int target = 19;
//		if(checkSum(arr,target)){
//			System.out.println(" found the target ");
//		}else
//			System.out.println( " not found ");
//				
//	}
	
	
}
