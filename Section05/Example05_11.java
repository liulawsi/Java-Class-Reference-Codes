package section05;
import java.util.Scanner;

public class Example05_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		
		while(true) {
			System.out.print("請輸入整數N=");
			n = sc.nextInt();
			for(int i = 0; i < n; i++) {
				for(int w = 0; w < n-i-1; w++) {
					System.out.print("　");
				}
				for(int k = 0; k <= i; k++) {
					System.out.print("＊");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
