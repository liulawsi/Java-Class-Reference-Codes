package section04;
import java.util.Scanner;

public class Example04_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b;
		
		System.out.print("A=");
		a = sc.nextInt();
		System.out.print("B=");
		b = sc.nextInt();
				
		if (a > b) {
			System.out.println("A > B");
		}
		if (a < b) {
			System.out.println("A < B");
		}
		if (a == b) {
			System.out.println("A = B");
		}
	}

}
