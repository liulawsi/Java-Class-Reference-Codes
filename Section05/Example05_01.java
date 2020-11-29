import java.util.Scanner;

public class Example05_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		
		while(true) {
			System.out.print("請輸入整數N=");
			n = sc.nextInt();
			
			for(int i = 0; i < n; i++) {
				System.out.print("＊");
			}
			System.out.println();
		}
	}

}
