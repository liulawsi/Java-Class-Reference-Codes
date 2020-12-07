package section07;

public class Example07_08 {

	public static void swap(int a, int b) {
		int temp;
		System.out.printf("\t[swap內 交換前]: a=%d,  b=%d\n", a, b);
		temp = a;
		a = b;
		b = temp;
		System.out.printf("\t[swap內 交換後]: a=%d,  b=%d\n", a, b);
	}
	
	public static void func1(int a) {
		a++;
	}
	public static void main(String[] args) {
		
		int A=10, B=99;
		int C = 0;
	
		System.out.printf("[main 呼叫前]: A=%d,  B=%d\n", A, B);
		swap(A,B);
		System.out.printf("[main 呼叫後]: A=%d,  B=%d\n", A, B);
	}

}
