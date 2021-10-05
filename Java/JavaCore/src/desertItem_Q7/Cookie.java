package desertItem_Q7;

public class Cookie extends DesetItem {
	
	public Cookie() {}

	public Cookie(double tax, double amount) {
		super(tax, amount);
	}
	
	@Override
	public double getCost() {
		double euroPrice = (double)1/70 * (getAmount()+getTax());
		return euroPrice;
	}

}
