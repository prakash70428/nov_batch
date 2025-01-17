package lec4;

import java.util.*;

public class power_linear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        //System.out.println(power(x,n));
        System.out.println(powerlogarithm(x,n));
	}
	
	public static int power(int x,int n) {
		if(n == 0) {
			return 1;
		}
		
		int xpnm1 = power(x , n - 1);
		int xpn = xpnm1 * x;
		return xpn;		
	}
	
	public static int powerlogarithm(int x,int n) {
		if(n == 0) {
			return 1;
		}
		
		int xpnby2 = powerlogarithm(x , n/2);
		int xpn = xpnby2 * xpnby2;
		if(n%2 != 0) {
			xpn *= x;
		}
		
		return xpn;
	}

}
