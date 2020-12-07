package section06;
import java.util.Scanner;

public class Example06_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numbers[] = new int[10];
		
		for(int i = 0; i < 10; i++) {
			System.out.print("請輸入數字"+(i+1)+"=");
			numbers[i] = sc.nextInt();
		}
		System.out.println("=====================");
		for(int i = 0; i < 10; i++) {
			System.out.println(numbers[i]+",");
		}
	}

}
