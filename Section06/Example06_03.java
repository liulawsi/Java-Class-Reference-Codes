package section06;
import java.util.Scanner;

public class Example06_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numbers[] = new int[5];
		int max = 0;
		
		while(true) {
			for(int i = 0; i < 5; i++) {
				System.out.print("請輸入數字"+(i+1)+"=");
				numbers[i] = sc.nextInt();
			}
			System.out.println("=====================");
			max = numbers[0];
			for(int i = 1; i < numbers.length; i++) {
				if (numbers[i] > max) max = numbers[i];
			}
			System.out.println("最大值="+max);
		}
	}

}
