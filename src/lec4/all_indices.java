package lec4;

import java.util.*;

public class all_indices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i < n;i++) {
        	arr[i] = scn.nextInt();
        }
        
        int x = scn.nextInt();
        
        int[] sol = allIndixes(arr,0,0,x);
        for(int j=0;j < sol.length;j++) {
        	System.out.println(sol[j]);
        }
	}
	
	public static int[] allIndixes(int[] arr,int idx,int fsf,int x) {
		if(idx == arr.length) {
			int[] ans = new int[fsf];
			return ans;
		}
		
		if(arr[idx] == x) {
			fsf++;
		}
		int[] rr = allIndixes(arr,idx + 1,fsf,x);
		if(arr[idx] == x) {
			rr[fsf - 1] = idx;
		}
		
		return rr;
	}

}
