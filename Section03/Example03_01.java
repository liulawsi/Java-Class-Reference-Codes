import java.util.Scanner;

public class Example03_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int width, height;
		int area;
		
		System.out.print("請輸入長=");
		height = sc.nextInt();
		System.out.print("請輸入寬=");
		width = sc.nextInt();
		
		area = height * width;
		
		System.out.println("矩形面積=" + area);
	}

}
