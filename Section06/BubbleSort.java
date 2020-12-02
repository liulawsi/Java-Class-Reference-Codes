import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numbers[] = new int[5];
		int n;
		
		for(int i = 0; i < 5; i++) {
			System.out.print("請輸入第"+(i+1)+"個整數=");
			numbers[i] = sc.nextInt();
		}
		
		for(int i = 0; i < numbers.length-1; i++) {
			for(int k = 0; k < numbers.length-i-1; k++) {
				if (numbers[k] > numbers[k+1]) {
					int temp = numbers[k];
					numbers[k] = numbers[k+1];
					numbers[k+1] = temp;
				}
			}
		}
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i]+",");
		}
	}

}
