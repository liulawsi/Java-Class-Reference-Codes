package section03;

import java.util.Scanner;

public class Example03_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float a, b, c, s, ans;
		
		System.out.print("a=");
		a = sc.nextFloat();
		System.out.print("b=");
		b = sc.nextFloat();
		System.out.print("c=");
		c = sc.nextFloat();
		
		s=(a+b+c)/2;
		ans = s*(s-a)*(s-b)*(s-c);
		
		System.out.println("ans=" + ans);
	}
}

