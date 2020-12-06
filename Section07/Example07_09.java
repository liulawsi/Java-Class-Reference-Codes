
public class Example07_09 {

	public static void swap(int a[]) {
		int temp;
		System.out.printf("\t[swap內 交換前]: a[0]=%d,  a[1]=%d\n", a[0], a[1]);
		temp = a[0];
		a[0] = a[1];
		a[1] = temp;
		System.out.printf("\t[swap內 交換後]: a[0]=%d,  a[1]=%d\n", a[0], a[1]);
	}
	public static void main(String[] args) {
		int A[] = new int[] {10,99};
	
		System.out.printf("[main 呼叫前]: A[0]=%d,  A[1]=%d\n", A[0], A[1]);
		swap(A);
		System.out.printf("[main 呼叫後]: A[0]=%d,  A[1]=%d\n", A[0], A[1]);
	}

}
