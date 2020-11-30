import java.util.Scanner;

public class Example05_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		
		while(true) {
			System.out.print("請輸入整數N=");
			n = sc.nextInt();
			for(int i = 0; i < n; i++) {
				for(int k = 0; k < n; k++) {
					System.out.print("＊");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
