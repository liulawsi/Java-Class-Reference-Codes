package section05;
import java.util.Scanner;

public class Example05_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		
		while(true) {
			System.out.print("請輸入整數N=");
			n = sc.nextInt();
			System.out.print(n + "的因數有：");
			for(int i = 1; i < n; i++) {
				if (n % i == 0) System.out.print(i + ",");
			}
			System.out.println(n+"");
		}
	}

}
