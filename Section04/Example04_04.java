import java.util.Scanner;

public class Example04_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		
		System.out.print("A=");
		a = sc.nextInt();
		System.out.print("B=");
		b = sc.nextInt();
		System.out.print("C=");
		c = sc.nextInt();
				
		if (a > b) {
			if (a > c) {
				System.out.println("The Max = " +a);
			}else {
				System.out.println("The Max = " +c);
			}
		}
		else {
			if (b > c) {
				System.out.println("The Max = " +b);
			}else {
				System.out.println("The Max = " +c);
			}
		}
	}

}
