import java.util.Scanner;

public class Example06_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numbers[] = new int[5];
		
		while(true) {
			for(int i = 0; i < 5; i++) {
				System.out.print("請輸入數字"+(i+1)+"=");
				numbers[i] = sc.nextInt();
			}
			System.out.println("=====================");
		
			for(int i = 0; i < 5; i++) {
				for(int k = i+1; k<5;k++) {
					System.out.print("("+numbers[i]+","+numbers[k]+"),");
				}
			}
			System.out.println();
		}
	}

}
