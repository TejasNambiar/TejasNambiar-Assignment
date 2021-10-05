package desertItem_Q7;

public class Candy extends DesetItem{
	
	public Candy() {}
	
	public Candy(double tax, double amount) {
		super(tax, amount);
	}

	@Override
	public double getCost() {
		double dollarPrice = (double)1/60 * (getAmount()+getTax());
		return dollarPrice;
	}

}
