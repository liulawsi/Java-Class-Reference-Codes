import java.util.Scanner;

public class Example03_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int score1, score2, score3;
		int total;
		
		System.out.print("�Ĥ@�즨�Z=");
		score1 = sc.nextInt();
		System.out.print("�ĤG�즨�Z=");
		score2 = sc.nextInt();
		System.out.print("�ĤT�즨�Z=");
		score3 = sc.nextInt();
		
		total = score1 + score2 + score3;
		
		System.out.println("�T�즨�Z�`�M=" + total);
	}

}
