package section06;

public class Example06_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[][] = new int[10][10];
		
		for(int i = 0; i < 10; i++) {
			numbers[i][0] = numbers[i][i] = 1;
		}
		
		for(int i = 2; i < 10; i++) {
			for(int k = 1; k < i; k++) {
				numbers[i][k] = numbers[i-1][k-1] + numbers[i-1][k];
			}
		}
		
		for(int i = 0; i < 10; i++) {
			for(int k = 0; k <= i; k++) {
				System.out.printf("%5d",numbers[i][k]);
			}
			System.out.println();
		}
	}
}
