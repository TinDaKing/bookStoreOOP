package backend_d7;

public class Location {
	private int ID;
	private String name;
	private String address;

	public Location() {
		// TODO Auto-generated constructor stub
	}

	public Location(int iD, String name, String address) {
		super();
		ID = iD;
		this.name = name;
		this.address = address;
	}

	public int getID() {
		return ID;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

}
