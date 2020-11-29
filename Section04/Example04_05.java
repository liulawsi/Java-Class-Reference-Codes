import java.util.Scanner;

public class Example04_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int month;
		
		System.out.print("請輸入月份=");
		month = sc.nextInt();
		
		if (month <= 3) {
			System.out.println("春季");
		}else if (month <= 6) {
			System.out.println("夏季");
		}else if (month <= 9) {
			System.out.println("秋季");
		}
		else if (month <= 12) {
			System.out.println("冬季");
		}
	}

}
