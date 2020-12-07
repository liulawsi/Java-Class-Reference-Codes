package section06;
import java.util.Scanner;

public class Example06_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numbers[];
		int N = 0;
		
		while(true) {
			System.out.print("請輸入整數N=");
			N = sc.nextInt();
			numbers = new int[N + 1];
			for(int i = 2; i <= N / 2; i++) {
				int index = i+i;
				while(index <= N) {
					numbers[index]++;
					index = index + i;
				}
			}
			for(int i = 2; i <= N ; i++) {
				if (numbers[i] == 0) System.out.print(i+",");
			}
			System.out.println();
		}
	}

}
