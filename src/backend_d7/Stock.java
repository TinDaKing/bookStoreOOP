package backend_d7;

public class Stock {
	private int ISBN;
	private int locationID;
	private int quantity;

	public Stock() {
		// TODO Auto-generated constructor stub
	}

	public Stock(int iSBN, int locationID, int quantity) {
		super();
		ISBN = iSBN;
		this.locationID = locationID;
		this.quantity = quantity;
	}

}
