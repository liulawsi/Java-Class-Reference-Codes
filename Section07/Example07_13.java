package section07;



public class Example07_13 {

	static int score = 10;
	
	public static void func1(int score) {
		System.out.println("\tfunc1(int): (1)score="+score);
		score++;
		System.out.println("\tfunc1(int): (2)score="+score);
	}
	
	public static void func1() {
		int score = 99;
		System.out.println("\tfunc1(): score="+score);
		System.out.println("\tfunc1(): Example07_13.score="
				+Example07_13.score);
	}
	
	public static void main(String[] args) {
		int score = 20;
		System.out.println("Main: Example07_13.score="
							+Example07_13.score);
		System.out.println("Main: (1)score="+score);		
		func1(score);
		System.out.println("Main: (2)score="+score);
		func1();
	}

}
