import java.util.Scanner;

public class Example03_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int score1, score2, score3;
		int total;
		
		System.out.print("第一科成績=");
		score1 = sc.nextInt();
		System.out.print("第二科成績=");
		score2 = sc.nextInt();
		System.out.print("第三科成績=");
		score3 = sc.nextInt();
		
		total = score1 + score2 + score3;
		
		System.out.println("三科成績總和=" + total);
	}

}
