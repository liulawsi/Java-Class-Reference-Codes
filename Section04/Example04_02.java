package section04;
import java.util.Scanner;

public class Example04_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number;
		
		System.out.print("請輸入數字：");
		number = sc.nextInt();
		
		if (number % 2 == 0) System.out.println(+number+"是2的倍數");
		else System.out.println(+number+"不是2的倍數");
		if (number % 3 == 0) System.out.println(+number+"是3的倍數");
		else System.out.println(+number+"不是3的倍數");
	}

}
