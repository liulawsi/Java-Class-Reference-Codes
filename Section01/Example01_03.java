package section01;
import java.util.Scanner;

public class Example01_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name;
		
		System.out.print("請問大名是？");
		name = sc.nextLine();
		System.out.println("Hello, " + name + " !");
	}

}
