package ncs.test13;

import java.util.Date;

public class Inventory {

	String productName; //상품명
	Date putDate;		//입고일
	Date getDate;		//출고일
	int putAmount;		//입고수량
	int getAmount;		//출고수량
	int inventoryAmount;	//재고수량
	
	public Inventory() {
		
	}

	public Inventory(String productName, Date putDate, int putAmount) {
		super();
		this.productName = productName;
		this.putDate = putDate;
		this.putAmount = putAmount;
	}

	@Override
	public String toString() {
		return String.format("%s %date %date %d %d %d", productName,putDate, getDate, putAmount, getAmount,inventoryAmount);
	}
	
	public void setGetDate(Date setDate) {
		System.out.println(setDate);
	}
	
	public void setGetAmount(int getAmount) {
		System.out.println(putAmount-getAmount);
		
		if(getAmount > putAmount) {
			
		}
	}
	
}//end class
