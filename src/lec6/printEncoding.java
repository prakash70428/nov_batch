package lec6;

import java.util.*;

public class printEncoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		PrintEncoding(str,"");
	}
	
	public static void PrintEncoding(String str,String asf) {
	    if(str.length() == 0) {
	    	System.out.println(asf);
	    	return;
	    }
	    if(str.charAt(0) == '0') {
	    	return;
	    }
		
		String ch01 = str.substring(0,1);
		String ros1 = str.substring(1);
		PrintEncoding(ros1,asf + (char)(Integer.parseInt(ch01) - 1 + 'a'));
		
		if(str.length() >= 2) {
			String ch02 = str.substring(0,2);
			String ros2 = str.substring(2);
			if(Integer.parseInt(ch02) <= 26) {
				PrintEncoding(ros2,asf + (char)(Integer.parseInt(ch02) - 1 + 'a'));	
			}	
		}
			
	}

}
