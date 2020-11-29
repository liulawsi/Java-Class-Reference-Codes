import java.util.Scanner;

public class Example04_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int choice;
		
		while(true) {
			System.out.println("1.全票, 2.優待票, 3.星光票");
			System.out.print("請輸入(1/2/3)：");
			choice = sc.nextInt();
		
			switch(choice) {
				case 1:
					System.out.println("全票一張300元");
					break;
				case 2:
					System.out.println("優待票一張250元");
					break;
				case 3:
					System.out.println("星光票一張200元");
					break;
				default:
					System.out.println("輸入錯誤！");
			}
			System.out.println("====================");
		}
	}

}
