package section09;

import java.util.*;
import java.util.Scanner;

public class Example09_02 {

	public static int romanValue(char c) {
		switch(c) {
			case 'I':return 1;
			case 'V':return 5;
			case 'X':return 10;
			case 'L':return 50;
			case 'C':return 100;
			case 'D':return 500;
			case 'M':return 1000;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String romanStr = "";
		int total = 0;
		
		while(true) {
			System.out.print("請輸入羅馬數字=");
			romanStr = sc.next();
			total = 0;
			for(int i = 0; i < romanStr.length(); i++) {
	            int val1 = romanValue(romanStr.charAt(i));
	            int val2 = -1;
	            if (i < romanStr.length()-1)
	            	val2 = romanValue(romanStr.charAt(i+1));
	            
	            if(val1 < val2) {
	                total = total + val2-val1;
	                i++;
	            }
	            else
	                total = total +val1;
	        }
			System.out.println(total);
		}
	}
}
