import java.util.Scanner;

public class Example03_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int width, height;
		int area;
		
		System.out.print("�п�J��=");
		height = sc.nextInt();
		System.out.print("�п�J�e=");
		width = sc.nextInt();
		
		area = height * width;
		
		System.out.println("�x�έ��n=" + area);
	}

}
