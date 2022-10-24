package backend_d7;

import java.util.Date;

public class Order {
	private int id;
	private Date time; // year, month, day, hour, min, sec
	private double totalPrice;

	public Order() {
		// TODO Auto-generated constructor stub
	}

	public Order(int id, Date time, double totalPrice) {
		super();
		this.id = id;
		this.time = time;
		this.totalPrice = totalPrice;
	}

}
