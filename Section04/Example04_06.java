import java.util.Scanner;

public class Example04_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int score;
		
		while(true) {
			System.out.print("�п馨�Z=");
			score = sc.nextInt();
		
			if (score >=90) {
				System.out.println(score +"���OA��");
			}else if (score >= 80) {
				System.out.println(score +"���OB��");
			}else if (score >= 70) {
				System.out.println(score +"���OC��");
			}else if (score >= 60) {
				System.out.println(score +"���OD��");
			}else {
				System.out.println(score +"���OE��");
			}
			System.out.println("-----------------");
		}
	}

}
