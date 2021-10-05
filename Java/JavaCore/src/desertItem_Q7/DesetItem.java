package desertItem_Q7;

public abstract class DesetItem {
	
	private double tax;
	private double amount;
	
	public DesetItem() {}
	
	public DesetItem(double tax, double amount) {
		this.tax = tax;
		this.amount = amount;
	}
	
	public abstract double getCost();
	
	public double getTax() {
		return tax*getAmount();
	}
	
	public double getAmount() {
		return amount;
	}
}
