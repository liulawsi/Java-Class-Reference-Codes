import java.util.Scanner;

public class Example05_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N, temp;
		
		while(true) {
			System.out.print("請輸入整數N=");
			N = sc.nextInt();
			temp = N;
			for(int i = 2; i < N; i++) {
				do {
					if (temp % i == 0) {
						temp = temp / i;
						System.out.print(i+",");
					}
				}while(temp % i == 0);
			}
			System.out.println();
		}
	}

}
