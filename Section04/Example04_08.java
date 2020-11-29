import java.util.Scanner;

public class Example04_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int choice, number, money=0;
		
		while(true) {
			System.out.println("1.全票, 2.優待票, 3.星光票");
			System.out.print("請輸入(1/2/3)：");
			choice = sc.nextInt();
			System.out.print("請輸入買幾張：");
			number = sc.nextInt();
			
			switch(choice) {
				case 1:
					money = number * 300;
					break;
				case 2:
					money = number * 250;
					break;
				case 3:
					money = number * 200;
					break;
				default:
					System.out.println("輸入錯誤！");
					money = 0;
			}
			System.out.println("票價總額為 元" + money + "元");
		}
	}

}
