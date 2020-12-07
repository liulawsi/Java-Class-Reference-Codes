package section07;
import java.util.Scanner;

public class Example07_04 {

	public static void drawStarN(int n) {
		for(int i = 0; i < n; i++) {
			System.out.print("＊");
		}
		System.out.println();
	}
	public static void drawSpaceN(int n) {
		for(int i = 0; i < n; i++) {
			System.out.print("　");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N;
		
		while(true) {
			System.out.print("請輸入整數N=");
			N = sc.nextInt();
			for(int i = 0; i < N; i++) {
				drawSpaceN(N-i-1);
				drawStarN(i+1);
			}
			System.out.println();
		}
	}

}
