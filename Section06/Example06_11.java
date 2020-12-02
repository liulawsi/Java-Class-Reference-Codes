
public class Example06_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int scores[][]={ {85,78,65},
       		 			 {75,85,69},
       		 			 {63,67,95},
       		 			 {94,92,88},
       		 			 {74,65,73} };
		String names[] = {"Jack", "Rose", "Peter", "Paul", "Sam"};
		String subjects[] = {"數學","英文","理化"};
		
		System.out.printf("%s\t","");
		for(int k = 0; k < 5; k++) {
			System.out.printf("%s\t",names[k]);
		}
		System.out.println();
		for(int i = 0; i < 3; i++) {
			System.out.printf("%s\t",subjects[i]);
			for(int k = 0; k < 5; k++) {
				System.out.printf("%d\t",scores[k][i]);
			}
			System.out.println();
		}
		System.out.println("==============================================");
		System.out.printf("%s\t","");
		for(int k = 0; k < 3; k++) {
			System.out.printf("%s\t",subjects[k]);
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.printf("%s\t",names[i]);
			for(int k = 0; k < 3; k++) {
				System.out.printf("%d\t",scores[i][k]);
			}
			System.out.println();
		}
	}

}
