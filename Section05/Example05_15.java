package section05;
import java.util.Scanner;

public class Example05_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int upper, lower, guess, bomb =77;
		while(true) {
			upper = 100;
			lower = 1;
			bomb = (int)(Math.random()*100+1);
			do {
				System.out.print("請輸入整數N("+lower+"~"+upper+")=");
				guess = sc.nextInt();
				if ((guess < lower) || (guess > upper)) {
					System.out.println("超出範圍！");
					continue;
				}else {
					if (guess < bomb) {
						lower = guess + 1;
					}else if (guess > bomb) {
						upper = guess - 1;
					}
				}
			}while(guess != bomb);
			System.out.println("！！！ 中了 ！！！");
		}
	}

}
