package Human29;

public class Account {
	private int balance; //계좌잔고
		private final int MAX_BALANCE = 1000000;
		private final int MIN_BALANCE = 0;
		
	public Account () {
		this.balance=0;
	}
	


	public int getBalance() {
		return this.balance;
	}
	public void setBalance(int balance) {
		if(balance>MIN_BALANCE && balance< MAX_BALANCE) {
			this.balance=balance;
		}
		else {
			System.out.println("계좌 허용한도 이상 또는 이하의 값을 갖게 됩니다");
		}
		
	}

	
	
}
