package lec2;
import java.util.*;
public class array_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int[] arr = new int[n];
        
        //input
        for(int i=0;i < n;i++) {
        	arr[i] = scn.nextInt();
        }
        
        //display
        for(int i=0;i < n;i++) {
        	System.out.println(arr[i]);
        }
	}

}
