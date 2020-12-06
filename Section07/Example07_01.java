import java.util.Scanner;

public class Example07_01 {

	public static void SayHi(String theName) {
		System.out.println("Hello, " + theName + " !");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name;
		
		System.out.print("請問大名是？");
		name = sc.nextLine();
		SayHi(name);
	}
}
