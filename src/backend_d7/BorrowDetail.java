package backend_d7;

public class BorrowDetail {
	private int borrowID;
	private int ISBN;
	private int quantity;

	public BorrowDetail() {
		// TODO Auto-generated constructor stub
	}

	public BorrowDetail(int borrowID, int iSBN, int quantity) {
		super();
		this.borrowID = borrowID;
		ISBN = iSBN;
		this.quantity = quantity;
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

}
