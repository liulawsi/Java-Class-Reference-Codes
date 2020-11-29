import java.util.Scanner;

public class Example04_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int score;
		
		while(true) {
			System.out.print("請輸成績=");
			score = sc.nextInt();
		
			if (score >=90) {
				System.out.println(score +"分是A級");
			}else if (score >= 80) {
				System.out.println(score +"分是B級");
			}else if (score >= 70) {
				System.out.println(score +"分是C級");
			}else if (score >= 60) {
				System.out.println(score +"分是D級");
			}else {
				System.out.println(score +"分是E級");
			}
			System.out.println("-----------------");
		}
	}

}
