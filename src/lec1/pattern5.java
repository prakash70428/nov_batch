package lec1;

import java.util.*;

public class pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scn = new Scanner(System.in);
	     int n = scn.nextInt();
	     
	     int row = 1;
	     int star = 1;
	     int space = 2*n - 3;
	     
	     while(row <= n) {
	    	 //star
	    	 int i = 1;
	    	 while(i <= star) {
	    		 System.out.print("* ");
	    		 i = i + 1;
	    	 }
	    	 //space
	    	 int j = 1;
	    	 while(j <= space) {
	    		 System.out.print("  ");
	    		 j = j + 1;
	    	 }
	    	 //star
	    	 int k = 1;
	    	 if(row == n) {
	    		 k = 2;
	    	 }
	    	 while(k <= star) {
	    		 System.out.print("* ");
	    		 k = k + 1;
	    	 }
	    	 //next row prepration
	    	 row = row + 1;
	    	 System.out.println();
	    	 star = star + 1;
	    	 space = space - 2;
	     }
	}

}
