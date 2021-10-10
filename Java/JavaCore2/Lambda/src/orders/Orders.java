package orders;

public class Orders {

	private int amount;
	private String status;
	
	public Orders() {}

	public Orders(int amount, String status) {
		this.amount = amount;
		this.status = status;
	}

	public int getAmount() {
		return amount;
	}

	public String getStatus() {
		return status;
	}

	@Override
	public String toString() {
		return "Orders [amount=" + amount + ", status=" + status + "]";
	}

}
