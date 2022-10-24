package backend_d7;

import java.util.Date;

public class ReturnDetail {
	private int borrowID;
	private int ISBN;
	private int quantity;
	private Date timeReturn; // year, month, day, hour, min, sec

	public ReturnDetail() {
		// TODO Auto-generated constructor stub
	}

	public ReturnDetail(int borrowID, int iSBN, int quantity, Date timeReturn) {
		super();
		this.borrowID = borrowID;
		ISBN = iSBN;
		this.quantity = quantity;
		this.timeReturn = timeReturn;
	}

	public int getBorrowID() {
		return borrowID;
	}

	public int getISBN() {
		return ISBN;
	}

	public int getQuantity() {
		return quantity;
	}

	public Date getTimeReturn() {
		return timeReturn;
	}

}
