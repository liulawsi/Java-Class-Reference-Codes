package section05;
import java.util.Scanner;

public class Example05_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n, result;
		
		while(true) {
			System.out.print("請輸入整數N=");
			n = sc.nextInt();
			result = 1;
			for(int i = 1; i < n; i++) {
				System.out.print(i + "x");
				result = result * i;
			}
			result = result * n;
			System.out.println(n + "=" + result);
		}
	}

}
