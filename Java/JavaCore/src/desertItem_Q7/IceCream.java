package desertItem_Q7;

public class IceCream extends DesetItem {
	
	public IceCream() {}

	public IceCream(double tax, double amount) {
		super(tax, amount);
	}
	
	@Override
	public double getCost() {
		double rupeePrice = getAmount()+getTax();
		return rupeePrice;
	}
}
