package section10;

public class Example10_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IC_Card myCard;
		myCard = new IC_Card();
		
		myCard.account = "168800001";
		myCard.name = "¼B¤j«Ó";
		myCard.money = 1000000;
		
		System.out.println(myCard.account + "::" 
						+myCard.name + "˜¯NT$" 
						+ myCard.money);
		
		myCard.deposit(500);
		System.out.println(myCard.account + "::" 
				+myCard.name + "˜¯NT$" 
				+ myCard.money);
		
		myCard.Withdraw(5000);
		System.out.println(myCard.account + "::" 
				+myCard.name + "˜¯NT$" 
				+ myCard.money);
	}
}


