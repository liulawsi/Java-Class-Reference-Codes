import java.util.Scanner;

public class Example05_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n, sum;
		
		while(true) {
			System.out.print("請輸入整數N=");
			n = sc.nextInt();
			sum = 0;
			for(int i = 1; i < n; i++) {
				System.out.print(i + "+");
				sum = sum + i;
			}
			sum = sum + n;
			System.out.println(n + "=" + sum);
		}
	}

}
