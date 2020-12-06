import java.util.Scanner;

public class Example07_07 {

	public static float pow(float x, int n) {
		float result = 1;
		for(int i = 0; i < n; i++) {
			result = result * x;
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float X;
		int n;
		
		while(true) {
			System.out.println("== 計算X的n次方 ==");
			System.out.print("請輸入X=");
			X = sc.nextFloat();
			System.out.print("請輸入n=");
			n = sc.nextInt();
			System.out.printf("%f^%d=%10.6f\n",X,n,pow(X,n));
		}
	}

}
