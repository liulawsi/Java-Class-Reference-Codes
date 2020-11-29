import java.util.Scanner;

public class Example04_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int score;
		
		System.out.print("請輸成績=");
		score = sc.nextInt();
		
		if (score >=60) {
			System.out.println("及格！");
		}
		else {
			System.out.println("不及格！");
		}
	}

}
