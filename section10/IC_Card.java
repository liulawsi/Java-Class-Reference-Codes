

public class IC_Card {
	String account;
	String name;
	int money;
	
	public void deposit(int m) {
		money = money + m;
	}
	
	public void Withdraw(int m) {
		money = money - m;
	}
	
	public int Balance() {
		return money;
	}
	
	public void SHowBalance() {
		System.out.println(account + " " + name + " NT$" + money);
	}
}


