
public class Example05_13b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i < 10; i++) {
			for(int k = 2; k < 6; k++) {
				System.out.print(k+"x"+i+"="+(i*k)+"\t");
			}
			System.out.println();
		}
		System.out.println();
		for(int i = 1; i < 10; i++) {
			for(int k = 6; k < 10; k++) {
				System.out.print(k+"x"+i+"="+(i*k)+"\t");
			}
			System.out.println();
		}
	}
}
