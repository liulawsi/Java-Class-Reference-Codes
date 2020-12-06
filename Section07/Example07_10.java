import java.util.Scanner;

public class Example07_10 {

	public static int factor(int n) {
		if (n == 1) return 1;
		return n*factor(n-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N;
		
		while(true) {
			System.out.print("請輸入整數N=");
			N = sc.nextInt();
			System.out.println("N!="+factor(N));
			System.out.println();
		}
	}

}
