package section06;
import java.util.Scanner;

public class Example06_08a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n, count;
		while(true) {
			int numbers[] = new int[10];  //new後會同時歸0
			System.out.print("請輸入整數=");
			n = sc.nextInt();
			count = 0;
			while(n > 0) {
				numbers[count] = n % 10;
				n = n / 10;
				count++;
			}
			if (count < 9) {
				System.out.print("不足九位數！");
				continue;
			}
			int results[] = new int[10];  //new後會同時歸0
			for(int i = 0; i < 9; i++) {
				results[numbers[i]]++;
			}
			for(int i = 0; i < 10; i++) {
				if (results[i] == 0) System.out.println("少了"+ i);
			}
		}
	}

}
