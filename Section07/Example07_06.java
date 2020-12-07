package section07;
import java.util.Scanner;

public class Example07_06 {

	public static float BMI(float height, float weight) {
		return weight / (height*height);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float h, w;
		
		while(true) {
			System.out.print("請輸入身高(公尺)=");
			h = sc.nextFloat();
			System.out.print("請輸入體重(公斤)=");
			w = sc.nextFloat();
			System.out.printf("BMI=%4.1f\n",BMI(h,w));
			System.out.println("=====================");
		}
	}

}
