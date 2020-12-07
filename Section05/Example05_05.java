package section05;
import java.util.Scanner;

public class Example05_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a, n, result;
		
		while(true) {
			System.out.print("請輸入整數a=");
			a = sc.nextInt();
			System.out.print("請輸入整數N=");
			n = sc.nextInt();
			
			//result = (int)Math.pow(a, n);
			result = 1;
			for(int i = 0; i < n; i++) {
				result = result * a;
			}
			
			System.out.println(a + "的"+ n +"次方=" + result + "\n");
		}
	}

}
