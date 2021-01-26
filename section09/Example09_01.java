package section09;

import java.util.Scanner;

public class Example09_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String addr = "";
		String result = "";
		int[] numAddr = new int[4];
		
		while(true)
		{
			System.out.print("請輸入IP:");
			addr = sc.next();
			
			for(int i = 0; i < 3; i++)
			{
				int idx = addr.indexOf('.');
				String numStr = addr.substring(0,idx);
				addr = addr.substring(idx+1);
				numAddr[i] = Integer.parseInt(numStr);				
			}
			numAddr[3] = Integer.parseInt(addr);
			for(int i = 0; i < 3; i++)
				System.out.print(numAddr[i]+"::");
			System.out.println(numAddr[3]);
			/*
			//-----------------------------------
			addr = addr.replace(".", "::");
			System.out.println(addr);
			
			
			//-----------------------------------
			result = "";
			for(int i = 0; i < addr.length(); i++) {
				if (addr.charAt(i) == '.') {
					result = result + "::";
				}else
					result = result + addr.charAt(i);
			}
			System.out.println(result);
			*/
		}
	}

}
