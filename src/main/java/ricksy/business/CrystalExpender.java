package ricksy.business;

import ricksy.business.CreditCard;

public class CrystalExpender implements GuestDispatcher {
	
	private int stock = 3;
	private double itemcost = 50;
	

	CrystalExpender(int stock, double itemcost) {
		this.stock = stock;
		this.itemcost = itemcost;
	}

	public void dispatch(CreditCard crecard) {
		if (crecard.credit >= itemcost) {
			this.stock -= 1; 
			if (stock > 0) {
				crecard.credit = crecard.credit - itemcost; 
			}
		}
		
	}	
	public int stock() {
		return this.stock;
	}
		

	@Override
	public String toString() {
		return "Stock: " + stock + "\n" + "cost: " + itemcost;
	}
}
