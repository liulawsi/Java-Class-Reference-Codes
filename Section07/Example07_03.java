package section07;
import java.util.Scanner;

public class Example07_03 {

	public static void drawStarN(int n) {
		for(int i = 0; i < n; i++) {
			System.out.print("＊");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N;
		
		while(true) {
			System.out.print("請輸入整數N=");
			N = sc.nextInt();
			for(int i = 1; i <= N; i++) {
				drawStarN(i);
			}
			for(int k = N-1; k > 0; k--) {
				drawStarN(k);
			}
			System.out.println();
		}
	}

}
