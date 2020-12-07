package section07;
import java.util.Scanner;

public class Example07_05 {

	public static void drawStarN(int n, boolean newline) {
		for(int i = 0; i < n; i++) {
			System.out.print("＊");
		}
		if (newline) System.out.println();
	}
	public static void drawSpaceN(int n, boolean newline) {
		for(int i = 0; i < n; i++) {
			System.out.print("　");
		}
		if (newline) System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N;
		
		while(true) {
			System.out.print("請輸入整數N=");
			N = sc.nextInt();
			for(int i = 0; i < N; i++) {
				drawStarN(i+1, false);
				drawSpaceN((N-i-1)*2, false);
				drawStarN(i+1, true);
			}
			System.out.println();
		}
	}

}
