package lec4;

import java.util.*;

public class max_of_an_array {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
	    for(int i=0;i < n;i++) {
	        arr[i] = scn.nextInt();
	    }
	    
	    int ans = maxinArray(arr,0);
	    System.out.println(ans);
	 }
	
	public static int maxinArray(int[] arr,int idx) {
		if(idx == arr.length) {
			return Integer.MIN_VALUE;
		}
//		if(idx == arr.length - 1) {
//			return arr[idx];
//		}
		
		int f1 = maxinArray(arr , idx + 1);
		int max = Math.max(arr[idx], f1);
		return max;
	}
}
