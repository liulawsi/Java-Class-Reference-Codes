import java.util.Scanner;

public class Example04_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int score;
		
		System.out.print("�п馨�Z=");
		score = sc.nextInt();
		
		if (score >=60) {
			System.out.println("�ή�I");
		}
		else {
			System.out.println("���ή�I");
		}
	}

}
