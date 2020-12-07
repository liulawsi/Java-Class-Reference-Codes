package section06;
import java.util.Scanner;

public class Example06_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numbers[] = new int[10];
		int target = 0;
		boolean found = false;
		for(int i = 0; i < 10; i++) {
			System.out.print("請輸入數字"+(i+1)+"=");
			numbers[i] = sc.nextInt();
		}
		System.out.println("=====================");
		while(true) {
			System.out.print("請輸入查詢數字=");
			target = sc.nextInt();
			found = false;
			for(int i = 0; i < 10; i++) {
				if (numbers[i] == target) found = true;
			}
			if (found) 
				System.out.println(target + "有");
			else
				System.out.println(target + "沒有");
		}
	}

}
