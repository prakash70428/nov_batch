package lec1;

import java.util.*;

public class anybasetoD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        
        int ans = anybasetoDecimal(n,b);
        System.out.println(ans);
	}
	
	public static int anybasetoDecimal(int n,int b) {
		int ans = 0;
		int power = 1;
		
		while(n != 0) {
			int ld = n % 10;
			n = n / 10;
			
			ans = ans + (ld * power);
			power = power * b;
		}
		
		return ans;
	}

}
