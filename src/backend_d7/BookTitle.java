package backend_d7;

public class BookTitle {
	private int ISBN;
	private String name;
	private String author;
	private double price;
	private int quantity;

	public BookTitle() {
		// TODO Auto-generated constructor stub
	}

	public BookTitle(int iSBN, String name, String author, double price, int quantity) {
		super();
		ISBN = iSBN;
		this.name = name;
		this.author = author;
		this.price = price;
		this.quantity = quantity;
	}

	public int getISBN() {
		return ISBN;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

}
