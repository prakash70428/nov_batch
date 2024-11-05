package lec1;

import java.util.*;

public class function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r = scn.nextInt();
        
        int nf = 1;
        for(int i=1;i <= n;i=i+1) {
        	nf = nf * i;
        }
        
        int rf = 1;
        for(int i=1;i <= r;i=i+1) {
        	rf = rf * i;
        }
        
        int nmrf = 1;
        for(int i=1;i <= n-r;i=i+1) {
        	nmrf = nmrf * i;
        }
        
        int ans = nf/(rf * nmrf);
        System.out.println(ans);
	}

}
