import java.util.Scanner;

public class Example04_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int month;
		
		System.out.print("�п�J���=");
		month = sc.nextInt();
		
		if (month <= 3) {
			System.out.println("�K�u");
		}else if (month <= 6) {
			System.out.println("�L�u");
		}else if (month <= 9) {
			System.out.println("��u");
		}
		else if (month <= 12) {
			System.out.println("�V�u");
		}
	}

}
