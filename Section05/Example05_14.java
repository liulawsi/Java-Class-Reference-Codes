import java.util.Scanner;

public class Example05_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i, N;
		
		do {
			System.out.print("請輸入整數N=");
			N = sc.nextInt();			
			i = 0;
			while(i < N) {
				System.out.print("＊");
				i++;
			}
			System.out.println();
		}while(N != 0);
		System.out.println("結束程式了！");
	}

}
