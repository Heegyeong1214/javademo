package java007_class.part05;

public class CreditCard {
	String cardName; // 은행명
	String cardNum; // 계좌번호
	int pay; // 금액

	public CreditCard() {

	}

	public CreditCard(String cardName, String cardNum, int pay) {	
		this.cardName = cardName;
		this.cardNum = cardNum;
		this.pay = pay;
	}
	
	public String toString() {
		return String.format("%s %s %d", cardName, cardNum, pay);
	}	
	
}// end class



