import java.util.Scanner;

public class Example03_00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int age;
		System.out.print("How old are you?");
		age = sc.nextInt();
		age = age + 10;
		System.out.println("After 10 years, your age will be " + age);
	}

}
