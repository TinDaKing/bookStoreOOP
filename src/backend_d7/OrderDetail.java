package backend_d7;

public class OrderDetail {
	private int orderID;
	private int ISBN;
	private int locationID;
	private int quantity;
	private double subTotal;

	public OrderDetail() {
		// TODO Auto-generated constructor stub
	}

	public OrderDetail(int orderID, int iSBN, int locationID, int quantity, double subTotal) {
		super();
		this.orderID = orderID;
		ISBN = iSBN;
		this.locationID = locationID;
		this.quantity = quantity;
		this.subTotal = subTotal;
	}

}
