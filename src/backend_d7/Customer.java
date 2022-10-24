package backend_d7;

public class Customer {
	private int id;
	private String name;
	private String contactInfo;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(int id, String name, String contactInfo) {
		super();
		this.id = id;
		this.name = name;
		this.contactInfo = contactInfo;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getContactInfo() {
		return contactInfo;
	}

}
