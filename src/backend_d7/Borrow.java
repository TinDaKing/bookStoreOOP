package backend_d7;

import java.util.Date;

public class Borrow {
	private int ID;
	private int cusID;
	private int locationID;
	private Date timeBorrow; // year, month, day, hour, min, sec
	private int totalBook;

	public Borrow() {
		// TODO Auto-generated constructor stub
	}

	public Borrow(int iD, int cusID, int locationID, Date timeBorrow, int totalBook) {
		super();
		ID = iD;
		this.cusID = cusID;
		this.locationID = locationID;
		this.timeBorrow = timeBorrow;
		this.totalBook = totalBook;
	}

	public int getID() {
		return ID;
	}

	public int getCusID() {
		return cusID;
	}

	public int getLocationID() {
		return locationID;
	}

	public Date getTimeBorrow() {
		return timeBorrow;
	}

	public int getTotalBook() {
		return totalBook;
	}

}
