package section06;
import java.util.Scanner;

public class Example06_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numbers[] = new int[10];
		int sum = 0;
		
		while(true) {
			for(int i = 0; i < 5; i++) {
				System.out.print("請輸入數字"+(i+1)+"=");
				numbers[i] = sc.nextInt();
			}
			System.out.println("=====================");
			sum = 0;
			for(int i = 0; i < 4; i++) {
				System.out.print(numbers[i]+",");
				sum = sum + numbers[i];
			}
			sum = sum + numbers[4];
			System.out.println(numbers[4]+"="+sum);
			System.out.println("平均="+(sum / 5));
		}
	}

}
