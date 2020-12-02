import java.util.Scanner;

public class Example06_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numbers[] = new int[] {1,2,4,8,13,33,25};
		int n;
		boolean found = false;
		
		while(true) {
			System.out.print("請輸入整數N=");
			n = sc.nextInt();
			found = false;
			for(int i = 0; i < numbers.length; i++) {
				for(int k = 0; k < numbers.length; k++) {
					if ((numbers[i]+numbers[k]) == n) {
						System.out.println(numbers[i]+"+"+numbers[k]
								+"="+(numbers[i]+numbers[k]));
						found = true;
					}
				}
			}
			if (!found) System.out.println("無解答！");
		}
	}

}
