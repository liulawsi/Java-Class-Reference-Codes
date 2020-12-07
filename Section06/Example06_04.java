package section06;
import java.util.Scanner;

public class Example06_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numbers[] = new int[100];
		int N = 0, count = 0;
		
		while(true) {
			System.out.print("請輸入整數N=");
			N = sc.nextInt();
			count = 0;
			do {
				numbers[count] = N % 10;
				N = N / 10;
				count++;
			}while(N > 0);
			for(int i = 0; i < count ; i++) {
				System.out.print(""+numbers[i]);
			}
			System.out.println();
		}
	}

}
