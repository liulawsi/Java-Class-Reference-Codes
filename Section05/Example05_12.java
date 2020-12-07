package section05;
import java.util.Scanner;

public class Example05_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N;
		boolean isPrime = true;
		
		while(true) {
			System.out.print("請輸入整數N=");
			N = sc.nextInt();
			for(int i = 2; i <= N; i++) {
				isPrime = true;
				for(int k = 2; k < i; k++) {
					if (i % k == 0) isPrime = false;
				}
				if (isPrime) System.out.print(i + ",");
			}
			System.out.println();
		}
	}

}
