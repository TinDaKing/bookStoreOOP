package backend_d7;

import java.util.Date;

public class BorrowDataSource {
	public static Borrow[] borrows = { 
			new Borrow(1, 1, 1, new Date(2021 - 1900, 4, 28, 9, 43), 5),
			new Borrow(2, 3, 3, new Date(2021 - 1900, 8, 14, 10, 9), 2),
			new Borrow(3, 4, 2, new Date(2022 - 1900, 10, 4, 8, 45), 4) };

}
